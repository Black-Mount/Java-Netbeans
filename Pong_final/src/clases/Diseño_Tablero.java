/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;


public class Diseño_Tablero extends JPanel {

    Control_Raqueta r1 = new Control_Raqueta(10, 200);
    Control_Raqueta r2 = new Control_Raqueta(794 - 10 - Control_Raqueta.ANCHO, 200);
    Control_Pelota p = new Control_Pelota();
    Control_Pelota1 p1 = new Control_Pelota1();
    Control_Pelota2 p2 = new Control_Pelota2();
    public Diseño_Tablero() {
        this.setBackground(Color.RED);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.WHITE);
        dibujarPuntaje(g2);
        dibujar(g2);

    }

    private void dibujar(Graphics2D g) {
        Line2D.Double linea = new Line2D.Double(getBounds().getCenterX(), 0, getBounds().getCenterX(), getBounds().getMaxY());

        g.draw(linea);

        g.fill(r1.getRaqueta());
        update();

        g.fill(r2.getRaqueta());
        update();

        g.fill(p.getShape());
        update();
        
        g.fill(p1.getShape1());
        update();
        g.fill(p2.getShape2());
        update();
    }

//actualiza el estado (posicion) de las raquetas y pelota
    private void update() {

        p.moverPelota(getBounds(), colision(r1.getRaqueta()), colision(r2.getRaqueta()));
        p1.moverPelota(getBounds(), colision(r1.getRaqueta()), colision1(r2.getRaqueta()));
        p2.moverPelota(getBounds(), colision(r1.getRaqueta()), colision2(r2.getRaqueta()));
        r1.moverR1(getBounds());
        r2.moverR2(getBounds());
        
    }

    //detecta si existe una colision entre la raqueta y la pelota
    private boolean colision(Rectangle2D r) {
        return p.getShape().intersects(r);
        
    }
 private boolean colision1(Rectangle2D r) {
        return p1.getShape1().intersects(r);
        
    }
 private boolean colision2(Rectangle2D r) {
        return p2.getShape2().intersects(r);
        
    }
    private void dibujarPuntaje(Graphics2D g) {
        Graphics2D g1 = g, g2 = g;
        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);

        g1.drawString(Integer.toString(p.getScore1()), (float) getBounds().getCenterX() - 50, 30);
        g2.drawString(Integer.toString(p.getScore2()), (float) getBounds().getCenterX() + 25, 30);
        if (p.getScore1() == 5) {
            g.drawString("GANÓ FRIJOLITO", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Control_Pelota.finJuego = true;
        }
        if (p.getScore2() == 5) {
            g.drawString("GANÓ AGUACATE", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Control_Pelota.finJuego = true;
        }
    }

}
