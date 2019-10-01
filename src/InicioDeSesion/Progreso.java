/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InicioDeSesion;


import Conexion.BaseDeDatos;
import InicioDeSesion.Login;
import Principal.VentanaPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author Engels Prado
 */
public class Progreso extends Thread{

    Login c;
    JProgressBar jProgressBar1; 
    BaseDeDatos bbdd;
    int cont=0;  
    Progreso(JProgressBar jProgressBar1,Login login) {
      //To change body of generated methods, choose Tools | Templates.
      this.jProgressBar1=jProgressBar1;
      c=login;
    }

   public void setC(BaseDeDatos c){
       bbdd=c;
   }
    
    @Override
    public void run(){
        
        
      for(int i=0;i<=100;i++){
          try {
              jProgressBar1.setValue(i);
              Thread.sleep(20);
          } catch (InterruptedException ex) {
              Logger.getLogger(Progreso.class.getName()).log(Level.SEVERE, null, ex);
          }
      }    
//      Home h= new Home();
//      c.setVisible(false);
//      h.setC(bbdd);
//      h.setVisible(true);

       VentanaPrincipal vt=new VentanaPrincipal();
        vt.setC(bbdd);
       c.setVisible(false);
       vt.setVisible(true);
      
    }
    
}