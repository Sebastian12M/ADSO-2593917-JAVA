import java.util.Scanner;

public class Arreglo2
{
public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.print("Ingrese el numero de casillas del vector");
        int numero = entrada.nextInt();


        int arreglo1 [] =new int [numero];
        
        for(int i = 0;i< arreglo1.length;i++){
            arreglo1[i]=(i*2)-1;
        }
         
         for(int i = 0;i< arreglo1.length;i++){
            System.out.print("["+arreglo1[i]+"]");
        }
      }
}
    