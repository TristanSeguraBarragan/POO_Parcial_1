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
public class Administrador extends Usuario implements InterfazAdmin{
    private String permisos;
    
    public Administrador(){
        super();
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    @Override
    public void eliminarCliente() {
        System.out.println("SE HA ELIMINADO UN CLIENTE RANDOM");
    }

    @Override
    public void crearCliente() {
        System.out.println("SE HA CREADO UN CLIENTE RANDOM");
    }

    @Override
    public void estadoCliente() {
        System.out.println("SE DESPLIEGA EL ESTADO FINANCIERO DE UN CLIENTE");
    }
    
    
}
