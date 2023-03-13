import java.util.Scanner;

public class Ejercicio407 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

         System.out.println("Ingrese el tamaño del arreglo");
            int num =entrada.nextInt();

            String nombre = entrada.nextLine();

            
           
            String arreglo1 [] =new String [num];
            int ascci=0;

            for(int i=0;i<arreglo1.length;i++){
                
                System.out.print("Ingrese el nombre:");
                nombre= entrada.nextLine();
                ascci=(int)arreglo1[i].charAt(1);
                System.out.println(ascci);
                arreglo1[i]=nombre;
            


               

            }

           for(int j=0;j<arreglo1.length;j++){
                
                System.out.println(arreglo1[j]);
               


            }


        }

}


 