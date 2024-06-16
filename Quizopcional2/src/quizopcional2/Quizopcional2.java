/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizopcional2;

import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Quizopcional2 {

    public static void main(String[] args) {     
    
        
       ArrayList lista1= new ArrayList();

         lista1.add("Juan");    

         lista1.add(5.0f);

         lista1.add(4.0f);

         lista1.add(1.0f);

         lista1.add(2.0f);

       ArrayList lista2= new ArrayList();

         lista2.add("David");    

         lista2.add(3.0f);

         lista2.add(3.1f);

         lista2.add(3.2f);

         lista2.add(1.0f);

       ArrayList lista3= new ArrayList();

         lista3.add("Ana");    

         lista3.add(4.5f);

         lista3.add(5.0f);

         lista3.add(2.0f);

         lista3.add(1.9f);

       ArrayList lista4= new ArrayList();

         lista4.add("Sofia");    

         lista4.add(2.1f);

         lista4.add(3.1f);

         lista4.add(3.1f);

         lista4.add(3.3f);

   ArrayList ListaA= new ArrayList();

    ListaA.add(lista1);

    ListaA.add(lista2);

    ListaA.add(lista3);

    ListaA.add(lista4);

       notas(ListaA);
    }
    
  private static void notas(ArrayList ListaA) {

        ArrayList plista = new ArrayList();
        
        float prom=0;
        
        for (int i = 0; i < ListaA.size(); i++) {
            float persona=0;
            plista=(ArrayList)ListaA.get(i);
            System.out.println("Alumno : "+plista.get(0));
            
            for (int p = 1; p < plista.size(); p++) {
                persona+=new Float(plista.get(p).toString());
            }
            
        
  
   