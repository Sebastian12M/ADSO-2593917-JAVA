import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese el primer numero");
        int numero1 = entrada.nextInt();

        System.out.println("Ingrese el segundo numero");
        int numero2 = entrada.nextInt();

        System.out.println("Ingrese el tercer numero");
        int numero3 = entrada.nextInt();

        if (numero1 < numero2 && numero2 < numero3 ){
            System.out.println("Los numeros se ingresaron en orden ascendente");
        }

        else if (numero1 > numero2 && numero2> numero3){
            System.out.println("Los numero se ingresaron en orden descendente");
        }

      






    }

}      