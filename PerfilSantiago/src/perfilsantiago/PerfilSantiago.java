/*

 */
package perfilsantiago;

import java.util.Scanner;

/**
 *
 * @author Santiago Montenegro
 */
public class PerfilSantiago {
public static Perfil2 me; 

    
 
    public static Perfil2 yo;
    
    public static void main(String[] args) {
        System.out.println("Crea tu perfil");
        
        yo = new Perfil2();
        
       
        editarPerfil();
        menu();
    } 
    
    public static void menu(){
        int seleccion;
        System.out.println("1- Edita tu perfil");
        System.out.println("2- Mira tu perfil");
        System.out.println("3- Salir");
        seleccion = Integer.parseInt(escribir("Ingrese Su Selección"));
        
        switch(seleccion){
            case 1:
                editarPerfil();
                
                menu();
                break;
                
            case 2:
                imprimirPerfil();
            
                menu();
                break;
                
            case 3:
                break;
                
            default:
                System.out.println("Seleccion Invalida");
                menu();
        }
        
    }
    
    public static void editarPerfil(){
        yo.setId(Integer.parseInt(escribir("Ingresa tu ID")));
        yo.setNombre(escribir("Ingresa tu Nombre"));
        yo.setEdad(Integer.parseInt(escribir("Ingresa tu Edad")));
        yo.setTelefono(escribir("Ingresa tu numero de telefono"));
        yo.setGenero(escribir("Ingresa tu Genero(F/M)"));
    }
    
    public static void imprimirPerfil(){
        System.out.println("ID: " + yo.getId());
        System.out.println("Nombre: " + yo.getNombre());
        System.out.println("Edad: " + yo.getEdad());
        System.out.println("Telefono: " + yo.getTelefono());
        System.out.println("Genero: " + yo.getGenero());
    }
    
    public static String escribir(String message) {
        System.out.println(message);
        Scanner scn = new Scanner(System.in);
        return scn.next();
    }
    
}