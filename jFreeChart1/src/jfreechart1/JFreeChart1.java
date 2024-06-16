
package jfreechart1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFreeChart1 {

   
    public static void main(String[] args) {
        
        String linea;
            String []valores;
            
            File archivo= new File("hurtos.csv");
        try {
           
            Scanner obj= new Scanner(archivo);
           while(obj.hasNext()){
            linea= obj.nextLine();
            valores=linea.split(",");
           // System.out.println(linea);
            System.out.println(valores[3]);
           }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFreeChart1.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
        
        
    }
    
}
