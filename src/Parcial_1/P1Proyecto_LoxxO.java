package Parcial_1;

import java.util.Scanner;
public class P1Proyecto_LoxxO {
    private static P1Proyecto_Clientes Clientes[];
    private static Scanner leer = new Scanner(System.in);
    private static int tamano, espacios = 0, opcion, codTemporal;
    private static boolean valor = false;
    
    //METODO QUE CAPTURA EL TAMANO DEL ARREGLO E INICIALIZA TODOS LOS OBJETOS DEL MISMO ARREGLO
    public static void capturarTamano(){
        System.out.println("¡BIENVENIDO AL MENU DE LA CADENA DE TIENDAS LOXXO!");
        do{            
            try{
                System.out.print("INGRESA LA CANTIDAD DE CLIENTES QUE POSEE LA CADENA DE TIENDAS LOXXO: ");
                tamano = Integer.parseInt(leer.nextLine());
                Clientes = new P1Proyecto_Clientes[tamano];
                for(int i = 0; i<Clientes.length; i++){
                    Clientes[i] = new P1Proyecto_Clientes();
                }
                valor = true;
                System.out.println("");
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                System.out.println("");
                valor = false;
            }
        }while(valor == false);
    }
    
    //METODO QUE DESPLIEGA EL MENU DE OPCIONES PARA EL USUARIO
    public static void menu(){
        
        do{
            try{
                System.out.println("TAMANO DE CARTERA DE CLIENTES: "+tamano);
                System.out.println("ESPACIO EN LA CARTERA: "+(tamano-espacios));
                System.out.println("1.- AGREGAR CLIENTE.");
                System.out.println("2.- MOSTRAR CLIENTES.");
                System.out.println("3.- BUSCAR CLIENTE.");
                System.out.println("4.- ELIMINAR CLIENTE.");
                System.out.println("0.- SALIR DEL SISTEMA.");
                System.out.print("INGRESA LA OPCION QUE DESEAS: ");
                opcion = Integer.parseInt(leer.nextLine());
                valor = true;
                System.out.println("");
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    //METODO QUE DETECTA LA SELECCION DEL USARIO DEL MENU, Y EN POCAS PALABRAS ES EL METODO PRINCIPAL
    public static void seleccion(){
        do{
            menu();
        switch(opcion){
            case 1:
                insertarCliente();
                break;
            case 2:
                mostrarClientes();
                break;
            case 3:
                buscarCliente();
                break;
            case 0:
                System.out.println("¡HASTA LA PROXIMA!");
                break;
            default:
                System.out.println("¡NO EXISTE LA OPCION QUE HAS INGRESADO!");
        }
        }while(opcion != 0);
    }
    
    //METODO PARA INSERTAR UN CLIENTE DENTRO DEL ARREGLO A TRAVES DE GETTERS Y SETTERS
    public static void insertarCliente(){
        if(espacios < tamano){
            do{
                try{
                    System.out.print("INGRESA EL CODIGO DEL CLIENTE: ");
                    Clientes[espacios].setCodigoCliente(Integer.parseInt(leer.nextLine()));
                    System.out.print("INGRESA EL NOMBRE DEL CLIENTE: ");
                    Clientes[espacios].setNombreCliente(leer.nextLine());
                    System.out.print("INGRRESA EL APELLIDO PATERNO DEL CLIENTE: ");
                    Clientes[espacios].setApellidoPaterno(leer.nextLine());
                    System.out.print("INGRESA EL APELLIDO MATERNO DEL CLIENTE: ");
                    Clientes[espacios].setApellidoMaterno(leer.nextLine());
                    System.out.print("INGRESA EL NUMERO DE TELEFONO DEL CLIENTE: ");
                    Clientes[espacios].setTelefono(leer.nextLine());
                    System.out.print("INGRESA LA DIRECCION DEL CLIENTE: ");
                    Clientes[espacios].setDireccion(leer.nextLine());
                    System.out.print("INGRESA LA EDAD DEL CLIENTE: ");
                    Clientes[espacios].setEdad(Integer.parseInt(leer.nextLine()));
                    valor = true;
                    espacios = espacios + 1;
                    System.out.println("");
                }catch(Exception e){
                    System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                    valor = false;
                }
            }while(valor == false);
            
        }else{
            System.out.println("¡YA NO QUEDAN ESPACIOS!");
            System.out.println("");
        }
    }
    
    //METODO PARA MOSTRAR TODOS LOS CLIENTES DENTRO DEL ARREGLO
    public static void mostrarClientes(){
        if(espacios == 0){
            System.out.println("¡NO EXISTE REGISTRO DE CLIENTES!");
            System.out.println("");
        }else{
            for(int i = 0; i<Clientes.length; i++){
                System.out.println("----------------------------------------------------------------");
                System.out.println("CODIGO DEL CLIENTE: "+Clientes[i].getCodigoCliente());
                System.out.println("NOMBRE DEL CLIENTE: "+Clientes[i].getNombreCliente());
                System.out.println("APELLIDO PATERNO DEL CLIENTE: "+Clientes[i].getApellidoPaterno());
                System.out.println("APELLIDO MATERNO DEL CLIENTE: "+Clientes[i].getApellidoMaterno());
                System.out.println("NUMERO DE TELEFONO DEL CLIENTE: "+Clientes[i].getTelefono());
                System.out.println("DIRECCCION DEL CLIENTE: "+Clientes[i].getDireccion());
                System.out.println("EDAD DEL CLIENTE: "+Clientes[i].getEdad());
                System.out.println("");
            }
        }
    }
    
    //METODO PARA BUSCAR UN CLIENTE 
    public static void buscarCliente(){
        int n = 0, codigo = 0;
        String nombre;
        if(espacios == 0){
            System.out.println("¡NO EXISTE REGIISTRO DE CLIENTES!");
            System.out.println("");
        }else{
            do{
                try{
                    System.out.println("BUSCAR POR:");
                    System.out.println("1.- CODIGO.");
                    System.out.println("2.- NOMBRE.");
                    System.out.println("0.- VOLVER AL MENU ANTERIOR.");
                    System.out.print("INGRESA LA OPCION DESEADA: ");
                    n = Integer.parseInt(leer.nextLine());
                    valor = true;
                }catch(Exception e){
                    System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                    valor = false;
                }
            }while(valor == false);
            //SWITCH PARA IDENTIFICAR SI SERA POR CODIGO O NOMBRE
            
            switch(n){
                case 1:
                    System.out.print("INGRESA EL CODIGO DEL CLIENTE QUE DESEAS BUSCAR: ");
                    codigo = Integer.parseInt(leer.nextLine());
                    mostrarClienteCodigo(codigo);
                    break;
                case 2:
                    System.out.print("INGRESA EL NOMBRE DEL CLIENTE QUE DESEAS BUSCAR: ");
                    nombre = leer.nextLine();
                    mostrarClienteNombre(nombre);
                    break;
                case 0:
                    System.out.println("VOLVIENDO AL MENU ANTERIOR");
                    System.out.println("");
                    break;
                default:
                    System.out.println("¡NO EXISTE LA OPCION QUE HAS INGRESADO!");
                    System.out.println("");
                }
            
        }
    }
    
    //MEOTOD PARA MOSCTRAR UN CLIENTE A TRAVES DE SU CODIGO
    public static void mostrarClienteCodigo(int codigo){
        for(int i = 0; i<Clientes.length; i++){
            
            if(codigo == Clientes[i].getCodigoCliente()){
                System.out.println("----------------------------------------------------------------");
                System.out.println("CODIGO DEL CLIENTEE: "+Clientes[i].getCodigoCliente());
                System.out.println("NOMBRE DEL CLIENTE: "+Clientes[i].getNombreCliente());
                System.out.println("APELLIDO PATERNO DEL CLIENTE: "+Clientes[i].getApellidoPaterno());
                System.out.println("APELLIDO MATERNO DEL CLIENTE: "+Clientes[i].getApellidoMaterno());
                System.out.println("NUMERO DE TELEFONO DEL CLIENTE: "+Clientes[i].getTelefono());
                System.out.println("DIRECCCION DEL CLIENTE: "+Clientes[i].getDireccion());
                System.out.println("EDAD DEL CLIENTE: "+Clientes[i].getEdad());
                System.out.println("");
                break;
            }
        }
    }
    
    //METODO PARA MOSTRAR UN CLIENTE A TRAVES DE SU NOMBRE
    public static void mostrarClienteNombre(String nombre){
        for(int i = 0; i<Clientes.length; i++){
            if(nombre.equals(Clientes[i].getNombreCliente())){
                System.out.println("----------------------------------------------------------------");
                System.out.println("CODIGO DEL CLIENTEE: "+Clientes[i].getCodigoCliente());
                System.out.println("NOMBRE DEL CLIENTE: "+Clientes[i].getNombreCliente());
                System.out.println("APELLIDO PATERNO DEL CLIENTE: "+Clientes[i].getApellidoPaterno());
                System.out.println("APELLIDO MATERNO DEL CLIENTE: "+Clientes[i].getApellidoMaterno());
                System.out.println("NUMERO DE TELEFONO DEL CLIENTE: "+Clientes[i].getTelefono());
                System.out.println("DIRECCCION DEL CLIENTE: "+Clientes[i].getDireccion());
                System.out.println("EDAD DEL CLIENTE: "+Clientes[i].getEdad());
                System.out.println("");
                break;
            }
        }
    }
    
    //METODO MAIN
    public static void main(String[] args) {
        capturarTamano();
        seleccion();
    }
}
