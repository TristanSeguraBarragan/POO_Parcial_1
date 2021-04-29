/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Parcial_2;

/**
 * 
 * @author Tristan Segura <tristanfsb at outlook.com>
 */
public class Main {
    public static void mostrarLobo(){
        Lobo lobito = new Lobo(false, "blanco", "bosque", 4, "Masculino", "Carnivoro", 5, 20.0, "mamifero", "");
        lobito.setRegion("norte");
        if(lobito.isDomesticable()){
            System.out.println("ES DOMESTICABLE");
        }else{
            System.out.println("NO ES DOMESTICABLE");
        }
        
        System.out.println("TIPO LOBO: "+lobito.getRaza());
        System.out.println("HABITAT: "+lobito.getHabitat());
        System.out.println("NUMERO DE PATAS: "+lobito.getNumeroDePatas());
        System.out.println("SEXO: "+lobito.getSexo());
        System.out.println("DIETA: "+lobito.getTipoAlimentacion());
        System.out.println("EDAD: "+lobito.getEdad());
        System.out.println("PESO: "+lobito.getPeso());
        System.out.println("TIPO ANIMAL: "+lobito.getTipoAnimal());
        System.out.println("REGION: "+lobito.getRegion());
    }
    
    
    public static void main(String[] args) {
        mostrarLobo();
    }
}
