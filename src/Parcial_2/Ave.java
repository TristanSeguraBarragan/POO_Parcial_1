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
public class Ave extends Oviparos{
    protected String especie;
    protected String plumaje;

    public Ave(String habitat, String sexo, String tipoFecundacion, String tipoAlimentacion, int edad, double peso, String tipoAnimal, String region) {
        super(habitat, sexo, tipoFecundacion, tipoAlimentacion, edad, peso, tipoAnimal, region);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }
    
    public void vuela(){
        System.out.println("*VUELA, VUELA, NO TE HACE FALTA EQUIPAJE*");
    }
    
    public void anida(){
        System.out.println("*HACE UN HOGAR*");
    }
    
    public void migra(){
        System.out.println("*SE VA DE MOJADO*");
    }
    
    
}
