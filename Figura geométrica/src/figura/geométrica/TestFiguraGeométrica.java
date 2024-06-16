/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figura.geométrica;
import java.util.Scanner;

public class TestFiguraGeométrica {

public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un valor para el circulo");
    int a= scanner.nextInt();
    System.out.println("Ingrese un valor  de base y altura para el rectangulo");
    int r1= scanner.nextInt();
    int r2= scanner.nextInt();
      System.out.println("Ingrese un valor  de base y altura para el triangulo");
    int t1= scanner.nextInt();
    int t2= scanner.nextInt();
    
    Circulo c= new Circulo(a);
    Rectangulo r= new Rectangulo(r1,r2);
    Triangulo t= new Triangulo(t1,t2);
    
    System.out.println(" El área del circulo es:"+c);
    System.out.println("El área del rectangulo es:"+r);
    System.out.println("El area del triangulo es:"+t);
}
    }
    

