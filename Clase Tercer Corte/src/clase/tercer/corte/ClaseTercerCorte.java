/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.tercer.corte;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClaseTercerCorte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*    String linea;
        String []valores;
        File archivo = new File("datos.csv");
        
        try {
            Scanner entrada= new Scanner(archivo);
            while (entrada.hasNext()){
                linea=entrada.nextLine();
                valores=linea.split(",");
                System.out.println(valores[0]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClaseTercerCorte.class.getName()).log(Level.SEVERE, null, ex);
        }
     */
      File f= new File("expor.csv");
      
 
        try {
            FileWriter fw= new FileWriter(f);
            fw = new FileWriter(f);
            fw.write("hola");
            fw.write("12/10/2022" + "\n");
            fw.write("octubre");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ClaseTercerCorte.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
      
    }
    
}
