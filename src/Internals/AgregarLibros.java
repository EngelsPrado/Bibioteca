package Internals;

import Conexion.BaseDeDatos;
import com.toedter.calendar.JTextFieldDateEditor;
import java.text.SimpleDateFormat;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezadolbl = new javax.swing.JLabel();
        ISBNlbl = new javax.swing.JLabel();
        Codigoftxt = new javax.swing.JFormattedTextField();
        Titulolbl = new javax.swing.JLabel();
        Titulotxt = new javax.swing.JTextField();
        Categorialbl = new javax.swing.JLabel();
        Categoriatxt = new javax.swing.JTextField();
        Lanzamientolbl = new javax.swing.JLabel();
        Fechajdc = new com.toedter.calendar.JDateChooser();
        Idiomalbl = new javax.swing.JLabel();
        Idiomascmb = new javax.swing.JComboBox<>();
        Editoriallbl = new javax.swing.JLabel();
        Editorialtxt = new javax.swing.JTextField();
        Existencialbl = new javax.swing.JLabel();
        Existenciatxt = new javax.swing.JTextField();
        Paginaslbl = new javax.swing.JLabel();
        Paginastxt = new javax.swing.JTextField();
        Descripcionlbl = new javax.swing.JLabel();
        Descripcionspn = new javax.swing.JScrollPane();
        Descripciontxa = new javax.swing.JTextArea();
        Guardarbtn = new javax.swing.JButton();
        Limpiarbtn = new javax.swing.JButton();

        setClosable(true);
        setTitle("Agregar libro");

        Encabezadolbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Encabezadolbl.setText("Agregar libro");

        ISBNlbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ISBNlbl.setText("ISBN");

        try {
            Codigoftxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("978-###-###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Codigoftxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Titulolbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Titulolbl.setText("Titulo");

        Titulotxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Categorialbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Categorialbl.setText("Categoria");

        Categoriatxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Lanzamientolbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lanzamientolbl.setText("Lanzamiento");

        Fechajdc.setDateFormatString("yyyy-MM-dd");

        Idiomalbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Idiomalbl.setText("Idioma");

        Idiomascmb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Idiomascmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "esp", "ing" }));

        Editoriallbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Editoriallbl.setText("Editorial");

        Editorialtxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Existencialbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Existencialbl.setText("Existencia");

        Paginaslbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Paginaslbl.setText("# de paginas");

        Paginastxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Descripcionlbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Descripcionlbl.setText("Descripcion");

        Descripciontxa.setColumns(3);
        Descripciontxa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Descripciontxa.setRows(5);
        Descripciontxa.setTabSize(5);
        Descripcionspn.setViewportView(Descripciontxa);

        Guardarbtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Guardarbtn.setText("Guardar");
        Guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarbtnActionPerformed(evt);
            }
        });

        Limpiarbtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Limpiarbtn.setText("Limpiar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lanzamientolbl)
                                    .addComponent(Existencialbl))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Fechajdc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Idiomalbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Idiomascmb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Editoriallbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Editorialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Existenciatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(Paginaslbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(Paginastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Descripcionlbl)
                                .addGap(18, 18, 18)
                                .addComponent(Descripcionspn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ISBNlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Codigoftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(Titulolbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Titulotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Categorialbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Categoriatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(Encabezadolbl)))
                .addGap(0, 74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(Guardarbtn)
                .addGap(129, 129, 129)
                .addComponent(Limpiarbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Encabezadolbl)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ISBNlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Codigoftxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titulolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titulotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Categorialbl)
                            .addComponent(Categoriatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(Lanzamientolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Idiomalbl)
                                    .addComponent(Idiomascmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Editoriallbl)
                                    .addComponent(Editorialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(Fechajdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Existencialbl)
                    .addComponent(Paginaslbl)
                    .addComponent(Existenciatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Paginastxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Descripcionlbl)
                    .addComponent(Descripcionspn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardarbtn)
                    .addComponent(Limpiarbtn))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarbtnActionPerformed
        if(Titulotxt.getText().equals("")||Categoriatxt.getText().equals("")||Fechajdc.getDate()==null||Editorialtxt.getText().equals("")||Existenciatxt.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Campo vacio detectado","Advertencia",JOptionPane.WARNING_MESSAGE);
        else
        {
            if(Idiomascmb.getSelectedItem()=="Seleccionar")//Estadocmb.getSelectedItem()=="Seleccionar")
            {
                JOptionPane.showMessageDialog(this, "Seleccione algo en los combo box","Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                int cat=Integer.parseInt(Categoriatxt.getText());
                int edi=Integer.parseInt(Editorialtxt.getText());
                int exi=Integer.parseInt(Existenciatxt.getText());
                String idi=(String) (Idiomascmb.getSelectedItem());
                //int est=(int) (Estadocmb.getSelectedIndex()-1);
                int pag=Integer.parseInt(Paginastxt.getText());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                String fec=sdf.format(Fechajdc.getDate());
                c.insertar_libros("InsertarLibros(?,?,?,?,?,?,?,?,?)",Codigoftxt.getText(),Titulotxt.getText(),fec,cat,edi,exi,idi,pag,Descripciontxa.getText());
            }
        }
    }//GEN-LAST:event_GuardarbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Categorialbl;
    private javax.swing.JTextField Categoriatxt;
    private javax.swing.JFormattedTextField Codigoftxt;
    private javax.swing.JLabel Descripcionlbl;
    private javax.swing.JScrollPane Descripcionspn;
    private javax.swing.JTextArea Descripciontxa;
    private javax.swing.JLabel Editoriallbl;
    private javax.swing.JTextField Editorialtxt;
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
    // End of variables declaration//GEN-END:variables
}
