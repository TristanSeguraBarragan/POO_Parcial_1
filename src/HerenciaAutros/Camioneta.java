/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HerenciaAutros;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Camioneta extends Auto{
    
    @Override
    public void setColor(String color){
        this.color = color;
    }
    
    @Override
    public String getColor(){
        return color;
    }
}
