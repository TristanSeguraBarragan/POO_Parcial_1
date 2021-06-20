/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CuadrilateroCool;

/**
 * 
 * @author Tristan Segura
 */
public class Cuadrado extends Cuadrilatero{

    public Cuadrado(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double area) {
        super(x1, y1, x2, y2, x3, y3, x4, y4, area);
    }

    public Cuadrado() {
        super();
    }
    
    @Override
    public double calcularArea(){
        double areaCuadrado = 0;
        
        areaCuadrado = Math.pow(calcularDistancia(getX1(), getY1(), getX2(), getY2()), 2);
        
        return areaCuadrado;
    }
}
