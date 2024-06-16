/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfil;

/**
 *
 * @author natog
 */
public class Perfil {
    String usuario;
    String contraseña;
    String identificacion;
    String nombre;
    String apellido;
    String edad;
    String genero;
    String correo;
    String sangre;
    String path;

    public Perfil(String usuario, String contraseña, String id, String nombre, String apellido, String edad, String genero, String email, String rh, String path) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.correo = email;
        this.sangre = rh;
        this.path = path;
    }

    public String getUser() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getId() {
        return identificacion;
    }

    public void setId(String id) {
        this.identificacion = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return correo;
    }

    public void setEmail(String email) {
        this.correo = email;
    }

    public String getRh() {
        return sangre;
    }

    public void setRh(String rh) {
        this.sangre = rh;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
}
