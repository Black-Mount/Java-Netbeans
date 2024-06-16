/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import java.awt.geom.Rectangle2D;


public class Control_Pelota1 {

    private static final int TAMX1 = 15;
    private static final int TAMY1 = 15;
    private double x1 = 50;
    private static double y1 = 1;
    private double dx1 = 1;
    private double dy1 = 1;
   
    private Integer score1 = 0, score2 = 0;
    public static boolean finJuego = false;
    
   
    
    //retorna la pelota (Rectangle2D implementa la interface Shape)
    public Rectangle2D getShape1() {
        return new Rectangle2D.Double(x1, y1, TAMX1, TAMY1);
    }

    public void moverPelota(Rectangle2D limites, boolean colisionR1, boolean colisionR2) {
        x1 += dx1;
        y1 += dy1;

        

        if (colisionR1) {
            dx1 = -dx1;
            x1 = 20;
          
        }
        if (colisionR2) {
            dx1 = -dx1;
            x1 = 755;
           
        }

        if (x1 < limites.getMinX()) {
            score2++; //el puntaje del jugador2 aumenta en uno
           
            x1 = limites.getCenterX();
            y1 = limites.getCenterY();
            dx1 = -dx1;
         
        }

        if (x1 + TAMX1 >= limites.getMaxX()) {
            score1++; //el puntaje del jugador1 aumenta en uno
            
            x1 = limites.getCenterX();
            y1 = limites.getCenterY();
            dx1 = -dx1;
            
        }

        if (y1 < limites.getMinY()) {

            y1 = limites.getMinY();

            dy1 = -dy1;
           
        }

        if (y1 + TAMY1 >= limites.getMaxY()) {

            y1 = limites.getMaxY() - TAMY1;

            dy1 = -dy1;
          
        }

    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    
    
}
