/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura.geométrica;
public abstract class FiguraGeométrica {
    //metodo abstracto
    public abstract double area();
    
    public String toString()
    {
        return "area="+area();
    }
    
}
