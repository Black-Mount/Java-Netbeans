/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_movimiento;

import java.awt.Dimension;
import java.util.Timer;

import java.util.TimerTask;


public class Metodo_Animacion  extends javax.swing.JLabel {   
    private Timer tiempo ;
    private TimerTask task;
    private int speed = 60;
    private int frame=0;
    boolean run = false;
    
    //se crea el objeto y se redimensiona al tamaño del contenedor
    public Metodo_Animacion(Dimension d){        
        this.setSize(d);
    }  
    //coloca una imagen en el objeto jlabel
    public void setimage(int n){        
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pelota" + n + ".gif"))); 
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
                   if (frame<=12){
                        setimage(frame);
                   }
                   else{frame=0;}
               }
           };
           //se inicia la animacion
           System.out.println("Inicia");                                             
           tiempo.schedule(task,0,speed); 
    }
    //detiene la animacion
     public void stopAnimation() {        
        tiempo.cancel();
        task.cancel();
        run=false;
        System.out.println("Se detiene");                                             
    }

}
