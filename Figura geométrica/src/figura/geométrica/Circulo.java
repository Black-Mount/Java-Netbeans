/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura.geométrica;
public class Circulo extends FiguraGeométrica 
{
    private int radio;
    public Circulo(int r) {
    radio=r;
}           
public double area(){
    return Math.PI*Math.pow(radio,2);
}
}
