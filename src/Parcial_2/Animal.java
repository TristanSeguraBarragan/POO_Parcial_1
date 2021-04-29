/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Parcial_2;

/**
 * 
 * @author Tristan Segura <tristanfsb at outlook.com>
 */
public class Animal {
    protected String tipoAlimentacion;
    protected int edad;
    protected double peso;
    protected String tipoAnimal;
    protected String region;
    
    public void comer(){
        System.out.println("*HA INGERIDO ALIMENTO*");
    }
    
    public void defecar(){
        System.out.println("*DEFECA*");
    }
    
    public void dormir(){
        System.out.println("*zzzz*");
    }
    
    public void moverse(){
        System.out.println("*SE MUEVE*");
    }
    
    public void tomaAwa(){
        System.out.println("*TOMA AWA*");
    }
    
    public void muere(){
        System.out.println("*C MUERE*");
    }
    
    public void reproducir(){
        System.out.println("*HACE EL DELICIOSO*");
    }

    public Animal(String tipoAlimentacion, int edad, double peso, String tipoAnimal, String region) {
        this.tipoAlimentacion = tipoAlimentacion;
        this.edad = edad;
        this.peso = peso;
        this.tipoAnimal = tipoAnimal;
        this.region = region;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    
    
}
