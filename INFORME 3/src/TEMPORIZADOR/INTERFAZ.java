/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEMPORIZADOR;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import TEMPORIZADOR.ConfigurarPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Usuario
 */
public class INTERFAZ extends javax.swing.JFrame {

    private ConfigurarPanel dp;
    private int frame = 0;
    Timer tiempo;
    TimerTask task;

    public INTERFAZ() {
       initComponents();
       dp = new ConfigurarPanel(HERE.getSize());        
       HERE.add(dp);
       HERE.repaint();       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PANEL = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        HERE = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        VALOR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PANEL.setBackground(new java.awt.Color(0, 0, 102));
        PANEL.setMaximumSize(new java.awt.Dimension(475, 528));
        PANEL.setMinimumSize(new java.awt.Dimension(475, 528));
        PANEL.setPreferredSize(new java.awt.Dimension(475, 528));
        PANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(450, 450));
        jPanel2.setMinimumSize(new java.awt.Dimension(450, 450));
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HERE.setBackground(new java.awt.Color(0, 0, 102));
        HERE.setMaximumSize(new java.awt.Dimension(200, 400));
        HERE.setMinimumSize(new java.awt.Dimension(200, 400));
        HERE.setPreferredSize(new java.awt.Dimension(200, 400));

        javax.swing.GroupLayout HERELayout = new javax.swing.GroupLayout(HERE);
        HERE.setLayout(HERELayout);
        HERELayout.setHorizontalGroup(
            HERELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        HERELayout.setVerticalGroup(
            HERELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel2.add(HERE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jSlider1.setBackground(new java.awt.Color(255, 255, 255));
        jSlider1.setForeground(new java.awt.Color(0, 0, 102));
        jSlider1.setMajorTickSpacing(5);
        jSlider1.setMaximum(10);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jPanel2.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 340, -1));

        VALOR.setFont(VALOR.getFont().deriveFont(VALOR.getFont().getStyle() | java.awt.Font.BOLD, VALOR.getFont().getSize()+5));
        VALOR.setText("0");
        jPanel2.add(VALOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 50, 50));

        PANEL.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 430, 500));

        getContentPane().add(PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged

        int value = jSlider1.getValue();
        String valor = String.valueOf(value);

        VALOR.setText(valor);

        if (dp.run==true){
            dp.stopAnimation();
        }   
        dp.setvelocidad(value);
        dp.startAnimation();

    }//GEN-LAST:event_jSlider1StateChanged

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
            java.util.logging.Logger.getLogger(INTERFAZ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INTERFAZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HERE;
    private javax.swing.JPanel PANEL;
    private javax.swing.JLabel VALOR;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
