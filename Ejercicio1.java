import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] nombres = new String[5];


        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingresa el nombre #" + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }
        
        System.out.println("Nombres con mas de 3 letras" ) ;
        for ( String nombre : nombres){
            if ( nombre.length() >=3){
                System.out.println(nombre);
                
            }
            
            
        }
    }
}