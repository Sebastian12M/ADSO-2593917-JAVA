import java.util.Scanner;

public class Ciclo7 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("digite un numero");
        int numero1 = entrada.nextInt();

        System.out.println("digite un numero");
        int numero2 = entrada.nextInt();

        System.out.println("digite un numero");
        int numero3 = entrada.nextInt();

        int max=numero1;
        int i;
        if(numero2>max){
            max=numero2;
        }

        if(numero3>max){
            max=numero3;
        }
        
        i=max;

        while((i%numero1!=0)|| (i%numero2!=0)||(i%numero3!=0)){
            i++;
        }
        
        System.out.print("el minimo con un multiplo es " +i);

      }
      

}