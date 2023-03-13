import java.util.Scanner;

public class Ciclo6 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Escriba un numero");
        int numero = entrada.nextInt();
        int num1 = 0;
        int num2=1 ;
        int suma = 0;

        for(int i = 3; i <= numero;i++){
           
            
            
           suma = num1+num2;
           num1 = num2;
           num2 = suma;
           
          
           
           
           
           
        }
       System.out.println("El n-esimo numero Fibonacci es: "+suma);
      }      
      
}    