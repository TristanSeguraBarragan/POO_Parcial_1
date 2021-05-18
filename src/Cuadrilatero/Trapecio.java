/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cuadrilatero;

/**
 * 
 * @author Tristán Segura
 */
public class Trapecio extends Cuadrilatero{
    protected double B, b;
    
    public Trapecio(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double get_b() {
        return b;
    }

    public void set_b(double b) {
        this.b = b;
    }

    
    
}
