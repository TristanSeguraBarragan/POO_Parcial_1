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
public class Trapecio extends Cuadrilatero{
    private double baseInferior, baseSuperior, altura;

    public Trapecio(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double area) {
        super(x1, y1, x2, y2, x3, y3, x4, y4, area);
    }

    public Trapecio() {
        super();
    }

    public double getBaseInferior() {
        return baseInferior;
    }

    public void setBaseInferior(double baseInferior) {
        this.baseInferior = baseInferior;
    }

    public double getBaseSuperior() {
        return baseSuperior;
    }

    public void setBaseSuperior(double baseSuperior) {
        this.baseSuperior = baseSuperior;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        double areaTrapecio = 0;
        double alturaT = getY1();
        
        
        setBaseInferior(calcularDistancia(getX1(), getY1(), getX4(), getY4()));
        setBaseSuperior(calcularDistancia(getX2(), getY2(), getX3(), getY3()));
        
        while(alturaT < getY2()){
            alturaT++;
        }
        
        if(alturaT == getY2()){
            setAltura(alturaT);
        }
        
        
        areaTrapecio = ((getBaseInferior() + getBaseSuperior())*getAltura())/2;
        
        return areaTrapecio;
    }
    
}
