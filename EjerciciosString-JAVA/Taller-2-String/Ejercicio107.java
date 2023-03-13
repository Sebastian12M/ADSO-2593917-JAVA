import java.util.Scanner;

public class Ejercicio107 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

         System.out.println("Ingrese el tamaño del arreglo");
         int num =entrada.nextInt();


            
           
            int arreglo1 [] =new int [num];
            

            for(int i=0;i<arreglo1.length;i++){
                
                
               arreglo1[i]=(i+1)*2-1;
            


               

            }

           for(int j=0;j<arreglo1.length;j++){
               System.out.println("Estos son los numeros impares: "+arreglo1[j]);
                
            


               

            }

        }

}