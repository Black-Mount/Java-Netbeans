package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

    
public class Programa extends javax.swing.JFrame implements Runnable {
 int movx=0;
 int c2=0;
 int c3=0;
 int c=0;
 Thread hilo1;
 Thread hilo2;
 Thread hilo3;
 

    public Programa() {
        initComponents();
    }
   public void movimientox(){
     try {
         Thread.sleep(100);
     } catch (InterruptedException ex) {
         Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
     }
       movx++;}
   public void m2(){c++;
     try {
         Thread.sleep(1000);
     } catch (InterruptedException ex) {
         Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
     }
     panel1.repaint();
     jLabel1.setText(String.valueOf(c));
     if (c==60) {
         hilo2.stop();
        
    
     }
}
   public void corredor3(){
     try {
         Thread.sleep(100);
     } catch (InterruptedException ex) {
         Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
     }
c3++;} 
public void run(){
    
    Thread ct= Thread.currentThread();

    while(ct==hilo1 && movx<300){
       movimientox();
       panel1.x=movx;
       panel1.repaint();
       
        System.out.println("Movimiento Figura en x: "+ movx);
} 
     while(ct==hilo2 && c2<300){
        m2();
       // dibujo.y=c2;
       panel1.repaint();
      //  System.out.println("Corredor 2 "+ c2);
} 
     /* while(ct==hilo3 && c3<124){
        corredor3();
        dibujo.rgb2=c3;
       dibujo.repaint();
        System.out.println("Corredor 3 "+ c3);
}*/
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new hilos.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Control = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(204, 255, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Tiempo:");

        Control.setText("Control");
        Control.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ControlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Control, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Control, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ControlActionPerformed
         
        hilo1=new Thread(this);
       hilo2=new Thread(this);
       hilo3=new Thread(this);
       if(Control.isSelected()){
        hilo1.start();
        hilo2.start();
        hilo3.start();   
       }
        else
       {
           hilo1.stop();
       hilo2.stop();
       hilo3.stop();
       panel1.repaint();
       }
       File f = new File("IntentoQuiz.csv");
           String tiempo=String.valueOf(c);          
            try{
                FileWriter fw = new FileWriter(f);
                fw.write("Tiempo");
                fw.write("\n");
                fw.write(tiempo);
                fw.close();
            }catch(IOException ex){
                System.out.println("Error");
            }
    }//GEN-LAST:event_ControlActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Control;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private hilos.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
