
package Punto_4;
import Punto_4.usuario;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class metordenam {
   
    /*
        Métodos burbuja para Edad y Cedula
    */
    public void edadBurbuja(usuario[] arregloOrdenar)
    {
    boolean flag = false;
        usuario tmp;

        while(!flag) {
            flag = true;
            for (int x = 0; x < arregloOrdenar.length - 2; x++) {
                if (arregloOrdenar[x].getAge() > arregloOrdenar[x+1].getAge()) {
                    tmp = arregloOrdenar[x];
                    arregloOrdenar[x] = arregloOrdenar[x+1];
                    arregloOrdenar[x+1] = tmp;
                    flag = false;
                }
            }
        }
    }
    public void cedBurbuja(usuario[] arregloOrdenar)
    {
    boolean flag = false;
        usuario tmp;

        while(!flag) {
            flag = true;
            for (int x = 0; x < arregloOrdenar.length - 2; x++) {
                if (arregloOrdenar[x].getCed() > arregloOrdenar[x+1].getCed()) {
                    tmp = arregloOrdenar[x];
                    arregloOrdenar[x] = arregloOrdenar[x+1];
                    arregloOrdenar[x+1] = tmp;
                    flag = false;
                }
            }
        }
    }
    
    /*
        Merge Sort para edad
    */

    public void edadMerge(usuario[] arregloOrdenar, int izquierda, int derecha)
    {
        int mid = (izquierda+derecha)/2;


        if (derecha <= izquierda)
            return;
        edadMerge(arregloOrdenar, izquierda, mid);
        edadMerge(arregloOrdenar, mid+1, derecha);
        mergeEdad(arregloOrdenar, izquierda, mid, derecha);
    }

    public void mergeEdad(usuario[] arregloOrdenar, int izquierda, int medio, int derecha)
    {
        int tamanoIzquierda = medio - izquierda + 1;
        int tamanoDerecha = derecha - medio;
        usuario parteIzquierda[] = new usuario[tamanoIzquierda];
        usuario parteDerecha[] = new usuario[tamanoDerecha];


        for (int index = 0; index < tamanoIzquierda; index++)
            parteIzquierda[index] = arregloOrdenar[izquierda + index];
        for (int index= 0; index < tamanoDerecha; index++)
            parteDerecha[index] = arregloOrdenar[medio + index + 1];
        int indiceIzquierdo = 0;
        int indiceDerecho = 0;

        for (int index = izquierda; index < derecha + 1; index++) {
            if (indiceIzquierdo < tamanoIzquierda && indiceDerecho < tamanoDerecha) {
                if (parteIzquierda[indiceIzquierdo].getAge() < parteDerecha[indiceDerecho].getAge()) {
                    arregloOrdenar[index] = parteIzquierda[indiceIzquierdo];
                    indiceIzquierdo++;
                } else {
                    arregloOrdenar[index] = parteDerecha[indiceDerecho];
                    indiceDerecho++;
                }
            }

            else if (indiceIzquierdo < tamanoIzquierda) {
                arregloOrdenar[index] = parteIzquierda[indiceIzquierdo];
                indiceIzquierdo++;
            }
            else if (indiceDerecho < tamanoDerecha) {
                arregloOrdenar[index] = parteDerecha[indiceDerecho];
                indiceDerecho++;
            }
        }
    }
    
    /*
        MergeSort para Cedula
    */
    public void cedMerge(usuario[] arregloOrdenar, int izquierda, int derecha)
        {
            int mid = (izquierda+derecha)/2;


            if (derecha <= izquierda)
                return;
            cedMerge(arregloOrdenar, izquierda, mid);
            cedMerge(arregloOrdenar, mid+1, derecha);
            mergeCed (arregloOrdenar, izquierda, mid, derecha);
        }

        public void mergeCed(usuario[] arregloOrdenar, int izquierda, int medio, int derecha)
        {
            int tamanoIzquierda = medio - izquierda + 1;
            int tamanoDerecha = derecha - medio;
            usuario parteIzquierda[] = new usuario[tamanoIzquierda];
            usuario parteDerecha[] = new usuario[tamanoDerecha];


            for (int x = 0; x < tamanoIzquierda; x++)
                parteIzquierda[x] = arregloOrdenar[izquierda + x];
            for (int x= 0; x < tamanoDerecha; x++)
                parteDerecha[x] = arregloOrdenar[medio + x + 1];
            int indiceIzquierdo = 0;
            int indiceDerecho = 0;

            for (int x = izquierda; x < derecha + 1; x++) {
                if (indiceIzquierdo < tamanoIzquierda && indiceDerecho < tamanoDerecha) {
                    if (parteIzquierda[indiceIzquierdo].getCed() < parteDerecha[indiceDerecho].getCed()) {
                        arregloOrdenar[x] = parteIzquierda[indiceIzquierdo];
                        indiceIzquierdo++;
                    } else {
                        arregloOrdenar[x] = parteDerecha[indiceDerecho];
                        indiceDerecho++;
                    }
                }

                else if (indiceIzquierdo < tamanoIzquierda) {
                    arregloOrdenar[x] = parteIzquierda[indiceIzquierdo];
                    indiceIzquierdo++;
                }
                else if (indiceDerecho < tamanoDerecha) {
                    arregloOrdenar[x] = parteDerecha[indiceDerecho];
                    indiceDerecho++;
                }
            }
        }


}
