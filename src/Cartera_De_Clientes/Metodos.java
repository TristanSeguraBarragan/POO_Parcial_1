/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cartera_De_Clientes;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tristan Segura
 */
public interface Metodos {
    
    //CLASE INTERFAZ PARA DEFINIR LOS METODOS QUE DEBEN IMPLEMENTARSE EN LA CLASE PRINCIPAL
    public void crearCliente(int ID, int edad, String nombre, String correo, String numero);
    public DefaultTableModel mostrarCliente();
    public void eliminarCliente(int ID);
    public String[] buscarCliente(String nombre);
    public String[] buscarCliente(int ID);
}
