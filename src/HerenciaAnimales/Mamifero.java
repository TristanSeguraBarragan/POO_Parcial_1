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
public abstract class Mamifero extends Animales{
    protected String tipo;
    
    //COSNTRUCTOR DE LA CLASE HIJA Y LLAMADA AL CONSTRUCTOR DE LA CLASE PADRE
    public Mamifero(){
        super();
    }
    
    //METODOS SET Y GETTER DE ESTA CLASE
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
}
