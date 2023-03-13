import java.util.Scanner;

public class Ejercicio8 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

         System.out.println("Ingrese el tamaño del arreglo");
         int num =entrada.nextInt();


            
           
            String arreglo1 [] =new String [num];
            String valor="";
            int eliminar=0;

            for(int i=0;i<arreglo1.length;i++){
                
                
               System.out.print("Ingrese el primer valor");
                valor = entrada.nextLine();

                arreglo1[i]=valor;


               

            }
            System.out.println("escriba la posicion que desea eliminar");
            eliminar= entrada.nextInt();

            for(int j=0;j<arreglo1.length;j++){
             

                if(eliminar==j){
                    arreglo1[j]=arreglo1[j+1];
                    arreglo1[j+1]="";

                }
            


               

            }

            for(int u=0;u<arreglo1.length;u++){
             

               System.out.print(arreglo1[u]+", ");


               

            }

        }

}