/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LABSIS
 */
public class Leer {

    private String nombre;
    private ArrayList<ArrayList> Lista;

    public Leer(String nombre) {
        this.nombre = nombre;
        this.Lista = new ArrayList<ArrayList>();
    }

    public String mostrar() {
        String texto = "";
        for (int i = 0; i < Lista.size(); i++) {
            for (int j = 0; j < Lista.get(i).size(); j++) {
                texto += Lista.get(i).get(j) + "\t";
            }
            texto += "\n";
        }
        return texto;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<ArrayList> getLista() {
        return Lista;
    }

    public void leer() {
        try {
            Scanner sc = new Scanner(new File(nombre));
            while (sc.hasNext()) {
                ArrayList<String> Filas = new ArrayList<String>();
                String linea = sc.nextLine();
                String[] separar = linea.split(",");
                for (int i = 0; i < separar.length; i++) {
                    Filas.add(separar[i]);
                }
                Lista.add(Filas);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error Al leer el archivo");
            Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
