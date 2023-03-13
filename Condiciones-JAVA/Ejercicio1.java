Import java.util.Scanner;

public class Ejercio1 {

      public static void main(String [] args){

            System.out.println("Bienvenido")

            Scanner entrada = new Scanner (System.int);

            System.out.print("Ingrese su edad ");
            int edad = entrada.nextInt()

            if ( edad<18){

                  System.out.println("Por se menor de edad recibe un auxilio de 800000:");
            }

            else 
               if (edad>18){

                  System.out.println("Por ser mayor de edad recibe un auxilio de 200000:");
               }