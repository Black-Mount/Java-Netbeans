
package Programa_Jfreechart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Extraccion {
    private File archivo;
    
    Extraccion(String path){
        this.archivo=new File(path);
    }
    
    public List<Estructura> crearListado() throws FileNotFoundException{
         List<Estructura> listadoFinal = new ArrayList<>();
        try (Scanner scanner = new Scanner(this.archivo);) {
            while (scanner.hasNextLine()) {
                List<String> record=getRecordFromLine(scanner.nextLine());
                Estructura dato=new Estructura();
                dato.Nombre=record.get(0);
                for (int i = 0; i < record.size(); i++) {
                    dato.Nota.add(record.get(i));
                }
                listadoFinal.add(dato);
            }
        }
        return listadoFinal;
    }
    
      private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(";");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
    
}
