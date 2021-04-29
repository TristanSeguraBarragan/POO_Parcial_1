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
public class Mamiferos extends Animal{
    protected String habitat;
    protected int numeroDePatas;
    protected String sexo;

    public Mamiferos(String habitat, int numeroDePatas, String sexo, String tipoAlimentacion, int edad, double peso, String tipoAnimal, String region) {
        super(tipoAlimentacion, edad, peso, tipoAnimal, region);
        this.habitat = habitat;
        this.numeroDePatas = numeroDePatas;
        this.sexo = sexo;
    }
    

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void muerde(){
        System.out.println("*MUERDE A UN DESCONOCIDO*");
    }
}
