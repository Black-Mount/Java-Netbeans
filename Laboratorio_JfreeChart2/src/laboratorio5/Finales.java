package laboratorio5;

/**
 * Nota final de un estudiante para colcoar en la tabla
 */
public class Finales {
    private Estudiante estudiante; // Estudiante a calcular
    private String nombreEstudiante; // Nombre del estudiante
    private Double definitiva; // Nota definitiva numerica
    private String resultado; // Reprobó o Aprobó

    /**
     * Calcular las notas finales de un estudiante
     */
    public Finales(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.nombreEstudiante = estudiante.getNombre();
        this.definitiva = estudiante.calcularPromedio();
        this.resultado = estudiante.calcularResultado();
    }

    /**
     * Obtener el nombre del estudiante
     */
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    /**
     * Obtener la nota definitiva en formato texto
     */
    public Double getDefinitiva() {
        return definitiva;
    }

    /**
     * Obtener si aprobó o reprobó
     */
    public String getResultado() {
        return resultado;
    }    
}
