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
public class Oviparos extends Animal {
    protected String habitat;
    protected String sexo;
    protected String tipoFecundacion;

    public Oviparos(String habitat, String sexo, String tipoFecundacion, String tipoAlimentacion, int edad, double peso, String tipoAnimal, String region) {
        super(tipoAlimentacion, edad, peso, tipoAnimal, region);
        this.habitat = habitat;
        this.sexo = sexo;
        this.tipoFecundacion = tipoFecundacion;
    }
    
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoFecundacion() {
        return tipoFecundacion;
    }

    public void setTipoFecundacion(String tipoFecundacion) {
        this.tipoFecundacion = tipoFecundacion;
    }
    
    
}
