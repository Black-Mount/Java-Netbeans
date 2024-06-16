
package estructurasdedatos1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class EstructurasDeDatos1 {

   
    public static void main(String[] args) {
//ejemArreglo();
       ejemploLista(); 
    }

    public static void ejemploArreglo(){
           int a=0;
        int vector[][]= new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {    
              vector[i][j]=a; 
              System.out.print(vector[i][j]);
              a++;
            }
            System.out.println("\n");
            }
            
            
    }
    public static void ejemploLista(){
        ArrayList lista=new ArrayList();
       lista.add("hola");
       lista.add(3.8);
       lista.add('a');
       lista.add(1);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        System.out.println(lista.get(1));
       

         
        
    }
    public static void ejemploPila(){
        Stack pila=new Stack();
        pila.push(3.1);
        pila.pop();
        System.out.println(pila.isEmpty());
        pila.push("Hola");
        pila.push('A');
        pila.push(1);
        pila.push("Programa");
        pila.pop();
        pila.pop();
        pila.pop();
        System.out.println(pila);
    }
    public static void ejemploCola (){
        Queue cola = new LinkedList();
        cola.add(3.1);
        cola.add("Hola");
        cola.add('A');
        cola.add(1);
        cola.add("Programa");
        cola.remove();
        cola.remove();
        cola.remove();
        System.out.println(cola.isEmpty());
        System.out.println(cola);
         
        }
    public static void ejemListaPropia(){
        ListaEnlazada lista1= new ListaEnlazada();
        System.out.println(lista1.isEmpty());
        lista1.agregar('D');
        lista1.agregar(3);
        lista1.agregar(1);
        lista1.agregar('A');
        System.out.println(lista1.obtener(2));
        System.out.println(lista1.isEmpty());
        System.out.println(lista1.size);
    }
}
