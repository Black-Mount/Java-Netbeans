/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura.geométrica;


public class Triangulo extends FiguraGeométrica{
private double base;
private double altura;

public Triangulo(double b, double h){
    base=b;
    altura=h;
}
public double area(){
    return (base*altura)/2;
    
}
}
