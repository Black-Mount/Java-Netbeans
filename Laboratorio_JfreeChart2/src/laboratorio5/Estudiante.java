package laboratorio5;

import java.util.ArrayList;

/**
 * Contiene la información del estudiante y sus notas
 */
public class Estudiante {

    private String nombre; // Nombre del estudiante
    private ArrayList<Double> notas; // Notas del estudiante
    
    /**
     * Crear un estudiante con su nombre y sus notas
     */
    public Estudiante(String nombre, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    
    /**
     * Decidir si el estudiante aprueba o reprueba la materia
     */
    public String calcularResultado() {
        Double promedio = this.calcularPromedio();
        if (promedio >= 3.0) {
            return "APROBÓ";
        } else {
            return "REPROBÓ";
        }
    }

    /**
     * Calcular el promedio del estudiante y retornarlo
     */
    public Double calcularPromedio() {
        // En caso de que no hayan notas el promedio se coloca en 0
        // para no hacer división entre 0
        if (notas.isEmpty()) {
            return 0.0;
        }
        
        Double promedio = 0.0;
        // Se suman todos los elementos recorriendo la lista
        for (int i = 0; i < notas.size(); i++) {
            promedio += notas.get(i);
        }
        // Se divide entre la cantidad de elementos
        promedio /= notas.size();
        return promedio;
    }

    /**
     * Obtener el nombre del estudiante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establecer el nombre del estudiante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener la lista con notas del estudiante 
     */
    public ArrayList<Double> getNotas() {
        return notas;
    }

    /**
     * Establecer la lista con las notas del estudiante
     */
    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
}
