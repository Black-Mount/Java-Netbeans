
package Punto_4;


import Punto_4.metordenam;
import Punto_4.usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class persona_interfaz extends javax.swing.JFrame {
    metordenam ordenar = new metordenam();
    int contadorPersonas=0;
    usuario arrPersona[]=new usuario[1];
    DefaultTableModel tabla;
    
    //Guarda memoria en arrPersona
    public void asignarMemoria(){
        usuario[] auxiliar = Arrays.copyOf(arrPersona, arrPersona.length+1);
        arrPersona = new usuario[contadorPersonas];
        arrPersona=Arrays.copyOf(auxiliar,auxiliar.length);
    }
    
    //Llena la tabla creando una matriz con el tamaño
    //de la cantidad de personas y le manda ese modelo a la tabla "lista"
    public void llenarTabla(){
        String matriz[][]=new String[arrPersona.length-1][4];
        for (int i = 0; i<contadorPersonas; i++) {
            matriz[i][0]=String.valueOf(i+1);
            matriz[i][1]=String.valueOf(arrPersona[i].getName());
            matriz[i][2]=String.valueOf(arrPersona[i].getCed());
            matriz[i][3]=String.valueOf(arrPersona[i].getAge());
        }
        //Actualiza la lista con el nuevo orden
        Lista.setModel(new javax.swing.table.DefaultTableModel(
        matriz,
        new String [] {
            "#","NOMBRE", "CEDULA", "EDAD"
        }
        ));
    }

    public persona_interfaz() {
        initComponents();
        tabla= new DefaultTableModel();
        tabla.addColumn("Nombre");
        tabla.addColumn("Cedula");
        tabla.addColumn("Edad");
        this.Lista.setModel(tabla);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Cedula = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        Adicionar = new javax.swing.JButton();
        Organizar = new javax.swing.JButton();
        Metodo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Lista);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre completo:  ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Numero de Cedula : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Edad : ");

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaActionPerformed(evt);
            }
        });

        Adicionar.setText("Adicionar Usuario");
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });

        Organizar.setText("Ordenar");
        Organizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizarActionPerformed(evt);
            }
        });

        Metodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cedula Burbuja", "Cedula Mergesort", "Edad Burbuja", "Edad Mergesort" }));
        Metodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Adicionar))
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(Nombre)
                                .addComponent(Cedula))
                            .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Organizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Adicionar)))
                        .addGap(39, 39, 39)
                        .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Organizar)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

//Crea un objeto persona y lo guarda en el arreglo de personas
    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
        contadorPersonas++;
        asignarMemoria();
        usuario persona=new usuario();
        persona.setName(Nombre.getText());
        persona.setAge(Integer.parseInt(Edad.getText()));
        persona.setCed(Integer.parseInt(Cedula.getText()));
        arrPersona[contadorPersonas-1]=persona;
        Nombre.setText("");
        Edad.setText("");
        Cedula.setText("");
        llenarTabla(); //Actualiza la tabla con la nueva persona
    }//GEN-LAST:event_AdicionarActionPerformed

    private void OrganizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizarActionPerformed

        if(Metodo.getSelectedItem().toString()=="Cedula Burbuja"){
            ordenar.cedBurbuja(arrPersona);
            llenarTabla();

        }
        if(Metodo.getSelectedItem().toString()=="Cedula Mergesort"){
            ordenar.cedMerge(arrPersona,0,arrPersona.length-2);
            llenarTabla();
        }
        if(Metodo.getSelectedItem().toString()=="Edad Burbuja"){
            ordenar.edadBurbuja(arrPersona);
            llenarTabla();
        }
        if(Metodo.getSelectedItem().toString()=="Edad Mergesort"){
            ordenar.edadMerge(arrPersona,0,arrPersona.length-2);
            llenarTabla();
        }
    }//GEN-LAST:event_OrganizarActionPerformed

    private void CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActionPerformed

    private void MetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetodoActionPerformed

    }//GEN-LAST:event_MetodoActionPerformed

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
            java.util.logging.Logger.getLogger(persona_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(persona_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(persona_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(persona_interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new persona_interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField Edad;
    private javax.swing.JTable Lista;
    public static javax.swing.JComboBox Metodo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Organizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
