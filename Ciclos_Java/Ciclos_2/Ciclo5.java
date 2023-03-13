import java.util.Scanner;

public class Ciclo5 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println ("porfavor ingrese un N");
        int numero=entrada.nextInt();
        
        int resultado=1;
       
        for (int i = 1;i <=numero;i++){
          for(int j =2;i <=numero;i++){

               resultado=resultado*i;
               
               System.out.print(+i+"x");
          }
          
          
          
        }
       
          System.out.print("El resultado es: "+resultado); 
       
      }
      
}