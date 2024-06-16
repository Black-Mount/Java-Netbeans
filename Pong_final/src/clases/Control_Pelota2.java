/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import java.awt.geom.Rectangle2D;


public class Control_Pelota2 {

    private static final int TAMX2 = 15;
    private static final int TAMY2 = 15;
    private double x2 = 0;
    private static double y2 = 0;
    private double dx2 = 0;
    private double dy2 = 0;
   
    private Integer score1 = 0, score2 = 0;
    public static boolean finJuego = false;
    
   
    
    //retorna la pelota (Rectangle2D implementa la interface Shape)
    public Rectangle2D getShape2() {
        return new Rectangle2D.Double(x2, y2, TAMX2, TAMY2);
    }

    public void moverPelota(Rectangle2D limites, boolean colisionR1, boolean colisionR2) {
        x2 += dx2;
        y2 += dy2;

        

        if (colisionR1) {
            dx2 = -dx2;
            x2 = 20;
          
        }
        if (colisionR2) {
            dx2 = -dx2;
            x2 = 755;
           
        }

        if (x2 < limites.getMinX()) {
            score2++; //el puntaje del jugador2 aumenta en uno
           
            x2 = limites.getCenterX();
            y2 = limites.getCenterY();
            dx2 = -dx2;
         
        }

        if (x2 + TAMX2 >= limites.getMaxX()) {
            score1++; //el puntaje del jugador1 aumenta en uno
            
            x2 = limites.getCenterX();
            y2 = limites.getCenterY();
            dx2 = -dx2;
            
        }

        if (y2 < limites.getMinY()) {

            y2 = limites.getMinY();

            dy2 = -dy2;
           
        }

        if (y2 + TAMY2 >= limites.getMaxY()) {

            y2 = limites.getMaxY() - TAMY2;

            dy2 = -dy2;
          
        }

    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    
    
}
