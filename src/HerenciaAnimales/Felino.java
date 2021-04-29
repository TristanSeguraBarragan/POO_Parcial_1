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
public abstract class Felino extends Mamifero{
    protected String tamanoFelino;
    
    public Felino(){
        super();
    }

    public String getTamanoFelino() {
        return tamanoFelino;
    }

    public void setTamanoFelino(String tamanoFelino) {
        this.tamanoFelino = tamanoFelino;
    }
    
}
