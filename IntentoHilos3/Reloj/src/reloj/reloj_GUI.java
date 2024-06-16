package reloj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import javax.swing.Timer;


public class reloj_GUI extends javax.swing.JFrame {    
    
    private Timer tiempo;
    private Timer tiempo1;
    private Timer tiempo2;
    private int centesimas_segundos = 0;
    private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;
    private int segundos1 = 0;
    private int minutos1 = 0;
    private int horas1 = 0;
    private int opcion = 0;
    LocalDateTime  locaDate = LocalDateTime.now();
    private int hours =locaDate.getHour();
    private int minutes = locaDate.getMinute();
    private int seconds = locaDate.getSecond();
            
    
    
    
    
    private void actualizarTiempo(){
        String Texto = (horas<=9?"0":"")+horas+" : "+(minutos<=9?"0":"")+minutos+" : "+(segundos<=9?"0":"")+segundos+" : "+(centesimas_segundos<=9?"0":"")+centesimas_segundos;
        TextoPrin.setText(Texto);
    }
    
    
    private ActionListener acciones = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            centesimas_segundos ++;
            if (centesimas_segundos == 100){
                segundos ++;
                centesimas_segundos = 0;
            }
            if (segundos == 60){
                minutos ++;
                segundos = 0;
            }
            if (minutos == 60){
                horas ++;
                minutos = 0;
            }
            if (horas == 24){
                horas = 0;
            }
            
            actualizarTiempo();
        }  
    };
    
    private ActionListener acciones1 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            centesimas_segundos ++;
            if (centesimas_segundos == 100){
                segundos ++;
                centesimas_segundos = 0;
            }
            if (segundos == 60){
                minutos ++;
                segundos = 0;
            }
            if (minutos == 60){
                horas ++;
                minutos = 0;
            }
            if (horas == 24){
                horas = 0;
            }

            actualizarTiempo();

            if(horas == horas1 && minutos == minutos1 && segundos == segundos1){
                tiempo1.stop();
                TextoPrin.setText("ALERTA");

            }
        }  
    };
        
    private ActionListener acciones2 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            centesimas_segundos ++;
            if (centesimas_segundos == 60){
                segundos ++;
                centesimas_segundos = 0;
            }
            if (segundos == 60){
                minutos ++;
                segundos = 0;
            }
            if (minutos == 60){
                horas ++;
                minutos = 0;
            }
            if (horas == 24){
                horas = 0;
            }
                            
            actualizarTiempo();
            
            if(horas == horas1 && minutos == minutos1 && segundos == segundos1){
                tiempo2.stop();
                TextoPrin.setText("ALERTA");
            
            }
        }  
    };
    
    
        
    
    public reloj_GUI() {
        initComponents();
        
        tiempo = new Timer(10,acciones);
        tiempo1 = new Timer(10, acciones1);
        tiempo2 = new Timer(10, acciones2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoPrin = new javax.swing.JTextField();
        Start = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        RELOJ = new javax.swing.JButton();
        ALARMA = new javax.swing.JButton();
        CRONOMETRO = new javax.swing.JButton();
        TEMPORIZADOR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextoH = new javax.swing.JTextField();
        TextoM = new javax.swing.JTextField();
        TextoS = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Start.setText("START");
        Start.setEnabled(false);
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        Stop.setText("STOP");
        Stop.setEnabled(false);
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });

        Delete.setText("DELETE");
        Delete.setEnabled(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        RELOJ.setText("RELOJ");
        RELOJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RELOJActionPerformed(evt);
            }
        });

        ALARMA.setText("ALARMA");
        ALARMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALARMAActionPerformed(evt);
            }
        });

        CRONOMETRO.setText("CRONOMETRO");
        CRONOMETRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRONOMETROActionPerformed(evt);
            }
        });

        TEMPORIZADOR.setText("TEMPORIZADOR");
        TEMPORIZADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEMPORIZADORActionPerformed(evt);
            }
        });

        jLabel1.setText("Horas");

        jLabel2.setText("Minutos");

        jLabel3.setText("Segundos");

        TextoH.setEnabled(false);

        TextoM.setEnabled(false);

        TextoS.setEnabled(false);
        TextoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoSActionPerformed(evt);
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
                            .addComponent(TextoPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RELOJ, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ALARMA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CRONOMETRO, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TEMPORIZADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextoH, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextoM)
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextoS))
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RELOJ)
                    .addComponent(ALARMA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TEMPORIZADOR)
                    .addComponent(CRONOMETRO, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete)
                    .addComponent(Stop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Start))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(TextoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RELOJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RELOJActionPerformed
        int hours =locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        
        horas=hours;
        minutos=minutes;
        segundos=seconds;
        
        tiempo.start();
    }//GEN-LAST:event_RELOJActionPerformed

    private void CRONOMETROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRONOMETROActionPerformed
        opcion = 1;
        TextoPrin.setText("00 : 00 : 00 : 00");
        Start.setEnabled(true);
    }//GEN-LAST:event_CRONOMETROActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        switch(opcion){
            case 1:
                tiempo.start();
                Start.setEnabled(false);
                Stop.setEnabled(true);
                Delete.setEnabled(true);
            break;
            case 2:
                horas1 =Integer.valueOf(TextoH.getText());
                minutos1=Integer.valueOf(TextoM.getText());
                segundos1=Integer.valueOf(TextoS.getText());
                tiempo1.start();
                Start.setEnabled(false);
                Stop.setEnabled(true);
                Delete.setEnabled(true);
            break;
            case 3:
                horas1 =Integer.valueOf(TextoH.getText());
                minutos1=Integer.valueOf(TextoM.getText());
                segundos1=Integer.valueOf(TextoS.getText());
                tiempo2.start();
                Start.setEnabled(false);
                Stop.setEnabled(true);
                Delete.setEnabled(true);
                
    }

    }//GEN-LAST:event_StartActionPerformed

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActionPerformed
        switch(opcion){
            case 1:
                tiempo.stop();
                Start.setEnabled(true);
            break;
            case 2:
               tiempo1.stop();
               Start.setEnabled(true); 
        }
        
    }//GEN-LAST:event_StopActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if (tiempo.isRunning()){
            tiempo.stop();
        }
        
        centesimas_segundos = 0;
        segundos = 0;
        minutos = 0;
        horas = 0;
        
        actualizarTiempo();
        Start.setEnabled(true);
        Stop.setEnabled(false);
        Delete.setEnabled(false);
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void TEMPORIZADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEMPORIZADORActionPerformed
        opcion = 2;
        TextoPrin.setText("00 : 00 : 00 : 00");
        Start.setEnabled(true);
        TextoH.setEnabled(true);
        TextoM.setEnabled(true);
        TextoS.setEnabled(true);
    }//GEN-LAST:event_TEMPORIZADORActionPerformed

    private void TextoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoSActionPerformed

    private void ALARMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALARMAActionPerformed
        opcion = 3;
        TextoPrin.setText("00 : 00 : 00 : 00");
        
        hours =locaDate.getHour();
        minutes = locaDate.getMinute();
        seconds = locaDate.getSecond();
        
        horas=hours;
        minutos=minutes;
        segundos=seconds;
        
        Start.setEnabled(true);
        TextoH.setEnabled(true);
        TextoM.setEnabled(true);
        TextoS.setEnabled(true);
    }//GEN-LAST:event_ALARMAActionPerformed

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
            java.util.logging.Logger.getLogger(reloj_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reloj_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reloj_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reloj_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reloj_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALARMA;
    private javax.swing.JButton CRONOMETRO;
    private javax.swing.JButton Delete;
    private javax.swing.JButton RELOJ;
    private javax.swing.JButton Start;
    private javax.swing.JButton Stop;
    private javax.swing.JButton TEMPORIZADOR;
    private javax.swing.JTextField TextoH;
    private javax.swing.JTextField TextoM;
    private javax.swing.JTextField TextoPrin;
    private javax.swing.JTextField TextoS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
