
package ejercicio.clase.teórica;

public class Humanos {
    private String colorCabello="cafe";
    protected String Nombre;
    public int edad;
    private float estatura;
    
    public boolean respirar(boolean mover){
    if(mover==true)  
        return true;
    else
       return false;
    }
    
    public void comer(){
        
    }
    public String getColorCabello(){
        return colorCabello;
    }

    public String getNombre() {
        return Nombre;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
}
