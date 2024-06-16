
package cuarto;

public class Metodos_usuario {
    private int cedula,edad;
    private String nombre;
    public Metodos_usuario(){
        cedula=0;edad=0;nombre="";
    }
    public int getCed() {
        return cedula;
    }
    public int getAge() {
        return edad;
    }
    public String getName() {
        return nombre;
    }
    public void setCed(int ced) {
        cedula = ced;
    }
    public void setAge(int eedad) {
        edad = eedad;
    }
    public void setName(String nnombre) {
        nombre = nnombre;
    }
    
    
    
}
