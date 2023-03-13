import java.util.Scanner;

public class Ejercicio507 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

         System.out.println("Ingrese el tamaño del arreglo");
         int num =entrada.nextInt();

            String nombres [] =new String [num];
            String generos [] =new String [num];
            String nombre = entrada.nextLine();
            String genero = entrada.nextLine();
            int aux=0;

            for(int i=0;i<nombres.length;i++){
                System.out.println("Ingrese su Nombre:");
                nombre=entrada.nextLine();
                nombres[i]=nombre;

                System.out.println("Ingrese su Genero:");
                genero=entrada.nextLine();
                generos[i]=genero;
                
            }

            for(int j=0;j<nombres.length;j++){
                 System.out.println("["+nombres[j]+" -> " +generos[j]+"]");
               
            }
    }
}