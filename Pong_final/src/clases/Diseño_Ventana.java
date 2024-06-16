/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import javax.swing.*;

import Movimiento_Juego.Movimiento_Juego;

public class Diseño_Ventana extends JFrame {

    Diseño_Tablero canvas;
    Control_Pelota p = new Control_Pelota();

    public Diseño_Ventana() {
        setTitle("Ping Pong en Hilos");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        canvas = new Diseño_Tablero();
        add(canvas);

        addKeyListener(new Control_Teclas());
        new Movimiento_Juego(canvas).start();
    }

}
