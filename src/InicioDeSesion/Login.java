package InicioDeSesion;

import Conexion.BaseDeDatos;
import Principal.VentanaPrincipal;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame 
{
    BaseDeDatos bbdd;
    int cont=0;
    public Login() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(Conectarbtn);
    }
    
    class Llenado extends Thread
    {
        @Override
        public void run()
        {
            Usuariotxt.setEnabled(false);
            Contrapwd.setEnabled(false);
            Conectarbtn.setEnabled(false);
            try
            {
                for(int i=0;i<=100;i++)
                {
                    Barrapgb.setValue(i);
                    Thread.sleep(15);
                }
                if(Barrapgb.getValue()==100)
                {
                    Barrapgb.setValue(0);
                    Usuariotxt.setEnabled(true);
                    Contrapwd.setEnabled(true);
                    Conectarbtn.setEnabled(true);
                    VentanaPrincipal vp=new VentanaPrincipal();
                    vp.setC(bbdd);
                    vp.setVisible(true);
                    dispose();
                }
            }catch(InterruptedException e)
            {

            } 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezadolbl = new javax.swing.JLabel();
        Usuariolbl = new javax.swing.JLabel();
        Usuariotxt = new javax.swing.JTextField();
        Contralbl = new javax.swing.JLabel();
        Conectarbtn = new javax.swing.JButton();
        Contrapwd = new javax.swing.JPasswordField();
        Barrapgb = new javax.swing.JProgressBar();
        Fondolbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Encabezadolbl.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Encabezadolbl.setText("Inicio de sesion");
        getContentPane().add(Encabezadolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        Usuariolbl.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        Usuariolbl.setText("Usuario");
        getContentPane().add(Usuariolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        getContentPane().add(Usuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 130, -1));

        Contralbl.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        Contralbl.setText("Contraseña");
        getContentPane().add(Contralbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        Conectarbtn.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        Conectarbtn.setText("Conectar");
        Conectarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Conectarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));
        getContentPane().add(Contrapwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 130, -1));
        getContentPane().add(Barrapgb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 334, 360, 30));

        Fondolbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(Fondolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConectarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectarbtnActionPerformed
        char contra[]=Contrapwd.getPassword();
        String c=new String(contra);
        bbdd=new BaseDeDatos();
            
        if(Usuariotxt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Ingresar Valor en Campo Login");
        }else
        {
            if(c.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Ingresar Valor en Campo Password");
            }else
            {
                if(bbdd.conectar(Usuariotxt.getText(), c))
                {
                    Llenado l=new Llenado();
                    l.start();
                }
                else
                {
                    if(cont==4)
                    {
                        JOptionPane.showMessageDialog(null,"Error","Error",JOptionPane.ERROR_MESSAGE);
                        cont=0;
                        this.dispose();
                    }
                    else
                    {
                        cont++;
                        JOptionPane.showMessageDialog(this,"Le quedan" + " " + (5-cont) + " intentos","Advertecia",JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_ConectarbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barrapgb;
    private javax.swing.JButton Conectarbtn;
    private javax.swing.JLabel Contralbl;
    private javax.swing.JPasswordField Contrapwd;
    private javax.swing.JLabel Encabezadolbl;
    private javax.swing.JLabel Fondolbl;
    private javax.swing.JLabel Usuariolbl;
    private javax.swing.JTextField Usuariotxt;
    // End of variables declaration//GEN-END:variables
}
