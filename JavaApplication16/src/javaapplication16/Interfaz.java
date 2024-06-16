/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Interfaz extends javax.swing.JFrame {

    Leer read = new Leer("informacion.csv");
    String[] cursos = new String[]{"Sexto", "Septimo", "Octavo", "Noveno", "Decimo", "Once"};
    ArrayList<ArrayList> finish = new ArrayList<ArrayList>();

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Boton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        Boton.setText("Llenar");
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(Boton)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton)
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fillTable() {
        read.leer();
        String Mat[][] = new String[read.getLista().size()][read.getLista().get(0).size()];
        for (int i = 0; i < read.getLista().size(); i++) {
            for (int j = 0; j < read.getLista().get(i).size(); j++) {
                Mat[i][j] = String.valueOf(read.getLista().get(i).get(j));
            }
        }
        String columns[] = new String[read.getLista().get(0).size()];

        for (int i = 0; i < read.getLista().get(0).size(); i++) {
            columns[i] = "Dato " + (i + 1);
        }
        Tabla.setModel(new javax.swing.table.DefaultTableModel(Mat, columns));
    }

    public void procesar() {
        read.leer();
        int f = 0;
        int m = 0;
        for (int j = 0; j < 6; j++) {
            f = 0;
            m = 0;
            for (int i = 0; i < read.getLista().get(0).size(); i++) {
                if (Integer.parseInt(read.getLista().get(1).get(i).toString()) == (j + 6)) {
                    if ("Ramiro".equals(read.getLista().get(0).get(i).toString())) {
                        f++;
                    } else if ("Raul".equals(read.getLista().get(0).get(i).toString())) {
                        m++;
                    }
                }
            }
            ArrayList<String> aux = new ArrayList<String>();
            aux.add(cursos[j]);
            aux.add(String.valueOf(m));
            aux.add(String.valueOf(f));
            finish.add(aux);
            System.out.println(aux);

        }
    }

    public void fillTable2() {

        String Mat[][] = new String[6][3];
        for (int i = 0; i < 6; i++) {
            Mat[i][0] = finish.get(i).get(0).toString();
            Mat[i][1] = finish.get(i).get(1).toString();
            Mat[i][2] = finish.get(i).get(2).toString();

        }
        String columns[] = new String[]{"CURSO", "MASCULINO", "FEMENINO"};

        Tabla.setModel(new javax.swing.table.DefaultTableModel(Mat, columns));
    }

    public void exportar() {
        File f = new File("Exportar.csv");
        try {
            FileWriter fw = new FileWriter(f);
            for (int i = 0; i < 6; i++) {
                
                fw.write(finish.get(i).get(0).toString());
                fw.write(finish.get(i).get(1).toString());
                fw.write( finish.get(i).get(2).toString());

            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed

        procesar();
        fillTable2();
        exportar();
    }//GEN-LAST:event_BotonActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton;
    private javax.swing.JTable Tabla;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
