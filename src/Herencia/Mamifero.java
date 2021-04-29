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
public class Mamifero extends Animal{
    
    protected String tamano;
    
    public Mamifero(String tamano, String color) {
        super(color);
        this.tamano = tamano;
    }
    
    public Mamifero(){
        super();
    }
    
    
    //public Mamifero(String colorPadre, String colorHijo){
      //  super(colorPadre);
        //this.color=colorHijo;
   // }
    
    //@Override
    //public String getColor(){
      //  return "COLOR DEL PADRE: "+ super.color;
    //}

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    
    
    
}
