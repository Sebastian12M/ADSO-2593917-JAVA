import java.util.Scanner;

public class Ejercicio12 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

            System.out.println("Ingrese el tamaño del arreglo 1: ");
            int num1 = entrada .nextInt();

            System.out.println("Ingrese el tamaño del arreglo 1: ");
            int num2 = entrada .nextInt();   

           
                int arreglo1 []=new int [num1];
                int arreglo2 []=new int [num2];
                int arreglo3 []=new int [num1+num2];
                int valor1=0;
                int valor2=0;
                for(int i=0;i<arreglo1.length;i++){

                    System.out.println("Ingrese un numero para el arreglo 1: ");
                    valor1=entrada.nextInt();
                    System.out.println("Ingrese un numero para el arreglo 2: ");
                    valor2=entrada.nextInt();

                    arreglo1[i]=valor1;
                    arreglo2[i]=valor2;

                }

                int i=0;
                int k=0;
                int j=0;
                while (k < valor1 ){
                    arreglo3[k++] = arreglo1[i++];
                    arreglo3[k++] = arreglo2[j++];
                }

                for(int x=0;x<arreglo3.length;x++){
                     
                    System.out.print(arreglo3[x]+",");
                    
                }
                
            
             
            
               
                
        }

}

