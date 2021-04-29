/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Herencia;

/**
 * 
 * @author Tristan Segura <tristanfsb at outlook.com>
 */
public class Main {
    
    public static void main(String[] args) {
        //Animal animal = new Animal();
        //System.out.println(animal.getColor());
        
        Animal animal = new Animal();
        System.out.println(animal.getColor());
        
        //Mamifero mamifero = new Mamifero();
        //Mamifero mamifero2 = new Mamifero("NEGRO","AZUL");
        
        //System.out.println(mamifero2.getColor());
        
        Mamifero mamifero1 = new Mamifero();
        
        mamifero1.setColor("AZUL");
        mamifero1.setTamano("GRANDE");
        System.out.println(mamifero1.getColor());
        System.out.println(mamifero1.getTamano());
    }
    
}
