
package jfreechart1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFreeChart1 {

   
    public static void main(String[] args) {
      
        
        // importación
        String linea;
            String []valores;
            
            File archivo= new File("informacion.csv");
        try {
           
            Scanner obj= new Scanner(archivo);
           while(obj.hasNext()){
            linea= obj.nextLine();
            valores=linea.split(",");
            System.out.println(linea);
            System.out.println(valores[0]);
           }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFreeChart1.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        // exportación
        
        File f= new File("lol.csv");
        try {
            FileWriter fw= new FileWriter(f);
            fw.write("Hola"+ "\n" + "mundo");
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(JFreeChart1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
    }
    
}
