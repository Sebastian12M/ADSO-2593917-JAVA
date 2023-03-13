import java.util.Scanner;

public class Ciclo3 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

      System.out.println("Cuantas filas desea imprimir");
        int filas = entrada.nextInt();
       


      
       

        for(int i=0;i <=filas;i++){
          
           int repeticion = (i*2)-1;
           int espacio = filas - i;
         for(int j =0;j < repeticion;j++){

         System.out.print ("x");

         }

         System.out.println();

         for(int e =0;e < espacio;e++){
           System.out.print(" ");
         }

        }
        
         
      }

}