package Principal;

import Conexion.BaseDeDatos;
import Internals.AgregarLibros;
import Internals.AgregarRevistas;
import Internals.AgregarUsuario;
import Internals.BorrarLibros;
import Internals.BorrarRevista;
import Internals.BuscarLibro;
import Internals.BuscarRevista;
import Internals.ListaUsuarios;
import Internals.ModificarLibros;
import Internals.ModificarRevistas;
import Internals.PrestarLibro;
import Internals.PrestarRevista;
import Internals.VerLibros;
import Internals.VerRevistas;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;

public class VentanaPrincipal extends javax.swing.JFrame 
{
     BaseDeDatos c;
    public VentanaPrincipal() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void setC(BaseDeDatos c) 
    {
        this.c = c;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/Imagenes/Fondo.png"));
        Image imagen=icono.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane()
        {
            public void paintComponent(Graphics g)
            {
                g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        Menumnb = new javax.swing.JMenuBar();
        Usuariosmnu = new javax.swing.JMenu();
        AgregarUmni = new javax.swing.JMenuItem();
        EliminarUmni = new javax.swing.JMenuItem();
        ModificarUmni = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Librosmnu = new javax.swing.JMenu();
        AgregarLmni = new javax.swing.JMenuItem();
        EliminarLmni = new javax.swing.JMenuItem();
        ModificarLmni = new javax.swing.JMenuItem();
        VerLibrosmni = new javax.swing.JMenuItem();
        Revistasmnu = new javax.swing.JMenu();
        AgregarRmni = new javax.swing.JMenuItem();
        EliminarRmni = new javax.swing.JMenuItem();
        ModificarRmni = new javax.swing.JMenuItem();
        VerRevistasmni = new javax.swing.JMenuItem();
        Buscarmnu = new javax.swing.JMenu();
        Usuariomni = new javax.swing.JMenuItem();
        Librosmni = new javax.swing.JMenuItem();
        Revistamni = new javax.swing.JMenuItem();
        Prestarmnu = new javax.swing.JMenu();
        PrestarLmni = new javax.swing.JMenuItem();
        PrestarRmni = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        AcercaDemnu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(35, 53, 103));
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(35, 53, 103));
        jDesktopPane1.setForeground(new java.awt.Color(35, 53, 103));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/buscar.png"))); // NOI18N

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 151, Short.MAX_VALUE))
        );

        Menumnb.setBackground(new java.awt.Color(35, 53, 103));
        Menumnb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(35, 53, 103), 2));
        Menumnb.setForeground(new java.awt.Color(35, 53, 103));

        Usuariosmnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Usuarios.png"))); // NOI18N
        Usuariosmnu.setText("Usuarios");

        AgregarUmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono agregar.png"))); // NOI18N
        AgregarUmni.setText("Añadir");
        AgregarUmni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarUmniActionPerformed(evt);
            }
        });
        Usuariosmnu.add(AgregarUmni);

        EliminarUmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Eliminar.png"))); // NOI18N
        EliminarUmni.setText("Eliminar");
        Usuariosmnu.add(EliminarUmni);

        ModificarUmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Modificar Usuario.png"))); // NOI18N
        ModificarUmni.setText("Modificar");
        Usuariosmnu.add(ModificarUmni);

        jMenuItem2.setText("Ver");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Usuariosmnu.add(jMenuItem2);

        Menumnb.add(Usuariosmnu);

        Librosmnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Libros.png"))); // NOI18N
        Librosmnu.setText("Libros");

        AgregarLmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono agregar.png"))); // NOI18N
        AgregarLmni.setText("Agregar");
        AgregarLmni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarLmniActionPerformed(evt);
            }
        });
        Librosmnu.add(AgregarLmni);

        EliminarLmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Eliminar.png"))); // NOI18N
        EliminarLmni.setText("Eliminar");
        EliminarLmni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarLmniActionPerformed(evt);
            }
        });
        Librosmnu.add(EliminarLmni);

        ModificarLmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Modificar Libro.png"))); // NOI18N
        ModificarLmni.setText("Modificar");
        ModificarLmni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarLmniActionPerformed(evt);
            }
        });
        Librosmnu.add(ModificarLmni);

        VerLibrosmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Ver.png"))); // NOI18N
        VerLibrosmni.setText("Lista");
        VerLibrosmni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerLibrosmniActionPerformed(evt);
            }
        });
        Librosmnu.add(VerLibrosmni);

        Menumnb.add(Librosmnu);

        Revistasmnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Revistas.png"))); // NOI18N
        Revistasmnu.setText("Revistas");

        AgregarRmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono agregar.png"))); // NOI18N
        AgregarRmni.setText("Agregar");
        AgregarRmni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarRmniActionPerformed(evt);
            }
        });
        Revistasmnu.add(AgregarRmni);

        EliminarRmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Eliminar.png"))); // NOI18N
        EliminarRmni.setText("Eliminar");
        EliminarRmni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarRmniActionPerformed(evt);
            }
        });
        Revistasmnu.add(EliminarRmni);

        ModificarRmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Modificar Libro.png"))); // NOI18N
        ModificarRmni.setText("Modificar");
        ModificarRmni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarRmniActionPerformed(evt);
            }
        });
        Revistasmnu.add(ModificarRmni);

        VerRevistasmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Ver.png"))); // NOI18N
        VerRevistasmni.setText("Lista");
        VerRevistasmni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerRevistasmniActionPerformed(evt);
            }
        });
        Revistasmnu.add(VerRevistasmni);

        Menumnb.add(Revistasmnu);

        Buscarmnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Busqueda.png"))); // NOI18N
        Buscarmnu.setText("Buscar");

        Usuariomni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Grupo.png"))); // NOI18N
        Usuariomni.setText("Usuarios");
        Buscarmnu.add(Usuariomni);

        Librosmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Lista Libros.png"))); // NOI18N
        Librosmni.setText("Libros");
        Librosmni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibrosmniActionPerformed(evt);
            }
        });
        Buscarmnu.add(Librosmni);

        Revistamni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Lista Revista.png"))); // NOI18N
        Revistamni.setText("Revistas");
        Revistamni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevistamniActionPerformed(evt);
            }
        });
        Buscarmnu.add(Revistamni);

        Menumnb.add(Buscarmnu);

        Prestarmnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Prestamo.png"))); // NOI18N
        Prestarmnu.setText("Prestamo");

        PrestarLmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Prestar Libro.png"))); // NOI18N
        PrestarLmni.setText("Libro");
        PrestarLmni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestarLmniActionPerformed(evt);
            }
        });
        Prestarmnu.add(PrestarLmni);

        PrestarRmni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Prestar Revista.png"))); // NOI18N
        PrestarRmni.setText("Revista");
        PrestarRmni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestarRmniActionPerformed(evt);
            }
        });
        Prestarmnu.add(PrestarRmni);

        jMenuItem1.setText("Historial");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Prestarmnu.add(jMenuItem1);

        Menumnb.add(Prestarmnu);

        AcercaDemnu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Acerca de.png"))); // NOI18N
        AcercaDemnu.setText("Acerca de");
        Menumnb.add(AcercaDemnu);

        setJMenuBar(Menumnb);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerLibrosmniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerLibrosmniActionPerformed
        VerLibros vl=new VerLibros();
        jDesktopPane1.add(vl);
        vl.setVisible(true);
        vl.setDatos(c);
    }//GEN-LAST:event_VerLibrosmniActionPerformed

    private void VerRevistasmniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerRevistasmniActionPerformed
        VerRevistas vr=new VerRevistas();
        jDesktopPane1.add(vr);
        vr.setVisible(true);
        vr.setDatos(c);
    }//GEN-LAST:event_VerRevistasmniActionPerformed

    private void AgregarLmniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarLmniActionPerformed
        AgregarLibros al=new AgregarLibros();
        jDesktopPane1.add(al);
        al.setVisible(true);
        al.setC(c);
    }//GEN-LAST:event_AgregarLmniActionPerformed

    private void EliminarLmniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarLmniActionPerformed
        BorrarLibros bl=new BorrarLibros();
        jDesktopPane1.add(bl);
        bl.setVisible(true);
        bl.setC(c);
    }//GEN-LAST:event_EliminarLmniActionPerformed

    private void ModificarLmniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarLmniActionPerformed
        ModificarLibros ml=new ModificarLibros();
        jDesktopPane1.add(ml);
        ml.setVisible(true);
        ml.setC(c);
    }//GEN-LAST:event_ModificarLmniActionPerformed

    private void AgregarRmniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarRmniActionPerformed
        AgregarRevistas ar=new AgregarRevistas();
        jDesktopPane1.add(ar);
        ar.setVisible(true);
        ar.setC(c);
    }//GEN-LAST:event_AgregarRmniActionPerformed

    private void EliminarRmniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarRmniActionPerformed
        BorrarRevista br=new BorrarRevista();
        jDesktopPane1.add(br);
        br.setVisible(true);
        br.setC(c);
    }//GEN-LAST:event_EliminarRmniActionPerformed

    private void ModificarRmniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarRmniActionPerformed
        ModificarRevistas mr=new ModificarRevistas();
        jDesktopPane1.add(mr);
        mr.setVisible(true);
        mr.setC(c);
    }//GEN-LAST:event_ModificarRmniActionPerformed

    private void LibrosmniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibrosmniActionPerformed
        BuscarLibro bl=new BuscarLibro();
        jDesktopPane1.add(bl);
        bl.setVisible(true);
        bl.setC(c);
    }//GEN-LAST:event_LibrosmniActionPerformed

    private void RevistamniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevistamniActionPerformed
        BuscarRevista br=new BuscarRevista();
        jDesktopPane1.add(br);
        br.setVisible(true);
        br.setC(c);
    }//GEN-LAST:event_RevistamniActionPerformed

    private void PrestarLmniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestarLmniActionPerformed
        PrestarLibro pl=new PrestarLibro();
        jDesktopPane1.add(pl);
        pl.setVisible(true);
        pl.setC(c);
    }//GEN-LAST:event_PrestarLmniActionPerformed

    private void PrestarRmniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestarRmniActionPerformed
        PrestarRevista pr=new PrestarRevista();
        jDesktopPane1.add(pr);
        pr.setVisible(true);
        pr.setC(c);
    }//GEN-LAST:event_PrestarRmniActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ListaUsuarios lu=new ListaUsuarios();
        jDesktopPane1.add(lu);
        lu.setVisible(true);
        lu.setDatos(c);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void AgregarUmniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarUmniActionPerformed
        AgregarUsuario au=new AgregarUsuario();
        jDesktopPane1.add(au);
        au.setVisible(true);
        au.setC(c);
    }//GEN-LAST:event_AgregarUmniActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AcercaDemnu;
    private javax.swing.JMenuItem AgregarLmni;
    private javax.swing.JMenuItem AgregarRmni;
    private javax.swing.JMenuItem AgregarUmni;
    private javax.swing.JMenu Buscarmnu;
    private javax.swing.JMenuItem EliminarLmni;
    private javax.swing.JMenuItem EliminarRmni;
    private javax.swing.JMenuItem EliminarUmni;
    private javax.swing.JMenuItem Librosmni;
    private javax.swing.JMenu Librosmnu;
    private javax.swing.JMenuBar Menumnb;
    private javax.swing.JMenuItem ModificarLmni;
    private javax.swing.JMenuItem ModificarRmni;
    private javax.swing.JMenuItem ModificarUmni;
    private javax.swing.JMenuItem PrestarLmni;
    private javax.swing.JMenuItem PrestarRmni;
    private javax.swing.JMenu Prestarmnu;
    private javax.swing.JMenuItem Revistamni;
    private javax.swing.JMenu Revistasmnu;
    private javax.swing.JMenuItem Usuariomni;
    private javax.swing.JMenu Usuariosmnu;
    private javax.swing.JMenuItem VerLibrosmni;
    private javax.swing.JMenuItem VerRevistasmni;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
