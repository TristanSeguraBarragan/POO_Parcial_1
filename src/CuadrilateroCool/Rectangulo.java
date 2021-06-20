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
public class Rectangulo extends Cuadrilatero{
    private double base, altura;

    public Rectangulo(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double area) {
        super(x1, y1, x2, y2, x3, y3, x4, y4, area);
    }

    public Rectangulo() {
        super();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        double areaRectangulo = 0;
        double baseX, alturaX;
        baseX = calcularDistancia(getX1(), getY1(), getX4(), getY4());
        alturaX = calcularDistancia(getX1(), getY1(), getX2(), getY2());
        setBase(baseX);
        setAltura(alturaX);
        
        areaRectangulo = baseX * alturaX;
        
        return areaRectangulo;
    }
}
