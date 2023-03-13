import java.util.Scanner;

public class Ejercicio14 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

         System.out.println("Ingrese el tamaño del arreglo");
            int num =entrada.nextInt();

            String nombre = entrada.nextLine();

            
           
            String arreglo1 [] =new String [num];
            String buscar="";

            for(int i=0;i<arreglo1.length;i++){
                
                System.out.print("Ingrese el nombre:");
                nombre= entrada.nextLine();
                arreglo1[i]=nombre;
            


               

            }
            
            System.out.print("ingrese la frase que desea buscar: ");
            buscar=entrada.nextLine();
           for(int j=0;j<arreglo1.length;j++){
                
                if(buscar.equals(arreglo1[j])){
                    System.out.println("Posicion: "+j+": "+arreglo1[j]);
                }


            }
      }
 
 }