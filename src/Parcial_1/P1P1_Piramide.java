package Parcial_1;
import java.util.Scanner;
public class P1P1_Piramide {
    static private int n = 0, x = 0;
    static private Scanner leer = new Scanner(System.in);
    static private boolean valor = false;
    
    public static void capturar(){
        do{
            try{
                System.out.print("INGRESA EL NÚMERO DE FILAS DESEADAS: ");
                n = Integer.parseInt(leer.nextLine());
                valor = true;
            }catch(Exception e){
                System.out.println("NO PUEDES INGRESAR OTRO TIPO DE CARACTERES\n");
                valor = false;
            }
        }while(valor == false);
    }
    
    public static void procesar(){
        x = n-1;
        for(int j = n; j!=0; j--){
            System.out.print("\n");
            for(int i = (n-x); i!=0; i--){
                System.out.print("*");
            }
            x--;
        }
        
            
            
        
    }
    
    public static void main(String[] args){
        capturar();
        procesar();
    }
    
    
}
