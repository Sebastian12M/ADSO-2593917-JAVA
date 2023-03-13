import java.util.Scanner;

public class Ciclo2 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

       System.out.println("Ingrese la cantidada de materias");
        int cantidad_materias = entrada.nextInt();
         int creditos = 0;
         float sumatoria = 0;
        for (int i=1;i <= cantidad_materias;i++){
            System.out.println("Ingrese nota"+i+":");
            float nota = entrada.nextFloat();
            System.out.println("Creditos materia"+i+":");
            int creditos_materia = entrada.nextInt();
            sumatoria=sumatoria+nota;
            creditos=creditos+creditos_materia;
        }   
        float promedio = sumatoria / cantidad_materias;
        System.out.print("EL PROMEDIO ES:"+promedio);
        System.out.print("Total creditos"+creditos);
      }
}