import java.util.Scanner;

public class Ejercicio1 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

            System.out.println("Ingrese el tamaño del arreglo");
            int num = entrada .nextInt();  

           
            int numeros=0;
            int contpar=0;
            int impar=0;
            int original [] =new int[num];
            int pares [] =new int[num];
            int impares [] =new int[num];  

            for(int i=0;i<original.length;i++){
                System.out.print("Ingrese un numero");
                numeros = entrada.nextInt();
                original[i]=numeros;

            }
              
            for(int j=0;j<original.length;j++){
                
                if(original[j]%2==0){
                    
                    pares[j]=original[j];
                    contpar=contpar+1;
                }else if(original[j]%2!=0){
                    impares[j]=original[j];
                    impar=impar+1;
                }
                
            }   

            System.out.print("Arreglo original: ");
            for(int o=0;o<original.length;o++){
                
                System.out.print(original[o]+",");
                
            }
            System.out.println(" ");

            System.out.print("Arreglo Pares: ");
            for(int x=0;x<original.length;x++){
                
                System.out.print(pares[x]+",");
                
            }
            System.out.println(" ");

            System.out.print("Arreglo Impares: ");
            for(int u=0;u<original.length;u++){
                
                System.out.print(impares[u]+",");
                
            }
            System.out.println(" ");
            
             
           
             
            
               
                
        }

}

