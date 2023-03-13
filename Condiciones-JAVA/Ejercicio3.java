import java.util.Scanner;

public class Ejercicio3 {

      public static void main(String [] args){

        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese el valor de x");
        int x = entrada.nextInt();
         

        System.out.println("Ingrese el valor de y");
        int y = entrada.nextInt ();
        


        if( x < 0 && y > 0 ){
          System.out.println("ESTA EN EL CUADRANTE 2");

        }
        else if(x > 0 && y < 0){
          System.out.println("ESTA EN EL CUADRANTE 4");
        }

          else if( x > 0 && y > 0 ){
            System.out.println("ESTA EN EL CUADRANTE 1");
          }

          else if(x < 0 && y < 0 ){
            System.out.println("ESTA EN EL CUADRANTE 3");
          }
      }
      
}