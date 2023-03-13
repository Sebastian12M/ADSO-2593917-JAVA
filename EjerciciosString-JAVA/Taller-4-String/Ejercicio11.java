import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio11 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

         System.out.println("Ingrese un numero");
         int num =entrada.nextInt();


            
           
            int arreglo1 [] =new int [num];
            int arreglo2 [] =new int [num];
            

            for(int i=0;i<arreglo1.length;i++){
                
                System.out.println("Ingrese un dato para el arreglo 1; ");
                arreglo1[i]=entrada.nextInt();

                System.out.println("Ingrese un dato para el arreglo 2; ");
                arreglo2[i]=entrada.nextInt();
                
            }

            
                Arrays.sort(arreglo2);
                boolean comparar= Arrays.equals(arreglo1, arreglo2);
                if(comparar){

                  System.out.print("Es equivalente") ;
                }else{
                    System.out.print("No es equivalente") ;
                }
            

        }

}