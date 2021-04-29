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
public abstract class Animales implements Comportamientos{
    protected String genero;
    protected String habitat;
    protected int edad;
    
    //CONSTRUCTRO DE LA CLASE PADRE
    public Animales(){
        
    }
    
    //METODOS SET Y GETTER DE LA CLASE PADRE
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //METODOS SOBRE-ESCRITOS DE LA CLASE ABSTRACTA DE COMPORTAMIENTOS
    @Override
    public void comer(){
        System.out.println("INGIERE ALIMENTO");
    }
    
    @Override
    public void dormir(){
        System.out.println("DUERME UN PAR DE HORAS");
    }
    
    @Override
    public void baño(){
        System.out.println("PROCEDE A HACER SUS NECESIDADES");
    }
}
