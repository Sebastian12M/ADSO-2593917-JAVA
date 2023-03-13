Import java.util.Scanner;

public class Prueba {

      public static void main(String [] args){


        Scanner entrada = new Scanner (System.int);

        System.out.println("Digite un numero");
        int numero = entrada.nextInt();

        if (numero % 2 == 0  ){
            System.out.println("su numer es par");
        }

        else
        {
            System.out.println("su numero es impar");
        }
         
