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
public class Pez extends Oviparos{
    private String tipoAgua;
    private String huesos;

    public Pez(String tipoAgua, String huesos, String habitat, String sexo, String tipoFecundacion, String tipoAlimentacion, int edad, double peso, String tipoAnimal, String region) {
        super(habitat, sexo, tipoFecundacion, tipoAlimentacion, edad, peso, tipoAnimal, region);
        this.tipoAgua = tipoAgua;
        this.huesos = huesos;
    }
    
    public void nada(){
        System.out.println("*NADA*");
    }
    
}
