/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HerenciaAnimales;

/**
 * 
 * @author Trsitan Segura
 */
public class Perro extends Canino{
    private String dueno;
    
    //CONSTRUCTOR DE LA CLASE BISNIETA Y LLAMADO AL CONSTRUCTOR DE LA CLASE NIETA
    public Perro(){
        super();
    }
    
    //METODOS SET Y GETTER DE ESTA CLASE
    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
    
    
}
