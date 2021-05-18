/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cuadrilatero;

import java.util.Scanner;

/**
 * 
 * @author Tristán Segura
 */
public class Figuras {
    private Scanner leer = new Scanner(System.in);
    private boolean valor;
    private int figura;
    private double x1, y1;
    private double x2, y2;
    private double x3, y3;
    private double x4, y4;
    private Trapecio trapecio;
    private Rectangulo rectangulo;
    private Cuadrado cuadrado;
    
    public void menuFigura(){
        do{
            try{
                System.out.println("INGRESA EL TIPO DE FIGURA QUE DESEAS CREAR: ");
                System.out.println("1.- TRAPECIO.");
                System.out.println("2.- RECTANGULO.");
                System.out.println("3.- CUADRADO.");
                System.out.print("SELECCIONA LA OPCION: ");
                figura = Integer.parseInt(leer.nextLine());
                capturarCoordenadas();
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE DATO!");
                valor = false;
            }
        }while(valor == false);
    }
    
    public void capturarCoordenadas(){
        do{
            try{
                System.out.println("INGRESA LAS COORDENADAS(PLANO CARTESIANO) DEL CUADRILATERO: ");
                System.out.println("COORDENADA A:");
                System.out.print("X1: ");
                x1 = Double.parseDouble(leer.nextLine());
                System.out.print("Y1: ");
                y1 = Double.parseDouble(leer.nextLine());
                System.out.println("COORDENADA B:");
                System.out.print("X2: ");
                x2 = Double.parseDouble(leer.nextLine());
                System.out.print("Y2: ");
                y2 = Double.parseDouble(leer.nextLine());
                System.out.println("COORDENADA C:");
                System.out.print("X3: ");
                x3 = Double.parseDouble(leer.nextLine());
                System.out.print("Y3: ");
                y3 = Double.parseDouble(leer.nextLine());
                System.out.println("COORDENADA D:");
                System.out.print("X4: ");
                x4 = Double.parseDouble(leer.nextLine());
                System.out.print("Y4: ");
                y4 = Double.parseDouble(leer.nextLine());
                
                crearFigura();
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE DATO!");
                valor = false;
            }
        }while(valor == false);
    }
    
    public void crearFigura(){
        switch(figura){
            case 1:
                trapecio = new Trapecio(x1, y1, x2, y2, x3, y3, x4, y4);
                areaTrapecio();
                if(validarTrapecio()){
                    System.out.println("AREA DEL TRAPECIO: "+ trapecio.getArea());
                }else{
                    System.out.println("¡NO ES UN TRAPECIO!");
                }
                break;
            case 2:
                rectangulo = new Rectangulo(x1, y1, x2, y2, x3, y3, x4, y4);
                areaRectangulo();
                if(validarCuadrado_Rectangulo()){
                    System.out.println("AREA DEL RECTANGULO: "+ rectangulo.getArea());
                }else{
                    System.out.println("¡NO ES UN RECTANGULO!");
                }
                
                break;
            case 3:
                cuadrado = new Cuadrado(x1, y1, x2, y2, x3, y3, x4, y4);
                areaCuadrado();
                if(validarCuadrado_Rectangulo()){
                    System.out.println("AREA DEL CUADRADO: "+ cuadrado.getArea());
                }else{
                    System.out.println("¡NO ES UN CUADRADO!");
                }
                
                break;
            default:
                System.out.println("NO EXISTE ESA OPCION");
        }
    }
    
    public double calcularDistancia(double x, double y, double x2, double y2){
        double distancia = Math.sqrt(Math.pow((x2-x), 2) + Math.pow((y2-y), 2));
        return distancia;
    }
    
    public boolean validarTrapecio(){
        boolean trapecioV = false;
        double suma1, suma2;
        
        //suma1 = y1 + y2;
        //suma2 = y3 + y4;
        
        suma1 = trapecio.getY1() + trapecio.getY2();
        suma2 = trapecio.getY3() + trapecio.getY4();
        
        if(suma1 == suma2){
            trapecioV = true;
        }
        
        return trapecioV;
    }
    
    public boolean validarCuadrado_Rectangulo(){
        boolean rectanguloV = false;
        
        double diagonal1;
        double diagonal2;
        
        diagonal1 = calcularDistancia(x1, y1, x3, y3);
        diagonal2 = calcularDistancia(x2, y2, x4, y4);
        
        if(diagonal1 == diagonal2){
            rectanguloV = true;
        }
        
        return rectanguloV;
    }
    
    public void areaTrapecio(){
        double area = 0;
        double h = y1;
        
        
        trapecio.setB(calcularDistancia(x1, y1, x4, y4));
        trapecio.set_b(calcularDistancia(x2, y2, x3, y3));
        
        while(h < y2){
            h++;
        }
        
        if(h == y2){
            area = ((trapecio.getB()+trapecio.get_b())/2)*h;
        }
        
        trapecio.setArea(area);  
    }
    
    public void areaRectangulo(){
        double area = 0;
        double h;
        double base;
        
        rectangulo.setLado(calcularDistancia(x1, y1, x2, y2));
        rectangulo.setBase(calcularDistancia(x1, y1, x4, y4));
        
        area = rectangulo.getLado() * rectangulo.getBase();
        
        rectangulo.setArea(area);
    }
    
    public void areaCuadrado(){
        double area = 0;
        double lado;
        
        cuadrado.setLado(calcularDistancia(x1, y1, x2, y2));
        
        area = Math.pow(cuadrado.getLado(), 2);
        
        cuadrado.setArea(area);
    }
}
