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
public abstract class Ave extends Oviparo{
    protected String dietaAlimenticia;
    
    public Ave(){
        super();
    }

    public String getDietaAlimenticia() {
        return dietaAlimenticia;
    }

    public void setDietaAlimenticia(String dietaAlimenticia) {
        this.dietaAlimenticia = dietaAlimenticia;
    }
    
    
}
