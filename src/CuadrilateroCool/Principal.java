/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CuadrilateroCool;

import java.util.Scanner;

/**
 * 
 * @author Tristan Segura
 */
//CLASE MAIN
public class Principal {
    //DEFINICION DE LAS INSTANCIAS Y VARIABLES A UTILIZAR
    private static Scanner leer = new Scanner(System.in);
    private static boolean valor;
    //DEFINICION DE INSTANCIAS DE LOS TIPOS DE CUADRILATEROS PARA ENLAZAR LAS CLASES Y USAR SUS PROPIEDADES
    private static Cuadrado cuadrado = new Cuadrado();
    private static Rectangulo rectangulo = new Rectangulo();
    private static Trapecio trapecio = new Trapecio();
    
    //METODO PARA CAPTURAR LAS COORDENADAS DEL OBJETO TIPO CUADRADO
    public static void capturarCoordenadasCuadrado(){
        do{
            try{
                System.out.println("INGRESA LAS COORDENADAS(PLANO CARTESIANO) DEL CUADRILATERO: ");
                System.out.println("COORDENADA A:");
                System.out.print("X1: ");
                cuadrado.setX1(Double.parseDouble(leer.nextLine()));
                System.out.print("Y1: ");
                cuadrado.setY1(Double.parseDouble(leer.nextLine()));
                System.out.println("COORDENADA B:");
                System.out.print("X2: ");
                cuadrado.setX2(Double.parseDouble(leer.nextLine()));
                System.out.print("Y2: ");
                cuadrado.setY2(Double.parseDouble(leer.nextLine()));
                System.out.println("COORDENADA C:");
                System.out.print("X3: ");
                cuadrado.setX3(Double.parseDouble(leer.nextLine()));
                System.out.print("Y3: ");
                cuadrado.setY3(Double.parseDouble(leer.nextLine()));
                System.out.println("COORDENADA D:");
                System.out.print("X4: ");
                cuadrado.setX4(Double.parseDouble(leer.nextLine()));
                System.out.print("Y4: ");
                cuadrado.setY4(Double.parseDouble(leer.nextLine()));
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE DATO!");
                valor = false;
            }
        }while(valor == false);
    }
    
    //METODO PARA CAPTURAR LAS COORDENADAS DEL OBJETO TIPO RECTANGULO
    public static void capturarCoodernadasRectangulo(){
        do{
            try{
                System.out.println("INGRESA LAS COORDENADAS(PLANO CARTESIANO) DEL CUADRILATERO: ");
                System.out.println("COORDENADA A:");
                System.out.print("X1: ");
                rectangulo.setX1(Double.parseDouble(leer.nextLine()));
                System.out.print("Y1: ");
                rectangulo.setY1(Double.parseDouble(leer.nextLine()));
                System.out.println("COORDENADA B:");
                System.out.print("X2: ");
                rectangulo.setX2(Double.parseDouble(leer.nextLine()));
                System.out.print("Y2: ");
                rectangulo.setY2(Double.parseDouble(leer.nextLine()));
                System.out.println("COORDENADA C:");
                System.out.print("X3: ");
                rectangulo.setX3(Double.parseDouble(leer.nextLine()));
                System.out.print("Y3: ");
                rectangulo.setY3(Double.parseDouble(leer.nextLine()));
                System.out.println("COORDENADA D:");
                System.out.print("X4: ");
                rectangulo.setX4(Double.parseDouble(leer.nextLine()));
                System.out.print("Y4: ");
                rectangulo.setY4(Double.parseDouble(leer.nextLine()));
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE DATO!");
                valor = false;
            }
        }while(valor == false);
    }
    
    //METODO PARA CAPTURAR LAC COORDENADAS DEL OBJETO TIPO TRAPECIO
    public static void capturarCoodernadasTrapecio(){
        do{
            try{
                System.out.println("INGRESA LAS COORDENADAS(PLANO CARTESIANO) DEL CUADRILATERO: ");
                System.out.println("COORDENADA A:");
                System.out.print("X1: ");
                trapecio.setX1(Double.parseDouble(leer.nextLine()));
                System.out.print("Y1: ");
                trapecio.setY1(Double.parseDouble(leer.nextLine()));
                System.out.println("COORDENADA B:");
                System.out.print("X2: ");
                trapecio.setX2(Double.parseDouble(leer.nextLine()));
                System.out.print("Y2: ");
                trapecio.setY2(Double.parseDouble(leer.nextLine()));
                System.out.println("COORDENADA C:");
                System.out.print("X3: ");
                trapecio.setX3(Double.parseDouble(leer.nextLine()));
                System.out.print("Y3: ");
                trapecio.setY3(Double.parseDouble(leer.nextLine()));
                System.out.println("COORDENADA D:");
                System.out.print("X4: ");
                trapecio.setX4(Double.parseDouble(leer.nextLine()));
                System.out.print("Y4: ");
                trapecio.setY4(Double.parseDouble(leer.nextLine()));
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE DATO!");
                valor = false;
            }
        }while(valor == false);
    }
    
    //METODO PARA CAPTURAR EL TIPO DE CUADRILITAREO SELECCIONADO
    public static int menuFigura(){
        int figura = 0;
        
        do{
            try{
                System.out.println("INGRESA EL TIPO DE FIGURA QUE DESEAS CREAR: ");
                System.out.println("1.- TRAPECIO.");
                System.out.println("2.- RECTANGULO.");
                System.out.println("3.- CUADRADO.");
                System.out.print("SELECCIONA LA OPCION: ");
                figura = Integer.parseInt(leer.nextLine());
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE DATO!");
                valor = false;
            }
        }while(valor == false);
        
        return figura;
    }
    
    //METODO PRINCIPAL PARA EJECUTAR DEFINIR LAS COORDENADAS
    //DE LA FIGURA DEPENDIENDO DEL TIPO DE CUADRILATERO SELECCIONADO
    public static void construir(){
        int opcion = menuFigura();
        
        switch(opcion){
            case 1: 
                capturarCoodernadasTrapecio();
                if(validar_trapecio()){
                    trapecio.setArea(trapecio.calcularArea());
                    System.out.println("AREA DEL TRAPECIO: "+ trapecio.getArea());
                }else{
                    System.out.println("NO ES UN TRAPECIO!");
                }
                break;
            case 2:
                capturarCoodernadasRectangulo();
                if(validar_rectangulo()){
                    rectangulo.setArea(rectangulo.calcularArea());
                    System.out.println("AREA DEL RECTANGULO: "+ rectangulo.getArea());
                }else{
                    System.out.println("NO ES UN RECTANGULO!");
                }
                break;
            case 3:
                capturarCoordenadasCuadrado();
                if(validar_cuadrado()){
                    cuadrado.setArea(cuadrado.calcularArea());
                    System.out.println("AREA DEL CUADRADO: "+ cuadrado.getArea());
                }else{
                    System.out.println("NO ES UN CUADRADO!");
                }
                break;
            default: 
                break;
        }
    }
    
    //METODO PARA VALIDAR QUE LAS COORDENADAS INGRESADAS SI CONFORMAN UN CUADRADO
    public static boolean validar_cuadrado(){
        boolean verdad = false;
        double recta1, recta2, recta3, recta4;
        
        recta1 = cuadrado.calcularDistancia(cuadrado.getX1(), cuadrado.getY1(), cuadrado.getX2(), cuadrado.getY2());
        recta2 = cuadrado.calcularDistancia(cuadrado.getX2(), cuadrado.getY2(), cuadrado.getX3(), cuadrado.getY3());
        recta3 = cuadrado.calcularDistancia(cuadrado.getX3(), cuadrado.getY3(), cuadrado.getX4(), cuadrado.getY4());
        recta4 = cuadrado.calcularDistancia(cuadrado.getX4(), cuadrado.getY4(), cuadrado.getX1(), cuadrado.getY1());
        
        if(((recta1 == recta2 )&(recta2 == recta3))&(((recta3 == recta4))&(recta4 == recta1))){
            verdad = true;
        }else{
            System.out.println("OCURRIO UN ERROR Y NO SE PUEDE IGUALAR");
        }
        
        return verdad;
    }
    
    //METODO PARA VALIDAR QUE LAS COORDENADAS INGRESADAS SI CONFORMAN UN RECTANGULO
    public static boolean validar_rectangulo(){
        boolean verdad = false;
        double recta1, recta2, recta3, recta4;
        
        recta1 = rectangulo.calcularDistancia(rectangulo.getX1(), rectangulo.getY1(), rectangulo.getX2(), rectangulo.getY2());
        recta2 = rectangulo.calcularDistancia(rectangulo.getX2(), rectangulo.getY2(), rectangulo.getX3(), rectangulo.getY3());
        recta3 = rectangulo.calcularDistancia(rectangulo.getX3(), rectangulo.getY3(), rectangulo.getX4(), rectangulo.getY4());
        recta4 = rectangulo.calcularDistancia(rectangulo.getX4(), rectangulo.getY4(), rectangulo.getX1(), rectangulo.getY1());
        
        if((recta1 == recta3)&(recta2 == recta4)){
            verdad = true;
        }else{
            System.out.println("OCURRIO UN ERROR Y NO SE PUEDE IGUALAR");
        }
        
        return verdad;
    }
    
    //METODO PARA VALIDAR QUE LAS COORDENADAS INGRESADAS SI CONFORMAN UN TRAPECIO
    public static boolean validar_trapecio(){
        boolean verdad = false;
        double suma1, suma2;
        
        suma1 = trapecio.getY1() + trapecio.getY2();
        suma2 = trapecio.getY3() + trapecio.getY4();
        
        if(suma1 == suma2){
            verdad = true;
        }else{
            System.out.println("OCURRIO UN ERROR Y NO SE PUEDE IGUALAR");
        }
        
        return verdad;
    }
    
    public static void main(String[] args) {
        construir();
    }
}
