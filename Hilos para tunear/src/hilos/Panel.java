
package hilos;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Panel extends javax.swing.JPanel {
int x,y=0;
int rgb1=0;
int rgb2=0;
int rgb3=0;
    
    public Panel() {
        initComponents();
    }
public int[] importacion(int []a,int []b) throws FileNotFoundException{
       String px=null;
        String py=null;
        String []valoresx;
        String []valoresy;
        a = new int[5];
        b = new int[5];
        File archivo= new File("prueba.csv");
        
        Scanner entrada = new Scanner (archivo);
        px=entrada.nextLine();
        System.out.println(px);
        valoresx=px.split(",");
        py=entrada.nextLine();
        System.out.println(py);
        valoresy=py.split(",");
        for(int i=0;i<valoresx.length;i++){
            a[i]=Integer.valueOf(valoresx[i]);
            b[i]=Integer.valueOf(valoresy[i]); 
        }
        
        return a;
   }
   public void paint(Graphics dibujo){
       
     super.paint(dibujo);
     rgb1= (int)(Math.random()*250);
     rgb2= (int)(Math.random()*250);
     rgb3= (int)(Math.random()*250);
     
     Color color1= new Color(rgb1,rgb2,rgb3);
     dibujo.setColor(Color.white);
       dibujo.fillOval(0,0,60,60);
       dibujo.setColor(color1);
       dibujo.fillOval(x+25, y+15, 20,20);
       
       Color color2= new Color(rgb1,rgb2,rgb3);
     dibujo.setColor(Color.white);
       dibujo.fillOval(80,0,60,60);
       dibujo.setColor(color2);
       dibujo.fillOval(x+95, y+15, 20,20);
     
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
