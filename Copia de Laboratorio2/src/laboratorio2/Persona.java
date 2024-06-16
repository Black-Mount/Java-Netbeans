package laboratorio2;
import java.util.Scanner;

public class Persona{
    public String nombre;
    private long cedula;
    private int edad;
    Persona gente[] = {};
    
    public Persona(String nombre, long cedula, int edad, int numPersonas){
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        gente.push(nombre,cedula,edad);   
        }
        
    }
    
    public void ordenarPorEdad(int[] edades){
        
    }
    
    public void ordenarPorCedula(){
        
    }

    public String getNombre() {
        return nombre;
    }
    public long getCedula() {
        return cedula;
    }
    public int getEdad() {
        return edad;
    }
    
    
     
    
}
