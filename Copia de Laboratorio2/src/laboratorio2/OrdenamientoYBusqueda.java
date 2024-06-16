package laboratorio2;

public class OrdenamientoYBusqueda {
    
    //Busqueda
    public void secuencial(int[] arreglo, int dato){
        int posicion = -1;
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == dato){
                posicion = i;
                break;
            }
        }
    }
    
    // Ordenamiento
    public int[] burbuja(int[] arreglo){
        int aux;
        for(int i=0; i < arreglo.length; i++) {
            for (int j = i+1; j < arreglo.length; j++){
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }
    public int[] insercion(int[] arreglo){
        int j, aux;
        
        for (int i = 1; i < arreglo.length;i++){
            aux = arreglo[i];
            j = i-1;
            while(j >= 0 && arreglo[j] > aux){
                arreglo[j+1] = arreglo[j];
                j--;
            }
            arreglo[j+1]=aux;
        }

        return arreglo;
    }
    public int[] seleccion(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[min]) {
                min = j;
                }
            }
            int s = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = s;
        }
        
        return arreglo;
    }
    public int[] mergesort(int[] arreglo){
        merSort(arreglo, 0, arreglo.length-1);
	return arreglo;
    }
    public static void merSort(int[] arreglo, int iz, int de){
        if(iz < de){
            int mid = (iz+de)/2;
            merSort(arreglo, iz, mid);
            merSort(arreglo, mid+1, de);
            merge(arreglo, iz, mid, de);
        }
    }
    public static void merge(int[] arreglo, int iz, int mid, int de) {
        int[] temp = new int[de-iz+1];
        int i = iz;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=de){
            if(arreglo[i] < arreglo[j]){
                temp[k++] = arreglo[i++];
            }else{
                temp[k++] = arreglo[j++];
            }
        }
        
        while(i <= mid){
            temp[k++] = arreglo[i++];
        }
        
        while(j <= de){
            temp[k++] = arreglo[j++];
        }
        
        for(int m=0; m<temp.length; m++){
            arreglo[m+iz] = temp[m];
        }
    }
}
