/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HerenciaAnimales;

/**
 * 
 * @author Tristan Segura
 */
public class Lobo extends Canino{
    private String color;
    
    //CONSTRUCTOR DE ESTA CLASE Y LLAMADO AL CONSTRUCTOR DE LA CLASE INMEDIATA SUPERIOR
    public Lobo(){
        super();
    }
    
    //METODOS SET Y GETTER DE LAS PROPIEDADES DE ESTA CLASE
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
