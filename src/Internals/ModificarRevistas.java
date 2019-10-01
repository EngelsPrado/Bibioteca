package Internals;

import Conexion.BaseDeDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ModificarRevistas extends javax.swing.JInternalFrame 
{
    private BaseDeDatos c;       
    public ModificarRevistas() 
    {
        initComponents();
    }

    public void setC(BaseDeDatos c) 
    {
        this.c = c;
        cargarEditorial();
        cargarCategorias();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        editorial = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Modificar Revista");

        jPanel1.setBackground(new java.awt.Color(35, 53, 103));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MODIFICAR RESVISTA");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internals/search_book_open_search_locate_6178.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ISSN: ");

        jFormattedTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));
        jFormattedTextField1.setForeground(new java.awt.Color(102, 102, 102));
        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("issn-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Editorial: ");

        editorial.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        editorial.setForeground(new java.awt.Color(102, 102, 102));
        editorial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir" }));
        editorial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categoria: ");

        categoria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        categoria.setForeground(new java.awt.Color(102, 102, 102));
        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir" }));
        categoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(49, 91, 150));
        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Modificar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(49, 91, 150));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LIMPIAR");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editorial, 0, 147, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField1)
                            .addComponent(categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            
              r=c.MostrarCategorias("MostrarCategoriasRevistas()").executeQuery();
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
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if((editorial.getSelectedIndex()==0 || categoria.getSelectedIndex()==0)&& jFormattedTextField1.getText().equals("") )
        {
            JOptionPane.showMessageDialog(this, "Campos vacios detectados");
        }
        else
        {
       
            c.ModificarRevista("ModificarRevistas(?,?,?)",jFormattedTextField1.getText(), editorial.getSelectedIndex(), categoria.getSelectedIndex());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JComboBox<String> editorial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
