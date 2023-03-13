import java.util.Scanner;

public class Ciclo6 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println ("porfavor ingrese un N");
        int numero=entrada.nextInt();
        System.out.println("Porfavor ingrese el numero M");
        int m = entrada.nextInt();
        
        
        
       
        for (int j = numero;j <=m;j++){
             int cont = 1;
             int resultado=0;
             System.out.println("factorial de"+j+"("+j+"!);");
             System.out.print("                 =");
             for(int i=1 ; i<=j;i++){
                resultado=cont*i;
                cont=resultado;
                if(i==j){
                    System.out.print(i+"="+resultado);
                }else{
                    System.out.print(i+"x");
                }
             }
          
          System.out.println();
          
        }
       
          
       
      }
      
}