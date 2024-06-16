package laboratorio2;
import java.util.Scanner;

public class Laboratorio2 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Escoja el punto del laboratorio para depúrar: ");
        int punto = x.nextInt();
        
        switch (punto){
                case 1:
                    primerPunto();
                    break;
                case 2:
                    segundoPunto();
                    break;
                case 3:
                    tercerPunto();
                    break;
                case 4:
                    cuartoPunto();
                    break;
        }
    }
    
    public static void primerPunto(){
        Scanner objetoIngreso = new Scanner(System.in);
        System.out.println("\n    Bienvenido  \n");
        System.out.print("Ingrese el tamaño del arreglo:  ");
        int a = objetoIngreso.nextInt();
        
        System.out.println("");
        
        int []numA = new int [a];
        for(int i=0;i<numA.length;i++){
            numA [i]=(int)(Math.random()*10+1);
             System.out.print(numA[i]+ "  ");       
        } 
        System.out.println("\n ");
        
        //suma  
        double s = 0;
        for(int i=0;i<numA.length;i++){
            s=s+numA[i];
        }
        
        //media
        double m;
        m=s/a;
        m = Math.rint(m*100)/100;
        
        //varianza
        double sumatoria,v=0; 
        for(int i=0;i<a;i++){
            sumatoria = Math.pow((numA[i] - m), 2);
            v = v + sumatoria;
        }
        v = v /(a-1);
        v= Math.rint(v*100)/100;
        
        //desviación
        double d;
        d = Math.sqrt(v);
        d= Math.rint(d*100)/100;
       
        System.out.println("La suma de los numeros aleatorios es de: " + s);
        System.out.println("La media de los numeros aleatorios es de: " + m);
        System.out.println("La variación de los numeros aleatorios es de: " + v);
        System.out.println("La desviación de los numeros aleatorios es de: " + d);
    }
    public static void segundoPunto(){
        Scanner sc = new Scanner(System.in);
        String cadena;
       
        System.out.println("Escriba cadena de texto: ");
        cadena = sc.nextLine();
        cadena = cadena.toLowerCase();
        
        cambiar(cadena);       
    }
    public static void cambiar(String cadena){
        char[] arreglo;  
        arreglo = cadena.toCharArray();
        int repetido = 0;
        char Caracter = ' ';
        int contador;
        char Mayor;
        for (int i = 0; i < arreglo.length; i++) {
            Mayor = arreglo[i];
            contador = 0;

            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[j] == Mayor) {
                    contador++;
                }
            }
            if (repetido < contador) {
                repetido = contador;
                Caracter = Mayor;
            }
        }
        mostrar(cadena,Caracter);
    }
    public static void mostrar(String cade, char carac){
        cade = cade.replace('a', carac).replace('e', carac).replace('i', carac).replace('o', carac).replace('u', carac);
        
        System.out.println(" " );
        System.out.println(" " );
        System.out.println("" + cade);
    }
    public static void tercerPunto(){
        OrdenamientoYBusqueda metodos = new OrdenamientoYBusqueda();
        Scanner dato = new Scanner(System.in);
        System.out.println("\n\nPUNTO 3: \nEste programa indica cuanto demora en organizar un arreglo con diferentes metodos");
        System.out.print("Ingresa la cantidad de numeros del arreglo (100, 500, 1000, 5000 o 10000): ");
        int n = dato.nextInt();
        
        while (n != 100 && n != 500 && n != 1000 && n != 5000 && n != 10000){
            System.out.print("\nError en ingreso. Vuelva a ingresar un tamaño de 100, 500, 1000, 5000 o 10000: ");
            n = dato.nextInt();
        }
        
        int[] Arreglo = new int[n];
        for(int i = 0; i < Arreglo.length; i++){
            Arreglo[i] = (int)(Math.random()*10+1);
        }
        
        long[] tiempos = new long[4];
        
        long startTime = System.nanoTime();
        metodos.burbuja(Arreglo);
        long endTime = System.nanoTime();
        tiempos[0] = endTime-startTime; 
        
        startTime = System.nanoTime();
        metodos.insercion(Arreglo);
        endTime = System.nanoTime();
        tiempos[1] = endTime-startTime;
        
        startTime = System.nanoTime();
        metodos.seleccion(Arreglo);
        endTime = System.nanoTime();
        tiempos[2] = endTime-startTime;
        
        startTime = System.nanoTime();
        metodos.mergesort(Arreglo);
        endTime = System.nanoTime();
        tiempos[3] = endTime-startTime;
        
        String[] metodo = {" Burbuja ", "Insercion", "Seleccion", "Mergesort"};
        System.out.println("\nPara "+ n +" numeros aleatorios, se demora en cada metodo: " );
        System.out.println("  METODOS  |  TIEMPO(nanosegundos)");
        for(int x=0; x<4; x++){
            System.out.println(" " + metodo[x] + "  \t  " + tiempos[x]);
        }   
    }
    public static void cuartoPunto(){
        Scanner ingreso = new Scanner(System.in);
        int numPersonas, par;
        
        System.out.print("¿Cuantas personas va a registrar?: ");
        numPersonas = ingreso.nextInt();
            
        Persona gente[] = {};
        
        for(int i=0; i<numPersonas; i++){
            System.out.print("Ingrese el nombre " + (i+1) + ": ");
            String n = ingreso.next();   
            System.out.print("Ingrese la cedula " + (i+1) + ": ");
            int c = ingreso.nextInt();
            System.out.print("Ingrese la edad " + (i+1) + ": ");
            int e = ingreso.nextInt();
            
            gente[i] = new Persona(n,c,e,numPersonas);
            System.out.println();   
        }
        
        //int[] edad = new int[numPersonas];
        //int[] cedula = new int[numPersonas];
        //for(int x=0; x<numPersonas; x++){
          //  edad[x] = gente[x].getEdad();
          //  cedula[x] = gente[x].getCedula();
            
           //metodos.mergesort(gente[].getCedula());
            //System.out.println(gente[x].getNombre() + "  " + gente[x].getCedula() + "  " + gente[x].getEdad());  
        //}
        
        System.out.println("Por que parametro quiere ordenar \n1.Edades    2.Cedulas");
        par = ingreso.nextInt();
        while (par != 1 && par != 2){
            System.out.print("\nError en ingreso. Vuelva a ingresar el parametro: ");
            par = ingreso.nextInt();
        }
        
        switch (par){
            case 1:
                gente[numPersonas].ordenarPorEdad(gente[numPersonas].getEdad());
                break;
            case 2:
                gente[numPersonas].ordenarPorCedula();
                break; 
        }
    }
 }


