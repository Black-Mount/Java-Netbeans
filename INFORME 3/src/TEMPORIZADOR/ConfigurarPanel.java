/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEMPORIZADOR;

import java.awt.Dimension;
import java.util.Timer;
import java.util.ArrayList;
import java.util.TimerTask;

public class ConfigurarPanel extends javax.swing.JLabel {
    
    private Timer tiempo ;
    private TimerTask task;
    private int speed = 60;
    private int frame=0;
    boolean run = false;
    
    //se crea el objeto y se redimensiona al tamaño del contenedor
    public ConfigurarPanel(Dimension d){        
        this.setSize(d);
    }  
    //coloca una imagen en el objeto jlabel
    public void setimage(int n){        
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("/FotosInterfaz/Foto1.jpeg");
         lista.add("/FotosInterfaz/Foto2.jpeg");
          lista.add("/FotosInterfaz/Foto3.jpeg");
           lista.add("/FotosInterfaz/Foto4.jpeg");
            lista.add("/FotosInterfaz/Foto5.jpeg");
             lista.add("/FotosInterfaz/Foto6.jpeg");
              lista.add("/FotosInterfaz/Foto7.jpeg");
               lista.add("/FotosInterfaz/Foto8.jpeg");
                lista.add("/FotosInterfaz/Foto9.jpeg");
                 lista.add("/FotosInterfaz/Foto10.jpeg");
                  lista.add("/FotosInterfaz/Foto1.11jpeg");
                   lista.add("/FotosInterfaz/Foto12.jpeg");
                   

        
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource(lista.get(n-1))));  
    }
    //coloca la velocidad en la variable 
    public void setvelocidad(int v){
        this.speed= v;        
    }
  //para la animacion  
  public void startAnimation() {    
           run=true;
           tiempo = new Timer();
           task = new TimerTask() {               
               public void run() {
                   frame++;                   
                   if (frame<=9){
                        setimage(frame);
                   }
                   else{frame=0;}
               }
           };
           //se inicia la animacion                                           
           tiempo.schedule(task,0,speed*25); 
           
    }
    //detiene la animacion
     public void stopAnimation() {        
        tiempo.cancel();
        task.cancel();
        run=false;                                       
    }
}
