
package ejemplo1;

public class CuentaB {
  private String nombre;
private int clave;

private double saldo;
private int numCuenta;

public void cancelarCuenta(){
    
}

public double getSaldo(int a){
  if(clave==a)
    return saldo;
  else
      return 0;
}

}
