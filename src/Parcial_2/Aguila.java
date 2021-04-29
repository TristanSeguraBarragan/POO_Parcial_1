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
public class Aguila extends Ave{
    private String tipoAguila;

    public Aguila(String tipoAguila, String habitat, String sexo, String tipoFecundacion, String tipoAlimentacion, int edad, double peso, String tipoAnimal, String region) {
        super(habitat, sexo, tipoFecundacion, tipoAlimentacion, edad, peso, tipoAnimal, region);
        this.tipoAguila = tipoAguila;
    }

    public String getTipoAguila() {
        return tipoAguila;
    }

    public void setTipoAguila(String tipoAguila) {
        this.tipoAguila = tipoAguila;
    }
    
    public void vuelaAlto(){
        System.out.println("*SE VA LEJOS PAL CIELO*");
    }
    
    
}
