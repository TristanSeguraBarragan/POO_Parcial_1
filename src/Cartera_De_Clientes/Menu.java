/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cartera_De_Clientes;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tristan Segura
 */
public class Menu extends javax.swing.JFrame implements Metodos{
    private Clientes cliente = new Clientes();
    private String[] datos = new String[5];
    private boolean valor;
    private Scanner leer = new Scanner(System.in);
    private DefaultTableModel modelo = new DefaultTableModel();
    protected static ArrayList<Clientes> arrayClientes = new ArrayList();
    
    //CONSTRUCTOR DE LA CLASE E INTERFAZ GRAFICA MEUN PRINCIPAL
    public Menu() {
        initComponents();
    }
    
    //MÉTODO PARA CONSTRUIR UN CLIENTE CON SUS ATRIBUTOS
    @Override
    public void crearCliente(int ID, int edad, String nombre, String correo, String numero) {
        do{
            try{
                cliente.setID(ID);
                cliente.setNombre(nombre);
                cliente.setEdad(edad);
                cliente.setCorreo(correo);
                cliente.setTelefono(numero);
                valor = true;
                arrayClientes.add(cliente);
            }catch(Exception e){
                System.out.println("Error: "+ e);
                valor = false;
            }
        }while(valor == false);
    }
    
    //MÉTODO PARA OBTENER LOS DATOS DE UN CLIENTE DE LA LISTA Y GUARDARLOS EN UN ARREGLO Y METERLO
    //EN UN MODELO DE TABLA POR DEFAULT Y DEVUELVE EL MODELO
    @Override
    public DefaultTableModel mostrarCliente() {
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("EDAD");
        modelo.addColumn("CORREO");
        modelo.addColumn("TELEFONO");
        
        for(int i=0;i<arrayClientes.size();i++){
            datos[0] = String.valueOf(arrayClientes.get(i).getID());
            datos[1] = arrayClientes.get(i).getNombre();
            datos[2] = String.valueOf(arrayClientes.get(i).getEdad());
            datos[3] = arrayClientes.get(i).getCorreo();
            datos[4] = arrayClientes.get(i).getTelefono();
            
            modelo.addRow(datos);
        }
        
        return modelo;
        
    }
    
    //MÉTODO PARA ELIMINAR UN CLIENTE A TRAVÉS DEL ID, RECORRIENDO TODA LA LISTA E IR VERIFICANDO
    //QUE EXISTE UNA COINCIDENCIA ENTRE EL INPUT Y UNA POSICIÓN DE LA LISTA
    @Override
    public void eliminarCliente(int ID){
        for(int i = 0; i<arrayClientes.size(); i++){
            if(arrayClientes.get(i).getID() == ID){
                System.out.println("ELIMINADO.");
                arrayClientes.remove(i);
            }
        }
    }
    
    //MÉTODO PARA BUSCAR UN CLIENTE A TRAVÉS DEL ID, RECORRIENDO TODA LA LISTA E IR VERIFICANDO
    //QUE EXISTE UNA COINCIDENCIA ENTRE EL INPUT Y UNA POSICIÓN DE LA LISTA
    //AL ENCONTRAR UNA COINCIDENCIA GUARDA LOS DATOS DEL CLIENTE EN UN ARREGLO PARA DEVOLVERLO
    @Override
    public String[] buscarCliente(int ID){
        String valor[] = new String[5];
        
        for(int i = 0; i<arrayClientes.size(); i++){
            if(arrayClientes.get(i).getID() == ID){
                valor[0] = "ID: "+ arrayClientes.get(i).getID();
                valor[1] = "NOMBRE: "+ arrayClientes.get(i).getNombre();
                valor[2] = "EDAD: "+ arrayClientes.get(i).getNombre();
                valor[3] = "CORREO: "+ arrayClientes.get(i).getCorreo();
                valor[4] = "TELEFONO: "+ arrayClientes.get(i).getTelefono();
            }
        }
        
        return valor;
    }
    
    //MÉTODO PARA BUSCAR UN CLIENTE A TRAVÉS DEL NOMBRE, RECORRIENDO TODA LA LISTA E IR VERIFICANDO
    //QUE EXISTE UNA COINCIDENCIA ENTRE EL INPUT Y UNA POSICIÓN DE LA LISTA.
    //AL ENCONRAR UNA COINCIDENCIA GUARDA LOS DAOTS DEL CLINETE EN UN ARREGLO PARA DEVOLVERLO.
    @Override
    public String[] buscarCliente(String nombre){
        String valor[] = new String[5];
        
        for(int i = 0; i<arrayClientes.size(); i++){
            if(arrayClientes.get(i).getNombre().equals(nombre)){
                valor[0] = "ID: "+ arrayClientes.get(i).getID();
                valor[1] = "NOMBRE: "+ arrayClientes.get(i).getNombre();
                valor[2] = "EDAD: "+ arrayClientes.get(i).getNombre();
                valor[3] = "CORREO: "+ arrayClientes.get(i).getCorreo();
                valor[4] = "TELEFONO: "+ arrayClientes.get(i).getTelefono();
            }
        }
        return valor;
    }
    
    //MÉTODO PARA COMPROBAR EN LA CONSOLA QUE VERIFICA SI EL CLIENTE INGRESADO RECIENTEMENTE SE INGRESÓ CORRECTAMENTE
    public void mostrar(){
        System.out.println("ID: "+ cliente.getID());
        System.out.println("NOMBRE: "+ cliente.getNombre());
        System.out.println("EDAD: "+ cliente.getEdad());
        System.out.println("CORREO: "+ cliente.getCorreo());
        System.out.println("TELEFONO: "+ cliente.getTelefono());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        btnMostrarClientes = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 190, 30));

        btnMostrarClientes.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        btnMostrarClientes.setText("MOSTRAR CLIENTES");
        btnMostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 190, 30));

        btnBuscarCliente.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        btnBuscarCliente.setText("BUSCAR CLIENTE POR NOMBRE");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, 30));

        btnEliminarCliente.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        btnEliminarCliente.setText("ELIMINAR CLIENTE POR ID");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 190, 30));

        btnAgregarCliente.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        btnAgregarCliente.setText("AGREGAR CLIENTES");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 190, 30));

        lblTitulo.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("CARTERA DE CONTACTOS TFSB");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 240, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartera_De_Clientes/Recursos/Clientes.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 260, 190));

        lblFondo.setBackground(new java.awt.Color(255, 255, 255));
        lblFondo.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 13)); // NOI18N
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cartera_De_Clientes/Recursos/Fondo.jpg"))); // NOI18N
        lblFondo.setToolTipText("");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //METODO DE LA ACCION PREDETERMINADA DEL BOTON AGREGAR CLIENTE DE LA VENTANA MENU PRINCIPAL
    //QUE DESPLIEGA UNA VENTANA PARA AGREGAR UN CLIENTE
    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        DatosCliente ventana = new DatosCliente();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    //METODO DEL ACCION PRETEDERMINDA DEL BOTON DE MOSTRAR CLIENTES DE LA VENTANA MENU PRINCIPAL
    //QUE DESPLIEGA UNA VENTANA PARA MOSTRAR TODOS LOS DATOS DE TODOS LOS CLIENTES
    private void btnMostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarClientesActionPerformed
        ListaClientes ventana = new ListaClientes();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMostrarClientesActionPerformed

    //METODO DE LA ACCION PREDETERMINADA DEL BOTON ELIMINAR CLIENTE DE LA VENTANA DE MENU PRNICIPAL
    //QUE DESPLIEGA UNA VENTANA PARA ELIMINAR UN CLIENTE
    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        EliminarCliente ventana = new EliminarCliente();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    //METODO DE LA ACCION PREDETERMINADA DEL BOTON CERRAR
    //QUE CIERRA LA VENTANA DE MENU PRINCIPAL Y TERMINA EL PROCESO DEL PROGRAMA
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
        System.out.println("HASTA LA PROXIMA");
    }//GEN-LAST:event_btnCerrarActionPerformed

    //METODO DE LA ACCION PREDETERMINADA DEL BOTON BUSCAR CLIENTE
    //QUE DESPLIEGA UNA VENTANA PARA BUSCAR UN CLIENTE
    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        BuscarCliente ventana = new BuscarCliente();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnMostrarClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
