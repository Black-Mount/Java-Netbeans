package g1e6;

import java.util.Scanner;

public class consola {
    
    public static void main(String[] args){
        calculadora calcu = new calculadora();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bienvenido a la calculadora de consola");
        System.out.println("Ingrese el primer valor");
        calcu.a = scan.nextInt();
        System.out.println("Ingrese el segundo valor");
        calcu.b = scan.nextInt();
        
            System.out.println("Qué operacion desea realizar? \n 1. suma \n 2. resta \n 3. multiplicar \n 4. seno"
                    + "\n 5. coseno \n 6. tangente \n 7. raiz \n 8. exponente \n 9. IVA \n 10. division");
            int n = scan.nextInt();
            switch(n){
                case 1:
                    calcu.suma();
                        System.out.println("la suma da: " + calcu.c);
                        break;
                case 2:
                    calcu.resta();
                        System.out.println("la resta da: " + calcu.c);
                        break;
                case 3:
                    System.out.println("la multiplicacion da: " + calcu.mulitiplicacion(calcu.a, calcu.b));
                    break;
                case 4:
                    System.out.println("el seno del valor es: " + calcu.sin(calcu.a));
                    break;
                case 5:
                    System.out.println("el coseno del valor es: " + calcu.cos(calcu.a));
                    break;
                case 6:
                    System.out.println("la tangente del valor es: " + calcu.tan(calcu.a));
                    break;
                case 7:
                    System.out.println("Ingrese la raiz 'n' que quiere sacar: ");
                    calcu.b = scan.nextInt();
                    System.out.println("Ingrese el numero al que aplicara la raiz: ");
                    calcu.a = scan.nextInt();
                    System.out.println("La raiz es: " + calcu.raiz(calcu.a, calcu.b));
                    break;
                case 8:
                    System.out.println("Ingrese la potencia 'n' que quiere sacar: ");
                    calcu.b = scan.nextInt();
                    System.out.println("Ingrese el numero al que aplicara la potencia: ");
                    calcu.a = scan.nextInt();
                    System.out.println("El numero a la potencia es: " + calcu.potencia(calcu.a, calcu.b));
                    break;
                case 9:
                    System.out.println("Ingrese el valor al que quiere sacar el IVA:    ");
                    calcu.a = scan.nextInt();
                    System.out.println("El IVA es: " + calcu.IVA(calcu.a));
                    break;
                case 10:
                    System.out.println("el valor de la division es: " + calcu.division(calcu.a, calcu.b));
                    break; 
                default:
                    System.out.println("El proceso de la calculadora a finalizado.");
                        
            }
    }
    
}
