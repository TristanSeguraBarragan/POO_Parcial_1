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
public class Salmon extends Pez{
    private double tamanoMandibula;

    public Salmon(double tamanoMandibula, String tipoAgua, String huesos, String habitat, String sexo, String tipoFecundacion, String tipoAlimentacion, int edad, double peso, String tipoAnimal, String region) {
        super(tipoAgua, huesos, habitat, sexo, tipoFecundacion, tipoAlimentacion, edad, peso, tipoAnimal, region);
        this.tamanoMandibula = tamanoMandibula;
    }

    public double getTamanoMandibula() {
        return tamanoMandibula;
    }

    public void setTamanoMandibula(double tamanoMandibula) {
        this.tamanoMandibula = tamanoMandibula;
    }
    
    
}
