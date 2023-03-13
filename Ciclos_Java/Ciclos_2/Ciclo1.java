import java.util.Scanner;

public class Ciclo1 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
         
        System.out.print("Escriba un numero de 1 a 6:");
        int numero = entrada.nextInt();
        
        int aux = 0;
        
        
        int resultado=0;
         int  producto = 0 ; 
         for(int i = 0; i < numero;i++){
            int aleatorio = (int)(Math.random()*10);
         
           
            
            aux = aux * 10 + aleatorio;
            resultado = aux*2;
           
        }
        
       System.out.println("este es el resultado " +aux);
       System.out.println("este es el resultado " +resultado);
    }
 }
