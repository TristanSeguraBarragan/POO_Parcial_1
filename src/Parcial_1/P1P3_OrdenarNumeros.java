package Parcial_1;
import java.util.Scanner;
public class P1P3_OrdenarNumeros {
    private static Scanner leer = new Scanner(System.in);
    private static int n = 0, aux = 0;
    private static boolean valor = false;
    private static int numeros[], numeros2[];
    
    public static void capturar(){
        do{
            try{
                System.out.print("INGRESA LA CANTIDAD DE NUMEROS: ");
                n = Integer.parseInt(leer.nextLine());
                valor = true;
            }catch(Exception e){
                System.out.println("NO PUEDES INGRESAR OTRO TIPO DE CARACTER");
                valor = false;
            }
        }while(valor == false);
        
        capturar2();
    }
    
    public static void capturar2(){
        numeros = new int[n];
        numeros2 = new int[n];
        do{
            
            try{
                for(int i = 0; i<n; i++){
                    System.out.print("INGRESA UN NUMERO: ");
                    numeros[i] = Integer.parseInt(leer.nextLine());
                    valor = true;
                }
            }catch(Exception e){
                System.out.println("NO PUEDES INGRESAR OTRO TIPO DE CARACTER");
                valor = false;
            }
            
        }while(valor = false);
        }
    
    public static void procesar(){
        for (int i = 0; i < (n-1); i++) {
        for (int x = (i + 1); x < n; x++) {
            if (numeros[x] < numeros[i]) {
                aux = numeros[i];
                numeros[i] = numeros[x];
                numeros[x] = aux;
            }
        }
    }
    }
    
    
    
    public static void imprimir(){
        for(int i = 0; i<n; i++){
            System.out.println(numeros[i]);
        }
    }
    
    
    public static void main(String[] args){
        capturar();
        procesar();
        imprimir();
    }
    
}
