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
public abstract class Canino extends Mamifero{
    protected String raza;
    
    //CONSTRUCTOR DE LA CLASE NIETA Y LLAMADA AL CONSTRUCTOR DE LA CLASE INMEDIATA HIJA
    public Canino(){
        super();
    }
    
    //METODOS SET Y GETTER DE ESTA CLASE
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
