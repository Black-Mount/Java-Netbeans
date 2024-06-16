
package Programa_Jfreechart;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grafica extends JPanel{
  
int x=0;
int y=0;

  public void paintComponent(Graphics g) {
    g.setColor(Color.white);
    g.fillRect(0, 0,getWidth(), getHeight() );
    g.setColor(Color.red);
    g.fillOval(0, y, getWidth()/2, getHeight()/2);
    g.setColor(Color.blue);   
    g.fillOval(300, x, getWidth()/2, getHeight()/2);
  }
  public void run()
  {     
      try{
          while(true){
              while(x<100){
                  Thread.sleep(50);
                  x+=10;
                  repaint();   
              }
              while(x>1){
                  Thread.sleep(50);
                  x-=10;
                  repaint();   
              }
              while(y<100){
                  Thread.sleep(50);
                  y+=10;
                  repaint();   
              }
              while(y>1){
                  Thread.sleep(50);
                  y-=10;
                  repaint();   
              }  
          }
      }catch(Exception e)
      {
          
      }
  }
  
  public static void main(String args[]) {
      
    JFrame frame = new JFrame("OvalPaint");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Grafica panel = new Grafica();
    
    frame.add(panel);    
    frame.setSize(300, 200);
    frame.setVisible(true);
    panel.run();
    
  }
}
    

