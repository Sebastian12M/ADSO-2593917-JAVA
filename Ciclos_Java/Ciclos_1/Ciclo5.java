import java.util.Scanner;

public class Ciclo5 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Escriba un numero");
        int numero = entrada.nextInt();
        int num1 = 0;
        int num2=1 ;
        int suma = 0;

        for(int i = 2; i <= numero;i++){
           
            if (i == 4 ){
            System.out.print("1,");
            
           }
            
            System.out.print( +suma+",");
           suma = num1+num2;
           num1 = num2;
           num2 = suma;
           
          
           
           
           
           
        }

      }      

}    

