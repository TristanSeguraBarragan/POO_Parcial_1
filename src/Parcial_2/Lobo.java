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
public class Lobo extends Canino{
    protected String region;

    public Lobo(boolean domesticable, String raza, String habitat, int numeroDePatas, String sexo, String tipoAlimentacion, int edad, double peso, String tipoAnimal, String region) {
        super(domesticable, raza, habitat, numeroDePatas, sexo, tipoAlimentacion, edad, peso, tipoAnimal, region);
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public void correEnManada(){
        System.out.println("*CORRE CON LA BANDA*");
    }
    
    public void caza(){
        System.out.println("*CAZA SU COMIDITA*");
    }
    
    public void aulla(){
        System.out.println("*HACE UUUUUUUUU*");
    }
    
    
}
