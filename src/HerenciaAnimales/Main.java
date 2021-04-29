/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HerenciaAnimales;
import java.util.Scanner;
/**
 * 
 * @author Tristan Segura
 */
public class Main {
    private static Scanner leer = new Scanner(System.in);
    private static boolean valor;
    private static int opcion, opcionPrincipal, opcionAnimal, opcionAccion;
    private static String animal;
    private static Perro perro = new Perro();
    private static Lobo lobo = new Lobo();
    private static Gato gato = new Gato();
    private static Tigre tigre = new Tigre();
    private static Aguila aguila = new Aguila();
    private static Paloma paloma = new Paloma();
    private static Trucha trucha = new Trucha();
    private static Salmon salmon = new Salmon();
    
    public static void menuPrincipal(){
        do{
            try{
                System.out.println("SELECCIONA LA ACCION QUE DESEAS REALIZAR:");
                System.out.println("1.- DAR DE ALTA UN ANIMAL.");
                System.out.println("2.- SELECCIONAR UN ANIMAL.");
                System.out.println("0.- SALIR");
                System.out.print("INGRESA LA OPCION DESEADA: ");
                opcionPrincipal = Integer.parseInt(leer.nextLine());
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRRESAR OTRO TIPO DE DATO!");
                valor = false;
            }
        }while(valor == false);
    }
    
    public static void menuAnimal(){
        do{
            try{
                System.out.println("SELECCIONA EL ANIMAL QUE DESEAS: ");
                System.out.println("1.- PERRO.");
                System.out.println("2.- LOBO.");
                System.out.println("3.- GATO.");
                System.out.println("4.- TIGRE.");
                System.out.println("5.- AGUILA.");
                System.out.println("6.- PALOMA.");
                System.out.println("7.- TRUCHA.");
                System.out.println("8.- SALMON.");
                System.out.println("0.- SALIR");
                System.out.print("INGRESA EL ANIMAL QUE DESEAS: ");
                opcionAnimal = Integer.parseInt(leer.nextLine());
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRRESAR OTRO TIPO DE DATO!");
                valor = false;
            }
        }while(valor == false);
    }
    
    public static void seleccionAccionesAnimal(){
        do{
            menuAnimal();
            switch(opcionAnimal){
                case 1:
                    seleccionAccionPerro();
                    break;
                case 2:
                    seleccionAccionLobo();
                    break;
                case 3:
                    seleccionAccionGato();
                    break;
                case 4:
                    seleccionAccionTigre();
                    break;
                case 5:
                    seleccionAccionAguila();
                    break;
                case 6:
                    seleccionAccionPaloma();
                    break;
                case 7:
                    seleccionAccionTrucha();
                    break;
                case 8:
                    seleccionAccionSalmon();
                    break;
                default:
                    System.out.println("NO EXISTE ESA OPCION");
                    System.out.println("");
                    break;
            }
        }while(opcionAnimal != 0);
    }
    
    public static void menuAcciones(){
        do{
            try{
                System.out.println("MENU DE ACCIONES DE ANIMAL: ");
                System.out.println("1.- COMER");
                System.out.println("2.- DORMIR");
                System.out.println("3.- IR AL BAÑO");
                System.out.println("0.- SALIR");
                System.out.print("INGRESA LA OPCION QUE DESEAS: ");
                opcionAccion = Integer.parseInt(leer.nextLine());
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRRESAR OTRO TIPO DE DATO!");
                valor = false;
            }
        }while(valor == false);
    }
    
    public static void seleccionAccionPerro(){
        do{
            menuAcciones();
            switch(opcionAccion){
                case 1:
                    System.out.print("PERRO: ");
                    perro.comer();
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("PERRO: ");
                    perro.dormir();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("PERRO: ");
                    perro.baño();
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("NO EXISTE ESA OPCION");
                    System.out.println("");
                    break;
            }
        }while(opcionAccion != 0);
    }
    
    public static void seleccionAccionLobo(){
        do{
            menuAcciones();
            switch(opcionAccion){
                case 1:
                    System.out.print("LOBO: ");
                    lobo.comer();
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("LOBO: ");
                    lobo.dormir();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("LOBO: ");
                    lobo.baño();
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("NO EXISTE ESA OPCION");
                    System.out.println("");
                    break;
            }
        }while(opcionAccion != 0);
    }
    
    public static void seleccionAccionGato(){
        do{
            menuAcciones();
            switch(opcionAccion){
                case 1:
                    System.out.print("GATO: ");
                    gato.comer();
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("GATO: ");
                    gato.dormir();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("GATO: ");
                    gato.baño();
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("NO EXISTE ESA OPCION");
                    System.out.println("");
                    break;
            }
        }while(opcionAccion != 0);
    }
    
    public static void seleccionAccionTigre(){
        do{
            menuAcciones();
            switch(opcionAccion){
                case 1:
                    System.out.print("TIGRE: ");
                    tigre.comer();
                    break;
                case 2:
                    System.out.print("TIGRE: ");
                    tigre.dormir();
                    break;
                case 3:
                    System.out.print("TIGRE: ");
                    tigre.baño();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("NO EXISTE ESA OPCION");
                    System.out.println("");
                    break;
            }
        }while(opcionAccion != 0);
    }
    
    public static void seleccionAccionAguila(){
        do{
            menuAcciones();
            switch(opcionAccion){
                case 1:
                    System.out.print("AGUILA: ");
                    aguila.comer();
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("AGUILA: ");
                    aguila.dormir();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("AGUILA: ");
                    aguila.baño();
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("NO EXISTE ESA OPCION");
                    System.out.println("");
                    break;
            }
        }while(opcionAccion != 0);
    }
    
    public static void seleccionAccionPaloma(){
        do{
            menuAcciones();
            switch(opcionAccion){
                case 1:
                    System.out.print("PALOMA: ");
                    paloma.comer();
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("PALOMA: ");
                    paloma.dormir();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("PALOMA: ");
                    paloma.baño();
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("NO EXISTE ESA OPCION");
                    System.out.println("");
                    break;
            }
        }while(opcionAccion != 0);
    }
    
    public static void seleccionAccionTrucha(){
        do{
            menuAcciones();
            switch(opcionAccion){
                case 1:
                    System.out.print("TRUCHA: ");
                    trucha.comer();
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("TRUCHA: ");
                    trucha.dormir();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("TRUCHA: ");
                    trucha.baño();
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("NO EXISTE ESA OPCION");
                    System.out.println("");
                    break;
            }
        }while(opcionAccion != 0);
    }
    
    public static void seleccionAccionSalmon(){
        do{
            menuAcciones();
            switch(opcionAccion){
                case 1:
                    System.out.print("SALMON: ");
                    salmon.comer();
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("SALMON: ");
                    salmon.dormir();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("SALMON: ");
                    salmon.baño();
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("NO EXISTE ESA OPCION");
                    System.out.println("");
                    break;
            }
        }while(opcionAccion != 0);
    }
    
    public static void seleccion(){
        do{
            menuPrincipal();
            switch(opcionPrincipal){
                case 1:
                    seleccionAlta();
                    break;
                case 2:
                    seleccionAccionesAnimal();
                    break;
                case 0:
                    System.out.println("¡HASTA LA PROXIMA!");
                    break;
            }
                    
        }while(opcionPrincipal != 0);
    }
    
    //METODO PARA EL DESPLIEGUE DEL MENU DE ANIMALES
    public static void menu(){
        do{
            try{
                System.out.println("MENU ANIMALES");
                System.out.println("INGRESA LA OPCION QUE DESEA DAR DE ALTA: ");
                System.out.println("1.- PERRO.");
                System.out.println("2.- LOBO.");
                System.out.println("3.- GATO.");
                System.out.println("4.- TIGRE.");
                System.out.println("5.- AGUILA.");
                System.out.println("6.- PALOMA.");
                System.out.println("7.- TRUCHA.");
                System.out.println("8.- SALMON.");
                System.out.println("0.- SALIR");
                System.out.print("INGRESA LA OPCION: ");
                opcion = Integer.parseInt(leer.nextLine());
                valor = true;
                System.out.println("");
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRRESAR OTRO TIPO DE DATO!");
                valor = false;
            }
        }while(valor == false);
    }
    
    //METODO PARA EL MENU DE ADMINISTRACION DE ANIMALES
    public static void seleccionAlta(){
        do{
            menu();
            switch(opcion){
                case 1:
                    altaPerro();
                    break;
                case 2:
                    altaLobo();
                    break;
                case 3: 
                    altaGato();
                    break;
                case 4:
                    altaTigre();
                    break;
                case 5:
                    altaAguila();
                    break;
                case 6:
                    altaPaloma();
                    break;
                case 7:
                    altaTrucha();
                    break;
                case 8:
                    altaSalmon();
                    break;
                case 0:
                    System.out.println("¡HASTA LA PROXIMA!");
                    break;
            }
        }while(opcion != 0);
    }
    
    //METODO PARA DAR DE ALTA UN PERRO
    public static void altaPerro(){
        do{
            try{
                //INGRESANDO LOS DATOS
                System.out.print("INGRESA EL TIPO DE MAMIFERO QUE ES: ");
                perro.setTipo(leer.nextLine());
                System.out.print("INGRESA SU EDAD: ");
                perro.setEdad(Integer.parseInt(leer.nextLine()));
                System.out.print("INGRESA EL GENERO: ");
                perro.setGenero(leer.nextLine());
                System.out.print("INGRESA EL HABITAT: ");
                perro.setHabitat(leer.nextLine());
                System.out.print("INGRESA LA RAZA: ");
                perro.setRaza(leer.nextLine());
                System.out.print("INGRESA EL NOMBRE DEL DUENO: ");
                perro.setDueno(leer.nextLine());
                System.out.println("");
                
                //MENSAJE DE EXITO
                System.out.println("¡PERRO DADO DE ALTA CON EXITO!");
                System.out.println("");
                System.out.println("MAMFIERO: "+perro.getTipo());
                System.out.println("EDAD: "+perro.getEdad());
                System.out.println("GENERO: "+perro.getGenero());
                System.out.println("HABITAT: "+perro.getHabitat());
                System.out.println("RAZA: "+perro.getRaza());
                System.out.println("DUENO: "+perro.getDueno());
                System.out.println("");
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    //METODO PARA DAR DE ALTA UN LOBO
    public static void altaLobo(){
        do{
            try{
                System.out.print("INGRESA EL TIPO DE MAMIFERO QUE ES: ");
                lobo.setTipo(leer.nextLine());
                System.out.print("INGRESA SU EDAD: ");
                lobo.setEdad(Integer.parseInt(leer.nextLine()));
                System.out.print("INGRESA EL GENERO: ");
                lobo.setGenero(leer.nextLine());
                System.out.print("INGRESA EL HABITAT: ");
                lobo.setHabitat(leer.nextLine());
                System.out.print("INGRESA LA RAZA: ");
                lobo.setRaza(leer.nextLine());
                System.out.print("INGRESA EL COLOR: ");
                lobo.setColor(leer.nextLine());
                System.out.println("");
                System.out.println("¡LOBO DADO DE ALTA CON ÉXITO!");
                System.out.println("");
                
                //MENSAJE DE EXITO
                System.out.println("MAMIFERO: "+lobo.getTipo());
                System.out.println("EDAD: "+lobo.getEdad());
                System.out.println("GENERO: "+lobo.getGenero());
                System.out.println("HABITAT: "+lobo.getHabitat());
                System.out.println("RAZA: "+lobo.getRaza());
                System.out.println("COLOR: "+lobo.getColor());
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    //METODO PARA DAR DE ALTA UN GATO
    public static void altaGato(){
        do{
            try{
                System.out.print("INGRESA EL TIPO DE MAMIFERO QUE ES: ");
                gato.setTipo(leer.nextLine());
                System.out.print("INGRESA SU EDAD: ");
                gato.setEdad(Integer.parseInt(leer.nextLine()));
                System.out.print("INGRESA EL GENERO: ");
                gato.setGenero(leer.nextLine());
                System.out.print("INGRESA EL HABITAT: ");
                gato.setHabitat(leer.nextLine());
                System.out.print("INGRESA EL TAMANO DEL FELINO: ");
                gato.setTamanoFelino(leer.nextLine());
                System.out.print("INGRESA LA RAZA: ");
                gato.setRaza(leer.nextLine());
                System.out.println("");
                System.out.println("¡GATO DADO DE ALTA CON ÉXITO!");
                System.out.println("");
                
                //MENSAJE DE EXITO
                System.out.println("MAMIFERO: "+gato.getTipo());
                System.out.println("EDAD: "+gato.getEdad());
                System.out.println("GENERO: "+gato.getGenero());
                System.out.println("HABITAT: "+gato.getHabitat());
                System.out.println("TAMANO DEL FELINO: "+gato.getTamanoFelino());
                System.out.println("RAZA: "+gato.getRaza());
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    //METODO PARA DAR DE ALTA UN TIGRE
    public static void altaTigre(){
        do{
            try{
                System.out.print("INGRESA EL TIPO DE MAMIFERO QUE ES: ");
                tigre.setTipo(leer.nextLine());
                System.out.print("INGRESA SU EDAD: ");
                tigre.setEdad(Integer.parseInt(leer.nextLine()));
                System.out.print("INGRESA EL GENERO: ");
                tigre.setGenero(leer.nextLine());
                System.out.print("INGRESA EL HABITAT: ");
                tigre.setHabitat(leer.nextLine());
                System.out.print("INGRESA EL TAMANO DEL FELINO: ");
                tigre.setTamanoFelino(leer.nextLine());
                System.out.print("INGRESA LA RAZA: ");
                tigre.setColor(leer.nextLine());
                System.out.println("");
                System.out.println("¡GATO DADO DE ALTA CON ÉXITO!");
                System.out.println("");
                
                //MENSAJE DE EXITO
                System.out.println("MAMIFERO: "+gato.getTipo());
                System.out.println("EDAD: "+gato.getEdad());
                System.out.println("GENERO: "+gato.getGenero());
                System.out.println("HABITAT: "+gato.getHabitat());
                System.out.println("TAMANO DEL FELINO: "+gato.getTamanoFelino());
                System.out.println("RAZA: "+gato.getRaza());
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    //METODO PARA DAR DE ALTA UN AGUILA
    public static void altaAguila(){
        do{
            try{
                aguila.setAcuatico(false);
                System.out.print("INGRESA EL GENERO: ");
                aguila.setGenero(leer.nextLine());
                System.out.print("INGRESA LA EDAD: ");
                aguila.setEdad(Integer.parseInt(leer.nextLine()));
                System.out.print("INGRESA EL HABITAT: ");
                aguila.setHabitat(leer.nextLine());
                System.out.print("INGRESA SU TIPO DE ALIMENTACION: ");
                aguila.setDietaAlimenticia(leer.nextLine());
                System.out.print("INGRESA EL ESPECIE DE AGUILA: ");
                aguila.setEspecie(leer.nextLine());
                System.out.println("");
                //MENSAJE EXITO
                System.out.println("¡AGUILA DADA DE ALTA CON EXITO!");
                System.out.println("");
                System.out.println("GENERO: "+aguila.getGenero());
                System.out.println("EDAD: "+aguila.getEdad());
                System.out.println("HABITAT: "+aguila.getHabitat());
                System.out.println("ALIMENTACION: "+aguila.getDietaAlimenticia());
                System.out.println("ESPECIE DE AGUILA: "+aguila.getEspecie());
                System.out.println("");
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    //METODO PARA DAR DE ALTA UNA PALOMA
    public static void altaPaloma(){
        do{
            try{
                paloma.setAcuatico(false);
                System.out.print("INGRESA EL GENERO: ");
                paloma.setGenero(leer.nextLine());
                System.out.print("INGRESA LA EDAD: ");
                paloma.setEdad(Integer.parseInt(leer.nextLine()));
                System.out.print("INGRESA EL HABITAT: ");
                paloma.setHabitat(leer.nextLine());
                System.out.print("INGRESA SU TIPO DE ALIMENTACION: ");
                paloma.setDietaAlimenticia(leer.nextLine());
                System.out.print("INGRESA EL ESPECIE DE PALOMA: ");
                paloma.setTipoPaloma(leer.nextLine());
                System.out.println("");
                //MENSAJE EXITO
                System.out.println("¡PALOMA DADA DE ALTA CON EXITO!");
                System.out.println("");
                System.out.println("GENERO: "+paloma.getGenero());
                System.out.println("EDAD: "+paloma.getEdad());
                System.out.println("HABITAT: "+paloma.getHabitat());
                System.out.println("ALIMENTACION: "+paloma.getDietaAlimenticia());
                System.out.println("ESPECIE DE PALOMA: "+paloma.getTipoPaloma());
                System.out.println("");
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    //METODO PARA DAR DE ALTA UNA TRUCHA
    public static void altaTrucha(){
        do{
            try{
                trucha.setAcuatico(true);
                System.out.print("INGRESA EL GENERO: ");
                trucha.setGenero(leer.nextLine());
                System.out.print("INGRESA LA EDAD: ");
                trucha.setEdad(Integer.parseInt(leer.nextLine()));
                System.out.print("INGRESA EL HABITAT: ");
                trucha.setHabitat(leer.nextLine());
                System.out.print("INGRESA SU TIPO DE AGUA: ");
                trucha.setTipoAgua(leer.nextLine());
                System.out.print("INGRESA DE DONDE QUE REGION PROVIENE: ");
                trucha.setRegion(leer.nextLine());
                System.out.println("");
                //MENSAJE EXITO
                System.out.println("¡TRUCHA DADA DE ALTA CON EXITO!");
                System.out.println("");
                System.out.println("GENERO: "+trucha.getGenero());
                System.out.println("EDAD: "+trucha.getEdad());
                System.out.println("HABITAT: "+trucha.getHabitat());
                System.out.println("TIPO DE AGUA: "+trucha.getTipoAgua());
                System.out.println("PROVIENE DE: "+trucha.getRegion());
                System.out.println("");
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    //METODO PARA DAR DE ALTA UN SALMON
    public static void altaSalmon(){
        do{
            try{
                salmon.setAcuatico(true);
                System.out.print("INGRESA EL GENERO: ");
                salmon.setGenero(leer.nextLine());
                System.out.print("INGRESA LA EDAD: ");
                salmon.setEdad(Integer.parseInt(leer.nextLine()));
                System.out.print("INGRESA EL HABITAT: ");
                salmon.setHabitat(leer.nextLine());
                System.out.print("INGRESA EL TIPO DE AGUA: ");
                salmon.setTipoAgua(leer.nextLine());
                System.out.print("INGRESA EL PESO: ");
                salmon.setPeso(leer.nextLine());
                
                //MENSAJE EXITO
                System.out.println("GENERO: "+salmon.getGenero());
                System.out.println("EDAD: "+salmon.getEdad());
                System.out.println("HABITAT: "+salmon.getHabitat());
                System.out.println("TIPO DE AGUA: "+salmon.getTipoAgua());
                System.out.println("PESO: "+salmon.getPeso());
                
                valor = true;
            }catch(Exception e){
                System.out.println("¡NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    public static void main(String[] args) {
        seleccion();
    }
    
    
}
