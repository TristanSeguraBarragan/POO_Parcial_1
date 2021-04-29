/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Parcial_2;

/**
 * Tristan Segura <tristanfsb at outlook.com>
 */
public class Perro extends Canino{
    private boolean dueño;

    public Perro(boolean dueño, boolean domesticable, String raza, String habitat, int numeroDePatas, String sexo, String tipoAlimentacion, int edad, double peso, String tipoAnimal, String region) {
        super(domesticable, raza, habitat, numeroDePatas, sexo, tipoAlimentacion, edad, peso, tipoAnimal, region);
        this.dueño = dueño;
    }

    public void ladra(){
        System.out.println("*LADRA*");
    }
    
    public void jugar(){
        System.out.println("*JUEGA CON OTROS PERROS*");
    }
    
    public void cola(){
        System.out.println("*MUEVE SU COLITA*");
    }
    
    
}
