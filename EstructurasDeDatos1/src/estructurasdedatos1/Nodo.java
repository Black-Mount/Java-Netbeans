/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos1;

public class Nodo {
    Object valor;//elemento contenedor
    Nodo siguiente; // puntero
    
    public Nodo (Object valor) { //constructor
        this.valor= valor;
        this.siguiente = null;
        
    }
    public Object getValor() { //consultor
        return valor;
    }
    public void enlazarSiguiente (Nodo n) {
        siguiente=n; //se apunta hacia el siguiente nodo
    }
    public Nodo getSiguiente () { // consultor
        return siguiente;
    }
}
