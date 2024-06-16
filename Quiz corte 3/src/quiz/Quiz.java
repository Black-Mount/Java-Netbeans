package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Quiz {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
            String linea =null;
            String[] valores;
            File archivo = new File("BaseDeDatos.csv");
            
        Scanner entrada = new Scanner (archivo);
            while (entrada.hasNext()){
            linea= entrada.nextLine();
            valores=linea.split("");
             System.out.println(linea);
             System.out.println(valores[0]);
    }

}
}
