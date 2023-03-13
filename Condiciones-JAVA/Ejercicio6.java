import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

         System.out.print("Ingrese su codigo: ");
         int codigo = entrada.nextInt();
         
          System.out.println("Menu ");

          System.out.println("1. Primer Digito ");
           

          System.out.println("2. Segundo Digito ");
          
          
          System.out.println("2. Trecer Digito ");
          

          System.out.println("4. Cuarto Digito ");
          

          System.out.println("5. Quinto  Digito ");
          

          System.out.println("6. Sexto Digito ");
          
          System.out.println("Digite la opcion ");
          int opcion = entrada.nextInt();
          
         if(opcion == 1){
           int resultado = codigo%10;
          
            
           int resultado_total = resultado;

           System.out.println("El primer digito es" + resultado_total);
         }

         else if (opcion == 2){
            int resultado = codigo/10;

            int resultado_total = resultado%10;
            System.out.println("El segundo digito es" + resultado_total);

         }else  if (opcion == 3){
            int resultado = codigo/10;
            int resultado1= resultado/10;

            int resultado_total = resultado1%10;
            System.out.println("El tercer digito es" + resultado_total);

         }else if (opcion == 4){
            int resultado = codigo/10;
            int resultado1 = resultado/10;
            int resultado2 = resultado1/10;
            int resultado_total = resultado2%10;
            System.out.println("El cuarto digito es" + resultado_total);

         }else if(opcion == 5){
            int resultado = codigo/10;
            int resultado1 = resultado/10;
            int resultado2 = resultado1/10;
            int resultado3 = resultado2/10;

            int resultado_total = resultado3%10;
            System.out.println("El quinto digito es" + resultado_total);

         }else if(opcion==6){
            int resultado = codigo/10;
            int resultado1 = resultado/10;
            int resultado2 = resultado1/10;
            int resultado3 = resultado2/10;
            int resultado4 = resultado3/10;

            int resultado_total = resultado4%10;
            System.out.println("El sexto digito es" + resultado_total);
         }



        
         
        
    }

}