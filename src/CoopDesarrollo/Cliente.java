/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CoopDesarrollo;

/**
 * 
 * @author Tristan Segura
 */
public class Cliente extends Usuario implements InterfazCliente{
    private String estadoBuroCredito;
    
    public Cliente(){
        super();
    }

    public String getEstadoBuroCredito() {
        return estadoBuroCredito;
    }

    public void setEstadoBuroCredito(String estadoBuroCredito) {
        this.estadoBuroCredito = estadoBuroCredito;
    }

    @Override
    public void pedirPrestamo(double cantidadDesada) {
        cantidadDesada = 100;
        System.out.println("EL CLIENTE HA PEDIDO EN PRESTAMO: $"+ cantidadDesada);
    }

    @Override
    public void cobrarPrestamo(double cantidadDebida) {
        cantidadDebida = 200;
        System.out.println("AL CLIENTE SE LE HA COBRADO: $"+ cantidadDebida);
    }
    
    
}
