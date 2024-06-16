/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradatos2;

import java.util.Stack;
public class Estructuradatos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
}
