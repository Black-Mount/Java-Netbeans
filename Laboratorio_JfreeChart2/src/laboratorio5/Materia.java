package laboratorio5;

import java.util.ArrayList;

public class Materia {

    private ArrayList<Estudiante> estudiantes; // Estudiantes inscritos en la clase
    private double aprobaron; // Porcentaje que aprueba
    private double reprobaron; // Porcentaje que reprueba



    Materia(ArrayList<Estudiante> estudiantes) {
        // Primero poner los valores en 0
        this.aprobaron = 0.0;
        this.reprobaron = 0.0;
        
        this.estudiantes = estudiantes;

        // Obtener la cantidad que aprueba
        int aprobaron = 0;

        // Por cada estudiante
        for (int i = 0; i < estudiantes.size(); i++) {
            // Si aprobó contarlo
            if (estudiantes.get(i).calcularResultado().equals("APROBÓ")) {
                aprobaron++;
            }
        }

        // Hacer regla de tres para obtener porcentaje de aprobados
        // entonces (aprobaron * estudiantes.size()) / 100 = porcentaje
        this.aprobaron = (aprobaron * 100.0) / estudiantes.size();
        this.reprobaron = 100.0 - this.aprobaron;
    }
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public double getAprobaron() {
        return aprobaron;
    }

    public double getReprobaron() {
        return reprobaron;
    }
}
