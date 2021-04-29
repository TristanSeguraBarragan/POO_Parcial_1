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
public abstract class Oviparo extends Animales{
    protected boolean acuatico;
    
    public Oviparo(){
        super();
    }

    public boolean isAcuatico() {
        return acuatico;
    }

    public void setAcuatico(boolean acuatico) {
        this.acuatico = acuatico;
    }
    
    
}
