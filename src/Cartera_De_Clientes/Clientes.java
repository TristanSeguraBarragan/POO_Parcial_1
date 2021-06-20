/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cartera_De_Clientes;

/**
 * 
 * @author Tristan Segura
 */
public class Clientes{
    //CRERACION DE LA CLASE CLIENTES Y DEFINICION DE SUS ATRIBUTOS
    protected int ID, edad;
    protected String correo, nombre, telefono;
    
    //CONSTRUCTOR DE LA CLASE CLIENTES SIN PARAMETROS
    public Clientes(){
        
    }
    
    //CONSTRUCTOR DE LA CLASE CLIENTES CON PARAMETROS
    public Clientes(int ID, int edad, String correo, String nombre, String telefono) {
        this.ID = ID;
        this.edad = edad;
        this.correo = correo;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
