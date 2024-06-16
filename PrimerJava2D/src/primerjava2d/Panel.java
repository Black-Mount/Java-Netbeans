
package primerjava2d;

import java.awt.Color;
import java.awt.Graphics;


public class Panel extends javax.swing.JPanel {
int x=0,y=0;
    
    public Panel() {
        initComponents();
    }

   public void paintComponent(Graphics g){
       super.paintComponent(g);
        Color cafe= new Color(188,182,133);
        g.setColor(cafe);
       g.fillOval(x,y,60,60);
       g.setColor(Color.black);
       g.fillOval(x+25, y+15, 20,20);
       
       
        g.setColor(cafe);
       g.fillOval(x+80,y,60,60);
       g.setColor(Color.black);
       g.fillOval(x+95, y+15, 20,20);
       
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
