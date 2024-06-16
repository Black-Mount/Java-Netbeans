package g1e6;

public class calculadora{

    //Atributos
    public int a,b,c;
    public double r;
    
    //Metodos
    public void suma(){
        c = a + b;
    }
    
    public void resta(){
        c = a - b;
    }
    
    public int mulitiplicacion(int a, int b){
        c = a*b;
        return c;
    }
    
    public double division(double a, double b){
        r = a/b;
        return r;
    }
    
    public double sin(double a){
        r = Math.sin(a);
        return r;
    }
    
    public double cos(double a){
        r = Math.cos(a);
        return r;
    }
    
    public double tan(double a){
        r = Math.tan(a);
        return r;
    }
    
    public double potencia(double a, double b){
        r = Math.pow(a,b);
        return r;
    }
    
    public double raiz(double a, double b){
        r = Math.pow(a,(double) 1 / b);
        return r;
    }
    
    public double IVA(double a){
        r = 19 * (a / 100);
        return r;
    }
}