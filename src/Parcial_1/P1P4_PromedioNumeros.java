package Parcial_1;
import java.util.Scanner;
public class P1P4_PromedioNumeros {
    private static Scanner leer = new Scanner(System.in);
    private static int n = 0;
    private static double numeros[];
    private static double promedio = 0, suma = 0;
    private static boolean valor = false;
    
    public static void capturar(){
        do{
            try{
                System.out.print("INGRESA LA CANTIDAD DE NUMEROS QUE DESEAS: ");
                n = Integer.parseInt(leer.nextLine());
                numeros = new double[n];
                for(int i = 0; i<n; i++){
                    System.out.print("INGRESA UN NUMMERO: ");
                    numeros[i] = Double.parseDouble(leer.nextLine());
                }
                valor = true;
            }catch(Exception e){
                valor = false;
                System.out.println("NO PUEDES INGRESAR OTRO TIPO DE CARACTER");
            }
        }while(valor == false);
    }
    
    public static void calcular(){
        for(int i = 0; i<n; i++){
            suma = suma + numeros[i];
        }
        promedio = suma/n;
    }
    
    public static void mostrar(){
        System.out.println("EL PROMEDIO ES DE: "+promedio);
    }
    
    public static void main(String[] args) {
        capturar();
        calcular();
        mostrar();
    }
    
    
}
