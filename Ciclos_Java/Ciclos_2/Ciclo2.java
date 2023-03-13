import java.util.Scanner;

public class Ciclo2 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

         int dias_a=0;
         int mes_a=0;
         boolean buscando = true;
         int dias = 0;
         int mes =0;
         int ano_a=0;
         int contador=1;

         dias_a=(int)(Math.random()*31);
         if(dias_a <=31 && dias_a > 0){

         }
        boolean search = true;
        while (search==true){
          mes_a=(int)(Math.random()*12);
          if(mes_a<=12 &&  mes_a >0){
            if(dias_a == 31 && (mes_a == 1 || mes_a == 3 || mes_a == 5 || mes_a == 7 || mes_a==8 || mes_a == 10)){
              search=false;
            }else if(dias_a == 30 && (mes_a == 4 || mes_a==6 || mes_a==9|| mes_a==11)){
              search=false;
            }else if (dias_a == 28 &&(mes_a==2)){
              search=false;
            }
            search=false;
          }
        }
        boolean buscar = true;
      while (buscar == true){
        ano_a=(int)(Math.random()*9999);
        if(ano_a>=1000 && ano_a <=9999){
          buscar=false;
        }
       }
        if(dias_a > 0 && dias_a <10 && mes_a > 0 && mes_a <10){
        System.out.println("0"+dias_a+"/0"+mes_a+"/"+ano_a);
       }else if(dias_a > 0 && dias_a < 10){
        System.out.println("0"+dias_a+"/"+mes_a+"/"+ano_a);
       }else if(mes_a > 0 && mes_a < 10){
        System.out.println(dias_a+"/0"+mes_a+"/"+ano_a);
       }else{
        System.out.println(dias_a+"/"+mes_a+"/"+ano_a);
       } 
    }

      
}
