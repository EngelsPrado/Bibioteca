create database Biblioteca

use Biblioteca


--Autores se mostrara con un select en las interfaces
create table Autores(
idAutor int identity(1,1) primary key not null,
Autor nvarchar (70) not null 
)

--
insert into Autores values('Gabriel Garcia'),('Ruben Dario'),('Javier Santaolalla')
insert into Autores values ('Javier Santaolalla')
select *from Autores

--Categorias se mostrara con un select en las interfaces
create table Categorias(
idCategoria int identity(1,1) primary key not null,
Categoria nvarchar(50) not null
)



insert into Categorias values ('Ciencia'),('Ficcion'),('Fisica')

--Editoriales se mostrara con un select en las interfaces
create table Editoriales(
idEditorial int identity(1,1)primary key not null,
Editorial nvarchar(50) not null,
Direccion text not null,
telefono  char(8) check (telefono like '[5|7|8][0-9][0-9][0-9][0-9][0-9][0-9][0-9]') not null,
email varchar(40) null
)

insert into Editoriales values('San jeronimo','Conchita palacios','75549314','')

drop table Usuarios

create table Usuarios(
idUsuario int identity(1,1) primary key not null,
DNI char(16) check (DNI like '[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][A-Z]') unique not null,
usuario varchar(30)not null,
contrasenia varbinary (max) not null,
PNombre varchar(40) not null,
Snombre varchar(40) null,
Papellido varchar(40) not null,
Sapellido varchar(40) null,
Direccion text not null,
telefono  char(8) check (telefono like '[5|7|8][0-9][0-9][0-9][0-9][0-9][0-9][0-9]') not null,
Observaciones text null
)


go
create proc InsertarUsuario
@dni char(16),@user varchar(16),@contra varbinary(max),
@Pnombre varchar(40),@Snombre varchar(40),@Papellido varchar(40),
@Sapellido varchar(40),@direccion varchar(max),@telefono char(8)
as
   insert into Usuarios (DNI,usuario,contrasenia,PNombre,Snombre,Papellido,Sapellido,Direccion,telefono) values (@dni,@user,@contra,@Pnombre,@Snombre,@Papellido,@Sapellido,@direccion,@telefono) 


go

select dbo.ValidarUsuario('engels')

insert into Usuarios values('001-130297-0025J','engels', HashBytes('MD5','amores'),'Engels','','Prado','','Villa','75549314','')
select *from Usuarios
go
create function ValidarUsuario(
@user varchar(40))
returns bit 
as
begin
   if exists (select usuario from Usuarios where usuario=@user)
   begin
      return 0
   end
   else
      begin
		 return 1
	  end 
	  return 0
end
go



delete Usuarios where usuario='Engels'

select *from Usuarios

create table Libros(
ISBN char(13) check (ISBN like '[0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9]') primary key not null,
titulo nvarchar(40) not null,
FechaLanzamiento date not null,
Categoria int not null,
Editorial int not null,
existencia int check (existencia >0) not null,
idioma char (3) check (idioma in ('esp','ing')) not null,
Paginas int check (Paginas >0 )null,
Descripcion text null,
estado bit default 1,
foreign key (Categoria) references Categorias(idCategoria),
foreign key (Editorial) references Editoriales(idEditorial), 
)

insert into Libros (ISBN,titulo,FechaLanzamiento,Categoria,Editorial,existencia,idioma,Paginas,Descripcion)values ('001-002-003-1','Boson de Higs','19-02-17',1,1,100,'esp',345,'Libro sobre fisica cuantica')
select *from Libros


SELECT HashBytes('MD5','amores')
SELECT CONVERT(NVARCHAR(max),HashBytes('MD5', 'amores'),2)

create table Libros_Autores(
ISBN char (13) not null,
Autor int not null,
foreign key (ISBN) references Libros(ISBN),
foreign key (Autor) references Autores(idAutor),
primary key(ISBN,Autor)
)

insert into Libros_Autores values ('001-002-003-1',1)
select *from Libros_Autores

create table Categorias_Revistas(
idCategoria int identity(1,1) primary key not null,
Categoria   varchar(40) not null,

)
insert into Categorias_Revistas values ('Comida'),('Ocio'),('Entretenimiento')
--Categorias_Revistas se mostrara con un select en las interfaces

create table Revistas(
ISSN char(14) check (ISSN like '[i][s][s][n]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9|x]') primary key not null,
titulo nvarchar (50) not null,
numeroFasciculos int not null,
volumen int not null,
publicacion date not null,
Editorial int not null,
tipo int,
existencia int check (existencia >0) not null,
idioma char (3) check (idioma in ('esp','ing')) not null,
temas text not null,
estado bit default 1,
foreign key (Editorial) references Editoriales(idEditorial),
foreign key (tipo) references Categorias_Revistas(idCategoria),

)

insert into Revistas values ('issn-1111-1111','Almanaque',100,2,'2012-02-13',1,1,100,'esp','mi picha',1)


drop table PrestamosLibros
select *from PrestamosLibros
create table PrestamosLibros(
idPrestamo int identity(1,1) not null,
idUsuario int not null,
idLibro char(13) not null,
tipo char (3) check (tipo in('sal','dom')) not null,
fechaSalida datetime not null, 
fechaDevolucion datetime null,
primary key(idPrestamo),
foreign key(idUsuario) references Usuarios(idUsuario),
foreign key (idLibro) references Libros(ISBN)
)

--Recibimos el id del usuario para consultar el estado de sus prestamos

go
alter proc consultaUsuario
@iduser int
as
   if exists(select idUsuario from Usuarios where idUsuario=@iduser)
   begin
       select PL.idPrestamo,PL.idLibro, PL.tipo,PL.fechaSalida,PL.fechaDevolucion,L.titulo,E.Editorial,C.Categoria from PrestamosLibros PL join Libros L on PL.idLibro=L.ISBN
	   join Editoriales E on L.Editorial=E.idEditorial join Categorias C on L.Categoria=C.idCategoria
	   where PL.idUsuario=@iduser
   end
   
go

go
alter proc MostrarUsuarios
as
  
   select idUsuario,DNI,usuario,PNombre,Papellido,Direccion,telefono,Observaciones from Usuarios
go


--Obtener el ID del usuario logeado
go
create proc obtenerID
@user varchar(30)
as
    if exists(select usuario from Usuarios where usuario=@user)
	begin
	     select idUsuario from Usuarios where usuario=@user
	end
   
go

insert into PrestamosLibros(idUsuario,idLibro,tipo,fechaSalida) values (1,'001-002-003-1','dom',GETDATE())

select *from PrestamosLibros

update PrestamosLibros set fechaDevolucion=GETDATE() where idPrestamo=2

drop table PrestamosRevistas

create table PrestamosRevistas(
idPrestamo int identity(1,1) not null,
idUsuario int not null,
idRevista char(14) not null,
tipo char (3) check (tipo in('sal','dom')) not null,
fechaSalida datetime not null, 
fechaDevolucion datetime null,
primary key(idPrestamo),
foreign key(idUsuario) references Usuarios(idUsuario),
foreign key (idRevista) references Revistas(ISSN)
)

--Procedimientos almacenados


declare @pass as nvarchar(max)
set @pass=CONVERT(NVARCHAR(max),0x5D9AA1BC9EA084A3421C3341011E2482,2)
select @pass
select *from Usuarios where usuario='xgame' and @pass='5D9AA1BC9EA084A3421C3341011E2482'

select dbo.inicioSesion('xgames','5D9AA1BC9EA084A3421C3341011E2482')

go
alter function inicioSesion( @user varchar(30), @pass varchar (max))
returns bit
as
begin
    
	   declare @contra as nvarchar(max)
       declare @param as varbinary(max)

    if exists(select *from Usuarios where usuario=@user )
	begin
	  set @param=(select contrasenia from Usuarios where usuario=@user) 
	  set @contra=(select CONVERT(NVARCHAR(max),@param,2)) 

	  if @contra=@pass
       return 1
       else
	       return 0
	end
   return 0 
end
go

go
  create proc MostrarCategoriasRevistas
  as
   select * from Categorias_Revistas

go

go
create proc MostrarAutores
as
  
   select *from Autores 
go

go
create proc MostrarCategorias
as
 select *from Categorias
go

--Busqueda por titulo,autor o categoria
-- Recibimos la categoria como entero porque en la interfaz habra un select
go
alter proc BuscarLibro
@titulo nvarchar(40),
@autor nvarchar(70),
@cat int 
as
   
   if (@titulo !='' and @autor!='' and exists(select idCategoria from Categorias where idCategoria=@cat))
   begin
     select L.ISBN,L.titulo,L.FechaLanzamiento,L.Categoria,L.Editorial,L.existencia,L.idioma,L.Paginas,L.Descripcion,A.Autor from libros L join Libros_Autores LA on L.ISBN=LA.ISBN join Autores A on A.idAutor=LA.Autor where A.Autor like @autor+'%' and L.titulo like @titulo+'%' and L.Categoria=@cat
   end
   else
       begin
	        if Exists (select idCategoria from Categorias where idCategoria=@cat )  and @autor!=''
		     begin
			      select *from Libros L  join Libros_Autores LA on L.ISBN=LA.ISBN join Autores A on LA.Autor=A.idAutor where L.Categoria=@cat and A.Autor like  @autor+'%'
			 end
			 else
			     begin
				   if (@autor !='' and @titulo!='')
				   begin
				          select L.ISBN,L.titulo,L.FechaLanzamiento,L.Categoria,L.Editorial,L.existencia,L.idioma,L.Paginas,L.Descripcion,A.Autor from libros L join Libros_Autores LA on L.ISBN=LA.ISBN join Autores A on A.idAutor=LA.Autor where A.Autor like @autor+'%' and L.titulo like @titulo+'%'
 
				   end
				   else
				       begin
					      if( @titulo!='' and exists(select idCategoria from Categorias where idCategoria=@cat))
						  begin
						       select L.ISBN,L.titulo,L.FechaLanzamiento,L.Categoria,L.Editorial,L.existencia,L.idioma,L.Paginas,L.Descripcion,A.Autor from libros L join Libros_Autores LA on L.ISBN=LA.ISBN join Autores A on A.idAutor=LA.Autor where L.titulo like @titulo+'%' and L.Categoria=@cat

						  end
						  else
						   begin
						         if @titulo !=''
								 begin
								   select L.ISBN,L.titulo,L.FechaLanzamiento,L.Categoria,L.Editorial,L.existencia,L.idioma,L.Paginas,L.Descripcion,A.Autor from libros L join Libros_Autores LA on L.ISBN=LA.ISBN join Autores A on A.idAutor=LA.Autor where L.titulo like @titulo+'%' 
								 end
								 else
								      begin
									    if @autor!=''
										begin
										   select L.ISBN,L.titulo,L.FechaLanzamiento,L.Categoria,L.Editorial,L.existencia,L.idioma,L.Paginas,L.Descripcion,A.Autor from libros L join Libros_Autores LA on L.ISBN=LA.ISBN join Autores A on A.idAutor=LA.Autor where A.Autor like @autor+'%' 
										end
										else
										    begin
											   if exists(select idCategoria from Categorias where idCategoria=@cat)
											      select L.ISBN,L.titulo,L.FechaLanzamiento,L.Categoria,L.Editorial,L.existencia,L.idioma,L.Paginas,L.Descripcion,A.Autor from libros L join Libros_Autores LA on L.ISBN=LA.ISBN join Autores A on A.idAutor=LA.Autor where L.Categoria=@cat
											end
									  end
						   end

					   end
				 end  
	   end 
go

go
create proc  BuscarRevista
 @titulo nvarchar(50),
 @tipo int
 as
    
	
	if(@titulo!='' and exists(select idCategoria from Categorias_Revistas where idCategoria=@tipo))
	begin
	     select *from Revistas where titulo like @titulo+'%' and tipo=@tipo
	end
	else
	     begin
		       if @titulo!=''
			   begin
			      select *from Revistas where titulo like @titulo+'%'
			   end
			   else
			       select *from Revistas where tipo=@tipo
		 end
	 
go

go
 create proc PrestamoRevista
  @idUsuario int,@idRevista char(14),
  @tipo char(3)
  as
  
  declare @existencia as int
  set @existencia=(select existencia from Revistas where ISSN=@idRevista);

  if(@existencia>0)
  begin
      insert into PrestamosRevistas(idUsuario,idRevista,tipo,fechaSalida) values (@idUsuario,@idRevista,@tipo,GETDATE())
  end
  else
      print 'Existencias agotadas' 

go

go
 create proc PrestamoLibro
  @idUsuario int,@idLibro char(13),
  @tipo char(3)
  as
  
  declare @existencia as int
  set @existencia=(select existencia from Libros where ISBN=@idLibro);

  if(@existencia>0)
  begin
      insert into PrestamosLibros (idUsuario,idLibro,tipo,fechaSalida) values (@idUsuario,@idLibro,@tipo,GETDATE())
  end
  else
      print 'Existencias agotadas' 

go


go
alter proc InsertarRevistas 
 @issn char(14),@titulo nvarchar(14),@numF int,
 @vol int,@fecha date,@editorial int,@existencia int,@tipo int,
 @idioma char(3),@temas text
 as

 insert into Revistas (ISSN,titulo,numeroFasciculos,volumen,publicacion,Editorial,existencia,tipo,idioma,temas)
 values (@issn,@titulo,@numF,@vol,@fecha,@editorial,@existencia,@tipo,@idioma,@temas)

go

go
create proc BorrarRevistas @issn char(14)
as
    declare @estado as int
	set @estado=(select estado from Revistas where ISSN=@issn)

	if @estado!=0
	begin
	     update Revistas set estado=0 where ISSN=@issn
	end
	else
	    print 'No existe la revista'

go
go
create proc BorrarLibros @isbn char(13)
as

 declare @estado as int
	set @estado=(select estado from Libros where ISBN=@isbn)

	if @estado!=0
	begin
	     update Libros set estado=0 where ISBN=@isbn
	end
	else
	    print 'No existe el libro'

go

go
alter proc InsertarLibros
 @ISBN char(13), @titulo nvarchar(14),@fecha date,@cat int,@editorial int,@existencia int 
 , @idioma varchar(30), @paginas int, @desc text
 as
  
 insert  into Libros(ISBN,titulo,FechaLanzamiento,Categoria,Editorial,existencia,idioma,Paginas,Descripcion) values (@ISBN,@titulo,@fecha,@cat,@editorial,@existencia,@idioma,@paginas,@desc)

go

go
create procedure VerLibros
as
  select *from Libros;
go

go
create procedure ModificarLibros @id char(13), @editorial int, @desc text
as
  
   if @editorial >0 and convert(varchar,@desc) != ''
   begin
        update Libros set Libros.Editorial=@editorial where ISBN=@id;
		update Libros set Descripcion=@desc where ISBN=@id;
   end 
   else 
       begin
	     if convert(varchar,@desc) != ''
		 begin
		   update Libros set Descripcion=@desc where ISBN=@id;
		 end
		 else
		     if @editorial>0
			 begin
			 update Libros set Libros.Editorial=@editorial where ISBN=@id;
			 end
	   end
go

go
create procedure ModificarRevistas @id char(14), @editorial int, @tipo int
as
  
   if @editorial >0 and @tipo>0
   begin
        update Revistas set Revistas.Editorial=@editorial where ISSN=@id;
		update Revistas set tipo=@tipo where ISSN=@id;
   end 
   else 
       begin
	     if @tipo >0
		 begin
		   update Revistas set tipo=@tipo where ISSN=@id;
		 end
		 else
		     if @editorial>0
			 begin
			 update Revistas set Revistas.Editorial=@editorial where ISSN=@id;
			 end
	   end
go

go
create procedure VerRevistas
as 
  select *from Revistas;
go

--Triggers

--Probar con before
create trigger actualizarExistenciaLibros
on PrestamosLibros
for insert,update
as
begin
      declare @isbn char(13)
	  
     if ((select fechaDevolucion from inserted) is not null)
	 begin
	              print 'Act' 
	              set @isbn= (select idLibro from inserted)
                  update Libros set existencia=existencia+1 where ISBN=@isbn
	 end
	  else
	      begin
		           print 'Insert'
	              set @isbn= (select idLibro from inserted)
                  update Libros set existencia=existencia-1 where ISBN=@isbn
		  end 
end


go
create trigger actualizarExistenciaRevistas
on PrestamosRevistas
for insert,update
as
  declare @issn char(13)
	  
     if ((select fechaDevolucion from inserted) is not null)
	 begin
	              print 'Act' 
	              set @issn= (select idRevista from inserted)
                  update Revistas set existencia=existencia+1 where ISSN=@issn
	 end
	  else
	      begin
		           print 'Insert'
	              set @issn= (select idRevista from inserted)
                  update Revistas set existencia=existencia-1 where ISSN=@issn
		  end 
go
