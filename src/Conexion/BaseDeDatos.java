package Conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;

public class BaseDeDatos 
{
    private Connection c;
    private String url, contra, user;
    
    public BaseDeDatos()
    {
        url="jdbc:sqlserver://192.168.137.160:1433;databaseName=Biblioteca;encrypt=true;trustServerCertificate=true";
    }
    
    public boolean conectar(String user, String contra)
    {
        this.contra=contra;
        this.user=user;
        
        try
        {
            c=DriverManager.getConnection(url, user, contra);
            return true;
            
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "User / Login Incorrecto\nIntente de nuevo" + "","Mal ingresado",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public CallableStatement getConexion(String procedimiento)
    {
        CallableStatement sentencia = null;
        try 
        {
            sentencia = c.prepareCall("{call "+procedimiento+"}");;
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
        return sentencia;
    }
    
    public void insertar_autor(String procedimiento_datos,String idautor,String autor)
    {
        CallableStatement sentencia = null;
        try 
        {
            sentencia=c.prepareCall("{call "+procedimiento_datos+"}");
            sentencia.setString(1, idautor);
            sentencia.setString(2, autor);
            
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(null, "La nueva Categoria se ha creado");
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error al insertar datos en la Tabla\n"+ex.getMessage());
        }
    }
    
    public void insertar_categoria(String procedimieto_datos,String categoria)
    {
        CallableStatement sentencia = null;
        try 
        {
            sentencia=c.prepareCall("{call "+procedimieto_datos+"}");
            sentencia.setString(1, categoria);
            
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(null, "La nueva Categoria se ha creado");
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error al insertar datos en la Tabla\n"+ex.getMessage());
        }
    }
    
    public void insertar_editoriales(String procedimiento_datos,String editorial,String direccion,String telefono,String email)
    {
        CallableStatement sentencia = null;
        try 
        {
            sentencia=c.prepareCall("{call "+procedimiento_datos+"}");
            sentencia.setString(1, editorial);
            sentencia.setString(2, direccion);
            sentencia.setString(3, telefono);
            sentencia.setString(4, email);
            
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(null, "La nueva Categoria se ha creado");
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error al insertar datos en la Tabla\n"+ex.getMessage());
        }
    }
    
    public void insertar_usuarios(String procedimiento_datos,String dni,String usuario,String contra,String pnombre,String snombre,String papellido,String sapellido,String direccion,String telefono,String observaciones)
    {
        CallableStatement sentencia = null;
        try 
        {
            sentencia=c.prepareCall("{call "+procedimiento_datos+"}");
            sentencia.setString(1, dni);
            sentencia.setString(2, usuario);
            sentencia.setString(3, contra);
            sentencia.setString(4, pnombre);
            sentencia.setString(5, snombre);
            sentencia.setString(6, papellido);
            sentencia.setString(7, sapellido);
            sentencia.setString(8, direccion);
            sentencia.setString(9, telefono);
            sentencia.setString(10,observaciones);
            
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(null, "La nueva Categoria se ha creado");
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error al insertar datos en la Tabla\n"+ex.getMessage());
        }
    }
    
    public void insertar_libros(String procedimiento_datos,String isbn,String titulo,String fechaLanzamiento,int categoria,int editorial,int existencia,String idioma,int paginas,String descripcion)
    {
        CallableStatement sentencia = null;
        try 
        {
            sentencia=c.prepareCall("{call "+procedimiento_datos+"}");
            sentencia.setString(1, isbn);
            sentencia.setString(2, titulo);
            sentencia.setString(3, fechaLanzamiento);
            sentencia.setInt(4, categoria);
            sentencia.setInt(5, editorial);
            sentencia.setInt(6, existencia);
            sentencia.setString(7, idioma);
            sentencia.setInt(8, paginas);
            sentencia.setString(9, descripcion);
            
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(null, "Se ha guardado la informacion del libro");
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error al insertar datos en la Tabla\n"+ex.getMessage());
        }
    }
    
    public void BorrarLibro(String procedimiento, String isbn)
    {
        CallableStatement sentencia = null;
        try 
        {
            sentencia=c.prepareCall("{call "+procedimiento+"}");
            sentencia.setString(1, isbn);
            
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(null, "Peticion Realizada");
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error, el producto no se pudo borrar\n"+ex.getMessage());
        }
    }
    
    public void ModificarLibro(String procedimiento, String isbn,int editorial,String descripcion)
    {
        CallableStatement sentencia = null;
        try 
        {
            sentencia=c.prepareCall("{call "+procedimiento+"}");
            sentencia.setString(1, isbn);
            sentencia.setInt(2, editorial);
            sentencia.setString(3,descripcion);
            
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(null, "Peticion Realizada");
        }catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error, No se puede modificar\n"+ex.getMessage());
        }
    }
    
    public void insertar_revistas(String procedimiento_datos,String issn,String titulo,int fasciculos,int volumen,String publicacion,int editorial,int tipo,int existencia,String idioma,String temas)
    {
        CallableStatement sentencia = null;
        try 
        {
            sentencia=c.prepareCall("{call "+procedimiento_datos+"}");
            sentencia.setString(1, issn);
            sentencia.setString(2, titulo);
            sentencia.setInt(3, fasciculos);
            sentencia.setInt(4, volumen);
            sentencia.setString(5, publicacion);
            sentencia.setInt(6, editorial);
            sentencia.setInt(7, tipo);
            sentencia.setInt(8, existencia);
            sentencia.setString(9, idioma);
            sentencia.setString(10, temas);
                        
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(null, "Peticion Realizada");
        }catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error, No se ha podido guardar\n"+ex.getMessage());
        }
    }
    
    public void BorrarRevista(String procedimiento, String issn)
    {
        CallableStatement sentencia = null;
        try 
        {
            sentencia=c.prepareCall("{call "+procedimiento+"}");
            sentencia.setString(1, issn);
            
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(null, "Peticion Realizada");
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error, el producto no se pudo borrar\n"+ex.getMessage());
        }
    }
    
    public void ModificarRevista(String procedimiento, String issn,int editorial,int categoria)
    {
        CallableStatement sentencia = null;
        try 
        {
            sentencia=c.prepareCall("{call "+procedimiento+"}");
            sentencia.setString(1, issn);
            sentencia.setInt(2, editorial);
            sentencia.setInt(3, categoria);
            
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(null, "Peticion Realizada");
        }catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error, No se puede modificar\n"+ex.getMessage());
        }
    }
    
    public CallableStatement buscarLibro(String procedimiento,String titulo,String autor,int categoria)
    {
        CallableStatement sentencia=null;
        try
        {
            sentencia=c.prepareCall("{call " + procedimiento+"}");
            sentencia.setString(1,titulo);
            sentencia.setString(2,autor);
            sentencia.setInt(3,categoria);
            
            JOptionPane.showMessageDialog(null, "Peticion Realizada");
        }catch(SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error, Error\n"+ex.getMessage());
        }       
        return sentencia;
    }
    
    public CallableStatement buscarRevista(String procedimiento,String titulo,int categoria)
    {
        CallableStatement sentencia=null;
        try
        {
            sentencia=c.prepareCall("{call " + procedimiento+"}");
            sentencia.setString(1,titulo);
            sentencia.setInt(2,categoria);
            
            JOptionPane.showMessageDialog(null, "Peticion Realizada");
        }catch(SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error, Error\n"+ex.getMessage());
        }       
        return sentencia;
    }
    
    public void PrestamoLibro(String procedimiento,int idusuario,String isnb,String tipo)
    {
       CallableStatement sentencia = null;
        try 
        {
            sentencia=c.prepareCall("{call "+procedimiento+"}");
            sentencia.setInt(1, idusuario);
            sentencia.setString(2, isnb);
            sentencia.setString(3, tipo);
            
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(null, "Peticion Realizada");
        }catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error, No se puede modificar\n"+ex.getMessage());
        } 
    }
    
    public void PrestamoRevista(String procedimiento,int idusuario,String isnb,String tipo)
    {
       CallableStatement sentencia = null;
        try 
        {
            sentencia=c.prepareCall("{call "+procedimiento+"}");
            sentencia.setInt(1, idusuario);
            sentencia.setString(2, isnb);
            sentencia.setString(3, tipo);
            
            sentencia.execute();
            sentencia.close();
            JOptionPane.showMessageDialog(null, "Peticion Realizada");
        }catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error, No se puede modificar\n"+ex.getMessage());
        } 
    }
    
    public boolean CrearUsuarios(String cedula,String usu,String contra,String pn,String sn,String pa,String sa,String direccion,String telefono)
    {
        try 
        {
            CallableStatement sentencia = null;
            sentencia=c.prepareCall("{? = call CrearUsuarios(?,?,?,?,?,?,?,?,?)}");
            sentencia.registerOutParameter(1,Types.BOOLEAN);
            sentencia.setString(2,cedula);
            sentencia.setString(3,usu);
            sentencia.setString(4,contra);
            sentencia.setString(5,pn);
            sentencia.setString(6,sn);
            sentencia.setString(7,pa);
            sentencia.setString(8,sa);
            sentencia.setString(9,direccion);
            sentencia.setString(10,telefono);
            
            sentencia.execute();
            boolean retorno=sentencia.getBoolean(1);
            JOptionPane.showMessageDialog(null, "Peticion Realizada");
            return retorno;
            
        }catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error, No se puede modificar\n"+ex.getMessage());
        } 
        return false;
    }
}
