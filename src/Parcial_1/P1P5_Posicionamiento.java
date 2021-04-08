package Parcial_1;
import java.util.Scanner;
public class P1P5_Posicionamiento {
    private static Scanner leer = new Scanner(System.in);
    private static int n = 0;
    private static double numeros[];
    private static double numeroSelec = 0;
    private static boolean valor = false;
    
    public static void capturar(){
        do{
            try{
                System.out.print("INGRESA LA CANTIDAD DE NUMEROS QUE DESEAS: ");
                n = Integer.parseInt(leer.nextLine());
                numeros = new double[n];
                for(int i = 0; i<n; i++){
                    System.out.print("INGRESA UN NUMERO:");
                    numeros[i] = Double.parseDouble(leer.nextLine());
                }
                valor = true;
            }catch(Exception e){
                System.out.println("NO PUEDES INGRESAR OTRO TIPO DE DATO");
                valor = false;
            }
        }while(valor == false);
    }
    
    public static void Capturarposicion(){
        do{
            try{
                System.out.print("INGRESA EL NUMERO DEL CUAL DESEAS OBTENER EL INDICE: ");
                numeroSelec = Double.parseDouble(leer.nextLine());
                valor = true;
            }catch(Exception e){
                System.out.println("NO PUEDES INGRESAR OTRO TIPO DE CARACTER!");
                valor = false;
            }
        }while(valor == false);
    }
    
    public static void procesar(){
        for(int i = 0; i<n; i++){
            if(numeroSelec == numeros[i]){
                System.out.println("LA POSICIÓN DEL NUMERO "+numeroSelec+" ES: "+i);
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        capturar();
        Capturarposicion();
        procesar();
    }
}
