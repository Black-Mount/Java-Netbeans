
package Guia1;

import java.util.Scanner;

public class Consola {
   
        public static void main(String[] args) {
            
        Scanner entrada= new Scanner(System.in);
        Calculadora objeto1= new Calculadora();
            System.out.println("bienvenido, ingrese la operación: \n 1. suma  \n 2. resta");
        int dato=entrada.nextInt();
            System.out.println("ingrese el primer dato:");
            objeto1.a=entrada.nextDouble();
            System.out.println("ingrese el segundo dato:");
            objeto1.b=entrada.nextDouble();
        switch(dato){
            case 1:
                objeto1.suma();
                System.out.println("la suma es:"+ objeto1.c);
                break;
            case 2:
                objeto1.resta();
                System.out.println("la resta es:"+ objeto1.resta());
                break;
            default:
                System.out.println("ERROR");
                break;
        }
        }
    
}
