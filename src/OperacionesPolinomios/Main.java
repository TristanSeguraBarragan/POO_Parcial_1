/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OperacionesPolinomios;

import java.util.Scanner;

/**
 * 
 * @author Tristán Segura
 */
public class Main {
    private static Scanner leer = new Scanner(System.in);
    private static int opcionPolinomio, opcionPolinomio2, opcionSigno;
    private static char signo;
    private static boolean valor;
    private static Monomio monomio = new Monomio();
    private static Monomio monomio2 = new Monomio();
    private static Binomio binomio = new Binomio();
    private static Binomio binomio2 = new Binomio();
    private static Trinomio trinomio = new Trinomio();
    private static Trinomio trinomio2 = new Trinomio();
    private static char signos[], literales[], signos2[], literales2[]; 
    private static int coeficientes[], coeficientes2[]; 
    private static char resultadoSignos[] = new char[6];
    private static char resultadoLiterales[] = new char[6];
    private static int resultadoCoeficientes[] = new int[6];
    
    public static void ingresarTipoPolinomio(){
        do{
            try{
                System.out.println("INGRESA EL PRIMER TIPO DE POLINOMIO: ");
                System.out.println("1.- MONOMIO.");
                System.out.println("2.- BINOMIO.");
                System.out.println("3.- TRINOMIO.");
                System.out.print("INGRESA LA OPCION DESEADA: ");
                opcionPolinomio = Integer.parseInt(leer.nextLine());
                
                switch(opcionPolinomio){
                    case 1:
                        signos = new char[1];
                        literales = new char[1];
                        coeficientes = new int[1];
                        break;
                    case 2:
                        signos = new char[2];
                        literales = new char[2];
                        coeficientes = new int[2];
                        break;
                    case 3:
                        signos = new char[3];
                        literales = new char[3];
                        coeficientes = new int[3];
                        break;
                    default:
                        break;
                }
                
                ingresarSignosPolinomio();
                ingresarCoeficientesPolinomio();
                ingresarLiteralesPolinomio();
                
                System.out.println("INGRESA EL SEGUNDO TIPO DE POLINOMIO: ");
                System.out.println("1.- MONOMIO.");
                System.out.println("2.- BINOMIO.");
                System.out.println("3.- TRINOMIO.");
                System.out.print("INGRESA LA OPCION DESEADA: ");
                opcionPolinomio2 = Integer.parseInt(leer.nextLine());
                
                switch(opcionPolinomio2){
                    case 1:
                        signos2 = new char[1];
                        literales2 = new char[1];
                        coeficientes2 = new int[1];
                        break;
                    case 2:
                        signos2 = new char[2];
                        literales2 = new char[2];
                        coeficientes2 = new int[2];
                        break;
                    case 3:
                        signos2 = new char[3];
                        literales2 = new char[3];
                        coeficientes2 = new int[3];
                        break;
                    default:
                        break;
                }
                
                ingresarSignosPolinomio2();
                ingresarCoeficientesPolinomio2();
                ingresarLiteralesPolinomio2();
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    public static void ingresarSignosPolinomio(){
        do{
            try{
                for(int i = 0; i<signos.length; i++){
                    System.out.println("SELECIONA EL SIGNO DEL TERMINO "+(i+1)+": ");
                    System.out.println("1.- POSITIVO (+).");
                    System.out.println("2.- NEGATIVO (-).");
                    System.out.print("INGRESA LA OPCION DESEADA: ");
                    opcionSigno = Integer.parseInt(leer.nextLine());
                    switch(opcionSigno){
                        case 1:
                            signos[i] = '+';
                            valor = true;
                            break;
                        case 2:
                            signos[i]= '-';
                            valor = true;
                            break;
                        default:
                            System.out.println("NO EXISTE ESA OPCION");
                            valor = false;
                            break;
                    }
                }
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    public static void ingresarCoeficientesPolinomio(){
        do{
            try{
                for(int i = 0; i<coeficientes.length; i++){
                    System.out.print("INGRESA EL COEFICIENTE DEL TERMINO "+(i+1)+": ");
                    coeficientes[i] = Integer.parseInt(leer.nextLine());
                }
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    public static void ingresarLiteralesPolinomio(){
        do{
            try{
                for(int i = 0; i<coeficientes.length; i++){
                    System.out.print("INGRESA LA LITERAL DEL TERMINO "+(i+1)+": ");
                    literales[i] = leer.nextLine().charAt(0);
                }
            }catch(Exception e){
                
            }
        }while(valor == false);
    }
    
    public static void ingresarSignosPolinomio2(){
        do{
            try{
                for(int i = 0; i<signos2.length; i++){
                    System.out.println("SELECIONA EL SIGNO DEL TERMINO "+(i+1)+": ");
                    System.out.println("1.- POSITIVO (+).");
                    System.out.println("2.- NEGATIVO (-).");
                    System.out.print("INGRESA LA OPCION DESEADA: ");
                    opcionSigno = Integer.parseInt(leer.nextLine());
                    switch(opcionSigno){
                        case 1:
                            signos2[i] = '+';
                            valor = true;
                            break;
                        case 2:
                            signos2[i]= '-';
                            valor = true;
                            break;
                        default:
                            System.out.println("NO EXISTE ESA OPCION");
                            valor = false;
                            break;
                    }
                }
                
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    public static void ingresarCoeficientesPolinomio2(){
        do{
            try{
                for(int i = 0; i<coeficientes2.length; i++){
                    System.out.print("INGRESA EL COEFICIENTE DEL TERMINO "+(i+1)+": ");
                    coeficientes2[i] = Integer.parseInt(leer.nextLine());
                }
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    public static void ingresarLiteralesPolinomio2(){
        do{
            try{
                for(int i = 0; i<coeficientes2.length; i++){
                    System.out.print("INGRESA LA LITERAL DEL TERMINO "+(i+1)+": ");
                    literales2[i] = leer.nextLine().charAt(0);
                }
            }catch(Exception e){
                
            }
        }while(valor == false);
    }
    
    public static void operar(){
            for(int i = 0; i<coeficientes.length; i++){
               for(int x = 0; x<coeficientes2.length; x++){
                   if(literales[i] == literales2[x]){
                       if(signos[i] == signos2[x]){
                           resultadoSignos[i] = signos[i];
                           resultadoCoeficientes[i] = coeficientes[i] + coeficientes2[x];
                           resultadoLiterales[i] = literales[i];
                       }else{
                           if(coeficientes[i] > coeficientes2[x]){
                               resultadoSignos[i] = signos[i];
                               resultadoCoeficientes[i] = coeficientes[i] - coeficientes2[x];
                               resultadoLiterales[i] = literales[i];
                           }
                           else{
                               resultadoSignos[i] = signos2[x];
                               resultadoCoeficientes[i] = coeficientes2[x] - coeficientes[i];
                               resultadoLiterales[i] = literales2[x];
                           }
                       }
               }
               } 
            }
    }
    
    public static void definirPolinomios(){
        switch(opcionPolinomio){
            case 1:
                monomio.setSigno(signos);
                monomio.setCoeficientes(coeficientes);
                monomio.setLiterales(literales);
                break;
            case 2:
                binomio.setSigno(signos);
                binomio.setCoeficientes(coeficientes);
                binomio.setLiterales(literales);
                break;
            case 3:
                trinomio.setSigno(signos);
                trinomio.setCoeficientes(coeficientes);
                trinomio.setLiterales(literales);
                break;
        }
        
        switch(opcionPolinomio2){
            case 1:
                monomio2.setSigno(signos);
                monomio2.setCoeficientes(coeficientes);
                monomio2.setLiterales(literales);
                break;
            case 2:
                binomio2.setSigno(signos);
                binomio2.setCoeficientes(coeficientes);
                binomio2.setLiterales(literales);
                break;
            case 3:
                trinomio2.setSigno(signos);
                trinomio2.setCoeficientes(coeficientes);
                trinomio2.setLiterales(literales);
                break;
        }
    }
    
    public static void mostrarPolinomio(){
        System.out.print("PRIMER POLINOMIO: ");
        for(int i = 0; i<coeficientes.length; i++){
            System.out.print(signos[i]);
            System.out.print(coeficientes[i]);
            System.out.print(literales[i]);
        }
        System.out.println("");
    }
    
    public static void mostrarPolinomio2(){
        System.out.print("SEGUNDO POLINOMIO: ");
        for(int i = 0; i<coeficientes2.length; i++){
            System.out.print(signos2[i]);
            System.out.print(coeficientes2[i]);
            System.out.print(literales2[i]);
        }
        System.out.println("");
    }
    
    public static void mostrarResultado(){
        System.out.print("RESULTADO: ");
        for(int i = 0; i<resultadoCoeficientes.length; i++){
            if(resultadoCoeficientes[i] != 0){
                System.out.print(resultadoSignos[i]);
                System.out.print(resultadoCoeficientes[i]);
                System.out.print(resultadoLiterales[i]);
            }  
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        ingresarTipoPolinomio();
        definirPolinomios();
        operar();
        mostrarPolinomio();
        mostrarPolinomio2();
        mostrarResultado();
        
    }
}
