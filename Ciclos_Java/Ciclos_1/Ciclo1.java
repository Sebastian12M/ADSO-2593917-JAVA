import java.util.Scanner;

public class Ciclo1 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese la cantidada de notas");
        int cantidad_notas = entrada.nextInt();

        float sumatoria = 0;
        for (int i=1 ; i<= cantidad_notas; i++){
            System.out.println("Ingrese nota"+i+":");
            float nota = entrada.nextFloat();
            sumatoria=sumatoria+nota;



        }
        float promedio = sumatoria / cantidad_notas;
        System.out.print("EL PROMEDIO ES:"+promedio);
      }

}       