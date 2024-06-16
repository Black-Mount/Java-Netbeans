
package Programa_Jfreechart;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
public class Principal extends javax.swing.JFrame {
    
DefaultTableModel modelo=new DefaultTableModel();//Tabla ingresar datos
DefaultTableModel modelos=new DefaultTableModel();//Tabla registro de datos
double totalA=0.0,totalR=0.0;


public void Habilitarboton()
{
    if(!NotaEstudiantes.getText().isEmpty()&& !Nestudiantes.getText().isEmpty()){
        BotonIngresar.setEnabled(true);
        BotonDefinitivas.setEnabled(false);
       
    }
    else{
        BotonIngresar.setEnabled(false);
         BotonDefinitivas.setEnabled(true);
        }
}

public void Deshabilitarboton()
{
    BotonIngresar.setEnabled(false);
    BotonDefinitivas.setEnabled(true);
}
public void borrartabla()
{
   modelos.removeTableModelListener(TablaResultados);
   modelo.removeTableModelListener(DatosEstudiantes);
   TablaResultados.setModel(modelos);
   DatosEstudiantes.setModel(modelo);
    
}
public void borrar()
{
    NotaEstudiantes.setText("");
      Nestudiantes.setText("");
        TextoPromedio.setText("");
        Habilitarboton();
       
}

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        BotonIngresar.setEnabled(false);
        modelos.addColumn("Nombres");
        modelos.addColumn("Definitiva");
        modelos.addColumn("Resultado");
       DatosEstudiantes.setModel(modelo);
       TablaResultados.setModel(modelos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResultados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DatosEstudiantes = new javax.swing.JTable();
        BotonIngresar = new javax.swing.JButton();
        NotaEstudiantes = new javax.swing.JTextField();
        Nestudiantes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonPromedio = new javax.swing.JButton();
        TextoPromedio = new javax.swing.JTextField();
        BotonDefinitivas = new javax.swing.JButton();
        porcentaje = new javax.swing.JLabel();
        TextoCSV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BotonCargarCSV = new javax.swing.JButton();
        BotonExportar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaResultados.getTableHeader().setResizingAllowed(false);
        TablaResultados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaResultados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 460, 84));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        DatosEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DatosEstudiantes.getTableHeader().setResizingAllowed(false);
        DatosEstudiantes.getTableHeader().setReorderingAllowed(false);
        DatosEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatosEstudiantesMouseClicked(evt);
            }
        });
        DatosEstudiantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DatosEstudiantesKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(DatosEstudiantes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 470, 84));

        BotonIngresar.setBackground(new java.awt.Color(248, 236, 236));
        BotonIngresar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotonIngresar.setText("Utilice este botón para ingresar notas ");
        BotonIngresar.setEnabled(false);
        BotonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIngresarMouseClicked(evt);
            }
        });
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 460, -1));

        NotaEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotaEstudiantesActionPerformed(evt);
            }
        });
        NotaEstudiantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NotaEstudiantesKeyReleased(evt);
            }
        });
        getContentPane().add(NotaEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 120, -1));

        Nestudiantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NestudiantesKeyReleased(evt);
            }
        });
        getContentPane().add(Nestudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 120, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese el número de estudiantes:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Tabla de notas estudiantiles:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 450, -1));

        BotonPromedio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonPromedio.setText("Inserte el nombre del estudiante (textualmente) para determinar su promedio:");
        BotonPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPromedioActionPerformed(evt);
            }
        });
        getContentPane().add(BotonPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        getContentPane().add(TextoPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 460, 20));

        BotonDefinitivas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BotonDefinitivas.setText("Calcular Definitivas");
        BotonDefinitivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDefinitivasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDefinitivas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 460, -1));

        porcentaje.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        porcentaje.setForeground(new java.awt.Color(0, 204, 51));
        porcentaje.setText(" ");
        getContentPane().add(porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 452, -1));

        TextoCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCSVActionPerformed(evt);
            }
        });
        getContentPane().add(TextoCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 340, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Inserte el nombre textual del archivo .csv ubicado en el directorio del programa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 510, -1));

        BotonCargarCSV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonCargarCSV.setText("Cargar");
        BotonCargarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargarCSVActionPerformed(evt);
            }
        });
        getContentPane().add(BotonCargarCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 90, -1));

        BotonExportar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonExportar.setText("Oprima este botón para exportar los datos de notas y definitivas a .csv");
        BotonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonExportarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonSalirMouseEntered(evt);
            }
        });
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 130, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("CONSIDERACIONES DEL PROGRAMA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Al momento de ingresar las notas separelas con \".\"");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Debe de salir de la celda al momento de digitar el valor.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("CALCULADORA NOTAS ESTUDIANTILES");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Ingrese el número de notas por estudiante:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Ingrese los datos de los estudiantes:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 450, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
       modelo=new DefaultTableModel();
       modelo.addColumn("Nombres");
         int columnas=Integer.parseInt(NotaEstudiantes.getText());
       for(int i=0;i<columnas;i++)
       {
         modelo.addColumn("Nota "+( i+1));
       }
       int filas=Integer.parseInt(Nestudiantes.getText());

       for(int i=0;i<filas;i++)
       {
         modelo.addRow(new Object[columnas]);
       }
       DatosEstudiantes.setModel(modelo);
        Deshabilitarboton();
    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void BotonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIngresarMouseClicked
         
    }//GEN-LAST:event_BotonIngresarMouseClicked

    private void NestudiantesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NestudiantesKeyReleased
       Habilitarboton();
    }//GEN-LAST:event_NestudiantesKeyReleased

    private void NotaEstudiantesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NotaEstudiantesKeyReleased
        Habilitarboton();
    }//GEN-LAST:event_NotaEstudiantesKeyReleased

    private void DatosEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatosEstudiantesMouseClicked

    }//GEN-LAST:event_DatosEstudiantesMouseClicked

    private void BotonDefinitivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDefinitivasActionPerformed
       
        double  Aprobo,Reprobo;
        totalA=0;totalR=0;
        double suma, NumeroN=DatosEstudiantes.getColumnCount()-1;
        String resultado,n;
        double[] promedio=new double[DatosEstudiantes.getRowCount()];
        
        DefaultTableModel md;
        String data[][]={};String cab[]={"Nombre","Definitiva","Resultado"};
        md=new DefaultTableModel(data,cab);
        for (int j=0;j<DatosEstudiantes.getRowCount();j++)
        {
            suma=0;
            for (int i = 1; i < DatosEstudiantes.getColumnCount(); i++) {
                suma+=Double.parseDouble(DatosEstudiantes.getValueAt(j,i).toString());
            }
            promedio[j]=suma/NumeroN;
            if (promedio[j]<3) {resultado="Reprobado";totalR++;}
            else{resultado="Aprobado";totalA++;}
            n=DatosEstudiantes.getValueAt(j,0).toString();
            
            String datos[]={n,Double.toString(promedio[j]),resultado};
            md.addRow(datos);
        }
        Aprobo=(totalA/DatosEstudiantes.getRowCount())*100;
        Reprobo=(totalR/DatosEstudiantes.getRowCount())*100;
        porcentaje.setText("Aprobo: " + Aprobo+"%.  Reprobo: "+Reprobo+"%. ");
        
        TablaResultados.setModel(md);
        
  Habilitarboton();
              
    }//GEN-LAST:event_BotonDefinitivasActionPerformed

    private void DatosEstudiantesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatosEstudiantesKeyPressed
    
    }//GEN-LAST:event_DatosEstudiantesKeyPressed

    private void BotonPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPromedioActionPerformed
        int j=0;
        boolean esta=false;
        for (int i = 0; i < DatosEstudiantes.getRowCount(); i++) {
            String t=DatosEstudiantes.getValueAt(i,0).toString();
            String tf= TextoPromedio.getText();
            if (t.equals(tf)) {
              j=i; esta=true;
            }
        }
        if (esta) {
        DefaultCategoryDataset dts=new DefaultCategoryDataset();
        String s;
        for (int i = 1; i < DatosEstudiantes.getColumnCount(); i++) {
            s="Nota #"+Integer.toString(i);
            dts.addValue(Double.parseDouble(DatosEstudiantes.getValueAt(j,i).toString()),"NOTAS",s);
        }
        JFreeChart ch= ChartFactory.createLineChart(DatosEstudiantes.getValueAt(j,0).toString(),
                "N° NOTA",
                "NOTA OBTENIDA", 
                dts,PlotOrientation.VERTICAL,
                true,
                true,
                false);
        ChartPanel panel=new ChartPanel(ch);
        JFrame ventana= new JFrame("");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.add(panel);
        }
        else{
        JOptionPane.showMessageDialog(null, "El nombre ingresado no se encuentra."
                + "\nIngrese un nombre diferente.");
        }
    }//GEN-LAST:event_BotonPromedioActionPerformed

    private void NotaEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotaEstudiantesActionPerformed
      
    }//GEN-LAST:event_NotaEstudiantesActionPerformed

    private void BotonCargarCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargarCSVActionPerformed
        Extraer(TextoCSV.getText());
    }//GEN-LAST:event_BotonCargarCSVActionPerformed

    private void BotonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonExportarActionPerformed
   
        ArrayList<String[]> lista=new ArrayList<String[]>();
        for (int i = 0; i < DatosEstudiantes.getRowCount(); i++) {
            String[] aux =new String[DatosEstudiantes.getColumnCount()];
            for (int j = 0; j < DatosEstudiantes.getColumnCount(); j++) {
            aux[j]=(String) DatosEstudiantes.getValueAt(i, j);
            }
            lista.add(aux);
        }
        Exportar(lista,";","TablaNotas.csv");
        ArrayList<String[]> lista2=new ArrayList<String[]>();
        for (int i = 0; i < TablaResultados.getRowCount(); i++) {
            String[] aux =new String[TablaResultados.getColumnCount()];
            for (int j = 0; j < TablaResultados.getColumnCount(); j++) {
            aux[j]=(String) TablaResultados.getValueAt(i, j);
            }
            lista2.add(aux);
        }
        Exportar(lista2,";","TablaDefinitivas.csv");
    }//GEN-LAST:event_BotonExportarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseEntered
        BotonSalir.setBackground(Color.red);
    }//GEN-LAST:event_BotonSalirMouseEntered

    private void TextoCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCSVActionPerformed
    
    public void Extraer(String a){
    
        File currentDirFile = new File(".");
        String path=System.getProperty("user.dir");
        Extraccion archivo=new Extraccion(path+"\\"+a+".csv");
        try{
             List<Estructura> lista=archivo.crearListado();
             modelo=new DefaultTableModel();
             modelo.addColumn("Nombres");
             for (int i = 1; i < lista.get(0).Nota.size(); i++) {
                modelo.addColumn("Nota "+i);
            }
             for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(lista.get(i).Nota.toArray());
            }
            DatosEstudiantes.setModel(modelo);
        }
        catch(FileNotFoundException ex){
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    
    public void Exportar(ArrayList<String[]> thingsToWrite, String separator, String fileName){
    try (FileWriter writer = new FileWriter(fileName)){
        for (String[] strings : thingsToWrite) {
            for (int i = 0; i < strings.length; i++) {
                writer.append(strings[i]);
                if(i < (strings.length-1))
                    writer.append(separator);
            }
            writer.append(System.lineSeparator());
        }
        writer.flush();
    } catch (IOException e) {
        e.printStackTrace();
    }
}   
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCargarCSV;
    private javax.swing.JButton BotonDefinitivas;
    private javax.swing.JButton BotonExportar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonPromedio;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTable DatosEstudiantes;
    private javax.swing.JTextField Nestudiantes;
    private javax.swing.JTextField NotaEstudiantes;
    private javax.swing.JTable TablaResultados;
    private javax.swing.JTextField TextoCSV;
    private javax.swing.JTextField TextoPromedio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel porcentaje;
    // End of variables declaration//GEN-END:variables
}
