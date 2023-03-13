import java.util.Scanner;

public class Ciclo4 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        
      
         int j = 20;
        while(j != 3){

         System.out.println("|------------- Bienvenido ------------|");
         System.out.println("| 1. Docente                          |");
         System.out.println("| 2. Estudiante                       |");
         System.out.println("| 3. Salir                            |");
         System.out.println("|-------------------------------------|");
         int opcion = entrada.nextInt();
        
         if(opcion == 1){
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
         }else if (opcion == 2 ){
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
         System.out.println();
         }else{

         }
         






      }

}

}

