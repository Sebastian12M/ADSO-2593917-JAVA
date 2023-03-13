import java.util.Scanner;

public class Ciclo2 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);


        System.out.println("Cantidad total financiada");
        int prestamo=entrada.nextInt();

         
          System.out.println("Cantidad de cuotas pagadas");
          int can_pagadas=entrada.nextInt();

          System.out.println("A cauntos años son el prestamo");
          int años=entrada.nextInt();
 
          System.out.println("Valor de cada cuota");
          int valor_cuota=entrada.nextInt();

          
          
          double interes= (prestamo*0.02)*años;
          
          int total_interes=interes*años;
          int pago_mientras = valor_cuota*años;
          int total_pagar=pago_mientras+total_interes;
          int pagado=  pago_mientras/total_pagar;

          
           

           System.out.println("Este es el total en interes que debe pagar"+interes_total);
          System.out.println("Señor usuario usted a pagado el: "+pagado+"%");
      }
}