/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author LABSIS
 */
public class JavaApplication16 {

    public static void main(String[] args) {
        Leer read = new Leer("Libro1.csv");
        read.leer();
        System.out.println(read.mostrar());
    }
    
}
