
package quiz.opcional;

/**
 Santiago Montenegro
 */
public class AlgoritmosByO {
    
     public static void insercion(Integer[] dato) {
    for (int i = 1; i < dato.length; i++) {
            Integer valor = dato[i];
            int x = i - 1;
            while (x >= 0 && dato[x] > valor) {
                dato[x + 1] = dato[x];
                x--;
            }
            dato[x + 1] = valor;
        }
    }
     
      public static void seleccion(Integer[] dato) {
        for (int i = 0; i < dato.length; i++) {
            for (int x = i; x < dato.length; x++) {
                if (dato[i] > dato[x]) {
                    Integer valor = dato[x];
                    dato[x] = dato[i];
                    dato[i] = valor;
                }
            }
        }
    }
      
     public static void burbuja(Integer[] dato) {
        for (int i = 0; i < dato.length; i++){
            for (int j = 0; j < dato.length - 1; j++){
                if (dato[j] > dato[j + 1]) {
                    Integer temp = dato[j];
                    dato[j] = dato[j + 1];
                    dato[j + 1] = temp;
                }
            }
        }
    }
     
    public void sort(int arr[], int left, int right){
    if(left < right){
      int middle = (left + right) / 2;
      sort(arr, left, middle);
      sort(arr, middle+1, right);
      merge(arr, left, middle, right);
    } {
    
    }

    public void merge() {

    }

    public void printArray() {

    }
}

        