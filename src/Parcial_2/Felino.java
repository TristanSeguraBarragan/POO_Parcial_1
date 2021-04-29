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
public class Felino extends Mamiferos{
    protected String domesticable;
    protected boolean pelaje;

    public Felino(String domesticable, boolean pelaje, String habitat, int numeroDePatas, String sexo, String tipoAlimentacion, int edad, double peso, String tipoAnimal, String region) {
        super(habitat, numeroDePatas, sexo, tipoAlimentacion, edad, peso, tipoAnimal, region);
        this.domesticable = domesticable;
        this.pelaje = pelaje;
    }

    public String getDomesticable() {
        return domesticable;
    }

    public void setDomesticable(String domesticable) {
        this.domesticable = domesticable;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public void subeArbol(){
        System.out.println("*SUBE UN ARBOL*");
    }
    
    
}
