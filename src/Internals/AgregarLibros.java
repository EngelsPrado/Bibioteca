package Internals;

import Conexion.BaseDeDatos;
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AgregarLibros extends javax.swing.JInternalFrame 
{
    BaseDeDatos c;
    public AgregarLibros() 
    {
        initComponents();
        JTextFieldDateEditor editor = (JTextFieldDateEditor) Fechajdc.getDateEditor();
        editor.setEnabled(false);
    }
    
    public void setC(BaseDeDatos c) 
    {
        this.c = c;
        cargarCategorias();
        cargarEditorial();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulolbl = new javax.swing.JLabel();
        Titulotxt = new javax.swing.JTextField();
        Lanzamientolbl = new javax.swing.JLabel();
        Fechajdc = new com.toedter.calendar.JDateChooser();
        ISBNlbl = new javax.swing.JLabel();
        Codigoftxt = new javax.swing.JFormattedTextField();
        Existencialbl = new javax.swing.JLabel();
        Existenciatxt = new javax.swing.JTextField();
        Descripcionlbl = new javax.swing.JLabel();
        Descripcionspn = new javax.swing.JScrollPane();
        Descripciontxa = new javax.swing.JTextArea();
        Paginaslbl = new javax.swing.JLabel();
        Paginastxt = new javax.swing.JTextField();
        Idiomalbl = new javax.swing.JLabel();
        Idiomascmb = new javax.swing.JComboBox<>();
        Editoriallbl = new javax.swing.JLabel();
        editorial = new javax.swing.JComboBox<>();
        Categorialbl = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        Guardarbtn = new javax.swing.JButton();
        Limpiarbtn = new javax.swing.JButton();
        Encabezadolbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Agregar libro");

        jPanel1.setBackground(new java.awt.Color(35, 53, 103));

        Titulolbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Titulolbl.setForeground(new java.awt.Color(255, 255, 255));
        Titulolbl.setText("Titulo: ");

        Titulotxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Titulotxt.setForeground(new java.awt.Color(102, 102, 102));
        Titulotxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));

        Lanzamientolbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Lanzamientolbl.setForeground(new java.awt.Color(255, 255, 255));
        Lanzamientolbl.setText("Lanzamiento:");

        Fechajdc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));
        Fechajdc.setForeground(new java.awt.Color(102, 102, 102));
        Fechajdc.setDateFormatString("yyyy-MM-dd");

        ISBNlbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ISBNlbl.setForeground(new java.awt.Color(255, 255, 255));
        ISBNlbl.setText("ISBN:");

        Codigoftxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));
        Codigoftxt.setForeground(new java.awt.Color(102, 102, 102));
        try {
            Codigoftxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("978-###-###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Codigoftxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Existencialbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Existencialbl.setForeground(new java.awt.Color(255, 255, 255));
        Existencialbl.setText("Existencia:");

        Existenciatxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Existenciatxt.setForeground(new java.awt.Color(102, 102, 102));
        Existenciatxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));

        Descripcionlbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Descripcionlbl.setForeground(new java.awt.Color(255, 255, 255));
        Descripcionlbl.setText("Descripcion:");

        Descripciontxa.setColumns(3);
        Descripciontxa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Descripciontxa.setForeground(new java.awt.Color(102, 102, 102));
        Descripciontxa.setRows(5);
        Descripciontxa.setTabSize(5);
        Descripciontxa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 3));
        Descripcionspn.setViewportView(Descripciontxa);

        Paginaslbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Paginaslbl.setForeground(new java.awt.Color(255, 255, 255));
        Paginaslbl.setText("# de paginas:");

        Paginastxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Paginastxt.setForeground(new java.awt.Color(102, 102, 102));
        Paginastxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));

        Idiomalbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Idiomalbl.setForeground(new java.awt.Color(255, 255, 255));
        Idiomalbl.setText("Idioma:");

        Idiomascmb.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Idiomascmb.setForeground(new java.awt.Color(102, 102, 102));
        Idiomascmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "esp", "ing" }));
        Idiomascmb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));

        Editoriallbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Editoriallbl.setForeground(new java.awt.Color(255, 255, 255));
        Editoriallbl.setText("Editorial:");

        editorial.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        editorial.setForeground(new java.awt.Color(102, 102, 102));
        editorial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir:" }));
        editorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));

        Categorialbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Categorialbl.setForeground(new java.awt.Color(255, 255, 255));
        Categorialbl.setText("Categoria:");

        categoria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        categoria.setForeground(new java.awt.Color(102, 102, 102));
        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir" }));
        categoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));

        Guardarbtn.setBackground(new java.awt.Color(49, 91, 150));
        Guardarbtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Guardarbtn.setForeground(new java.awt.Color(255, 255, 255));
        Guardarbtn.setText("GUARDAR");
        Guardarbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Guardarbtn.setContentAreaFilled(false);
        Guardarbtn.setOpaque(true);
        Guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarbtnActionPerformed(evt);
            }
        });

        Limpiarbtn.setBackground(new java.awt.Color(49, 91, 150));
        Limpiarbtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Limpiarbtn.setForeground(new java.awt.Color(255, 255, 255));
        Limpiarbtn.setText("LIMPIAR");
        Limpiarbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Limpiarbtn.setContentAreaFilled(false);
        Limpiarbtn.setOpaque(true);

        Encabezadolbl.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Encabezadolbl.setForeground(new java.awt.Color(255, 255, 255));
        Encabezadolbl.setText("AGREGAR LIBRO");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internals/anadir.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(ISBNlbl)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Existenciatxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Codigoftxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Lanzamientolbl)
                                            .addGap(18, 18, 18)
                                            .addComponent(Fechajdc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Titulolbl)
                                        .addGap(89, 89, 89)
                                        .addComponent(Titulotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Existencialbl)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Guardarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Paginaslbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Paginastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Categorialbl)
                                            .addComponent(Editoriallbl)
                                            .addComponent(Idiomalbl))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Idiomascmb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Descripcionlbl)
                                        .addGap(24, 24, 24)
                                        .addComponent(Descripcionspn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(Limpiarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(Encabezadolbl)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Encabezadolbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Categorialbl)
                            .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Editoriallbl)
                            .addComponent(editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Titulotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titulolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Lanzamientolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Fechajdc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Idiomascmb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Idiomalbl))))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ISBNlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Codigoftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Paginaslbl)
                        .addComponent(Paginastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Descripcionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Existencialbl)
                        .addComponent(Existenciatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Descripcionspn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void cargarCategorias(){
         try {
            ResultSet r;
            
              r=c.MostrarCategorias("MostrarCategorias()").executeQuery();
             while(r.next())
                {
                    System.out.println(r.getString(2));
                   categoria.addItem(r.getString(2));
                }
        } catch (SQLException ex) {
            Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
     private void cargarEditorial(){
         try {
            ResultSet r;
            
              r=c.MostrarCategorias("MostrarEditoriales()").executeQuery();
             while(r.next())
                {
                    System.out.println(r.getString(2));
                   editorial.addItem(r.getString(2));
                }
        } catch (SQLException ex) {
            Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    private void GuardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarbtnActionPerformed
        if(Titulotxt.getText().equals("")||categoria.getSelectedIndex()==0||Fechajdc.getDate()==null||editorial.getSelectedIndex()==0||Existenciatxt.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Campo vacio detectado","Advertencia",JOptionPane.WARNING_MESSAGE);
        else
        {
            if(Idiomascmb.getSelectedItem()=="Seleccionar")//Estadocmb.getSelectedItem()=="Seleccionar")
            {
                JOptionPane.showMessageDialog(this, "Seleccione algo en los combo box","Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
            
                int exi=Integer.parseInt(Existenciatxt.getText());
                String idi=(String) (Idiomascmb.getSelectedItem());
                //int est=(int) (Estadocmb.getSelectedIndex()-1);
                int pag=Integer.parseInt(Paginastxt.getText());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                String fec=sdf.format(Fechajdc.getDate());
                c.insertar_libros("InsertarLibros(?,?,?,?,?,?,?,?,?)",Codigoftxt.getText(),Titulotxt.getText(),fec,categoria.getSelectedIndex(),editorial.getSelectedIndex(),exi,idi,pag,Descripciontxa.getText());
            }
        }
    }//GEN-LAST:event_GuardarbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categorialbl;
    private javax.swing.JFormattedTextField Codigoftxt;
    private javax.swing.JLabel Descripcionlbl;
    private javax.swing.JScrollPane Descripcionspn;
    private javax.swing.JTextArea Descripciontxa;
    private javax.swing.JLabel Editoriallbl;
    private javax.swing.JLabel Encabezadolbl;
    private javax.swing.JLabel Existencialbl;
    private javax.swing.JTextField Existenciatxt;
    private com.toedter.calendar.JDateChooser Fechajdc;
    private javax.swing.JButton Guardarbtn;
    private javax.swing.JLabel ISBNlbl;
    private javax.swing.JLabel Idiomalbl;
    private javax.swing.JComboBox<String> Idiomascmb;
    private javax.swing.JLabel Lanzamientolbl;
    private javax.swing.JButton Limpiarbtn;
    private javax.swing.JLabel Paginaslbl;
    private javax.swing.JTextField Paginastxt;
    private javax.swing.JLabel Titulolbl;
    private javax.swing.JTextField Titulotxt;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JComboBox<String> editorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
