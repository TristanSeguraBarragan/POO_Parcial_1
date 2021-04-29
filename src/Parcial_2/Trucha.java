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
public class Trucha extends Pez{
    private String listaPaComer;
    private String color;

    public Trucha(String listaPaComer, String color, String tipoAgua, String huesos, String habitat, String sexo, String tipoFecundacion, String tipoAlimentacion, int edad, double peso, String tipoAnimal, String region) {
        super(tipoAgua, huesos, habitat, sexo, tipoFecundacion, tipoAlimentacion, edad, peso, tipoAnimal, region);
        this.listaPaComer = listaPaComer;
        this.color = color;
    }
    
    public String getListaPaComer() {
        return listaPaComer;
    }

    public void setListaPaComer(String listaPaComer) {
        this.listaPaComer = listaPaComer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void laCocinan(){
        System.out.println("*SE LA COMEN SIN ALBUR*");
    }
    
    
}
