/*

 */
package perfilsantiago;

/**
 *
 * @author Santiago Montenegro
 */
public class Perfil2 {

    String nombre;
    int id;
    int edad;
    String telefono;
    String genero;


    public Perfil2(String nombre, int id, int edad, String telefono, String genero) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.telefono = telefono;
        this.genero = genero;
    }
    

    public Perfil2(){
        
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
    
