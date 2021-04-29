/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencia;

/**
 * 
 * @author Tristan Segura <tristanfsb at outlook.com>
 */
public class Animal {
    protected String color;
    
    public Animal(){
        this.color = "Turquesa";
    }
    
    public Animal(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
