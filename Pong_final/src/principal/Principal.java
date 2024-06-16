/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.Diseño_Ventana;
import javax.swing.JFrame;



public class Principal {
    public static void main(String[] args) {
        Diseño_Ventana ventana = new Diseño_Ventana();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
