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
public class Canino extends Mamiferos{
    protected boolean domesticable;
    protected String raza;

    public Canino(boolean domesticable, String raza, String habitat, int numeroDePatas, String sexo, String tipoAlimentacion, int edad, double peso, String tipoAnimal, String region) {
        super(habitat, numeroDePatas, sexo, tipoAlimentacion, edad, peso, tipoAnimal, region);
        this.domesticable = domesticable;
        this.raza = raza;
    }

    public boolean isDomesticable() {
        return domesticable;
    }

    public void setDomesticable(boolean domesticable) {
        this.domesticable = domesticable;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
}
