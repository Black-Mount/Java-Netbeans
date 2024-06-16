package laboratorio5;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Archivo {

    private ArrayList<Estudiante> estudiantes;

    // Fijar estudiantes
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    // Obtener estudiantes
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Archivo() {
        this.estudiantes = new ArrayList<Estudiante>();
    }

    // Generar el archivo CSV con los estudiantes, se le manda el nombre del archiv
    // y retorna true si fue exitoso o false si falla
    public boolean generarCSV(String nombreArchivo) {
        // Añadir la extensión csv
        nombreArchivo = nombreArchivo.concat(".csv");
        try {
            File archivo = new File(nombreArchivo);
            // Crear el archivo
            archivo.createNewFile();
        } catch (IOException error) {
            return false;
        }

        try {
            // Escritor del archivo
            FileWriter salida = new FileWriter(nombreArchivo);

            //  Obtener las variables
            int n_notas = this.estudiantes.get(0).getNotas().size();
            int n_estudiantes = this.estudiantes.size();

            // Escribir los nombres de las columnas
            salida.write("Nombre,");
            for (int i = 0; i < n_notas; i++) {
                salida.write("Nota" + Integer.toString(i + 1));
                if (i != n_notas - 1) {
                    salida.write(",");
                } else { // Es la ultima columna
                    salida.write("\n");
                }
            }

            // Por cada estudiante
            for (int i = 0; i < n_estudiantes; i++) {
                // Imprimir su nombre y una coma
                salida.write(estudiantes.get(i).getNombre() + ',');
                // Por cada nota
                for (int j = 0; j < n_notas; j++) {
                    // Obtener las notas
                    ArrayList<Double> notas = estudiantes.get(i).getNotas();
                    // Escribir la nota
                    salida.write(Double.toString(notas.get(j)));
                    // Escribir coma o salto de linea
                    if (j != n_notas - 1) {
                        salida.write(",");
                    } else if (i != n_estudiantes - 1) { // Es la ultima columna y no es el ultimo hijo
                        salida.write("\n");
                    }
                }
            }

            // cerrar el archivo
            salida.close();
            
        } catch (IOException error) {
            return false;
        }

        return true;
    }

    // Cargar un archivo CSV y guardarlo en la lista de estudiantes
    public boolean cargarCSV(File archivo) {
        try {
            // Crear el escaner lector de archivo
            Scanner escaner = new Scanner(archivo);
            escaner.nextLine(); // Ignorar la cabecera
            // Mientras que haya una nueva linea disponible
            while (escaner.hasNextLine()) {
                // Escanear la linea
                String datos = escaner.nextLine();
                // Obtener la linea dividida en comas
                StringTokenizer tokenizer = new StringTokenizer(datos, ",");
                // Obtener el nombre
                String nombre = tokenizer.nextToken();
                ArrayList<Double> notas = new ArrayList<Double>();
                // Obtener las notas
                while (tokenizer.hasMoreTokens()) {
                    // Obtener la nota y convertirla a double
                    notas.add(Double.parseDouble(tokenizer.nextToken()));
                }

                // Añadir el estudiante
                this.estudiantes.add(new Estudiante(nombre, notas));
            }
            // Cerrar el escaner
            escaner.close();
        } catch (Exception e) {
            // En caso de que haya un error
            return false;
        }
        return true;
    }
}
