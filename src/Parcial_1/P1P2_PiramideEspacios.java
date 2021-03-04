package Parcial_1;
import java.util.Scanner;
public class P1P2_PiramideEspacios {
    static private Scanner leer = new Scanner(System.in);
    static private int n = 0, x = 0, z=0;
    static private boolean valor = false;
    
    public static void capturar(){
        do{
            try{
                System.out.print("INGRESA EL NUMERO DESEADO: ");
                n = Integer.parseInt(leer.nextLine());
                valor = true;
            }catch(Exception e){
                System.out.println("NO PUEDES INGRESAR OTRO TIPO DE CARACTER");
                valor = false;
            }
        }while(valor == false);
    }
    
    public static void procesar(){
        x = n-1;
        z = n-1;
        for(int j = n; j!=0; j--){
            for(int y = (z); y!= 0; y--){
                    System.out.print(" ");
                }
            
            for(int i = (n-x); i!=0; i--){
                System.out.print("*");
            }
            
            for(int f = (z+1); f<n; f++){
                System.out.print("*");
            }
            
            System.out.print("\n");
            
            x--;
            z--;
        }
    }
    
    public static void main(String[] args){
        capturar();
        procesar();
    }
    
}
