/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos1;

public class ListaEnlazada {
Nodo cabeza;
int size=0;

    public ListaEnlazada() { //constructor
        this.cabeza=null;
    }
    public void agregar(Object obj){ //añadir elementos
        if(cabeza == null) // la lista es nula?
            cabeza=new Nodo(obj); //la vabeza será el primer elemento
        else{
            Nodo temp=cabeza; //se crea un nodo temporal apuntando a la cabeza
            Nodo nuevo= new Nodo(obj); //nodo que desea ingresar
            nuevo.enlazarSiguiente(temp);//se enlaza nuevo y temporal
            cabeza=nuevo;
   
        }
    }
    public boolean isEmpty(){ //lista vacia?
        if(cabeza==null){
        return true;}
                else
            return false;
    }
    public Object obtener (int index){
        int contador=0;
        Nodo temp=cabeza;
        while(contador<index){
            temp=temp.getSiguiente();
            contador++;
        }
        return temp.getValor();
    }
}
