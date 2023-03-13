import java.util.Scanner;

public class Ciclo5 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println ("porfavor ingrese un N");
        int numero=entrada.nextInt();

        int altura=(numero+1)/2;

        for(int i=0; i<= altura; i++){
            int multiplicacion=(i*2)-1;
            int mult = altura -i;

            for(int a=1;a<=multiplicacion;a++){
                System.out.print("x");
            }
            System.out.println();
            for(int m=1)
        }
      }
}