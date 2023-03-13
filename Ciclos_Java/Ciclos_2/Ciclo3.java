import java.util.Scanner;

public class Ciclo3 {

      public static void main(String [] args){
         Scanner entrada = new Scanner (System.in);
         int i =1;
         System.out.print("Ingrese un numero");
         int numero=entrada.nextInt();
         int  resultado=0;
         int aux =0; 

          while(i <=numero){
          int contador=0;
          int j=1;
          int aleatorio = (int)(Math.random()*99);

          while(j<=  aleatorio){
          if(aleatorio%j==0){
           contador++;
          }
            j++;
          } 
            if (contador==2){
            System.out.println("primo "+j+"generado"+aleatorio);
          }
          
         }
        
      }
}

