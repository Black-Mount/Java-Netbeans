/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movimiento_Juego;

import clases.Diseño_Tablero;
import clases.Control_Pelota;


public class Movimiento_Juego extends Thread {

    private final Diseño_Tablero canvas;

    public Movimiento_Juego(Diseño_Tablero canvas) {
        this.canvas = canvas;
    }

    @Override
    public void run() {
        while (!Control_Pelota.finJuego) {
            canvas.repaint();
            try {
                //Velocidad del juego
                Thread.sleep(10);
            } catch (Exception ex) {
                System.out.println("error in graphics engine: " + ex.getMessage());
            }
        }
    }
}
