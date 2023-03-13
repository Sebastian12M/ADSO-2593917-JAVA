import java.util.Scanner;

public class Ejercicio {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

            System.out.println("Ingrese una oracion");
            String oracion = entrada .nextLine();  


               
              int cont=0;

              for(int i=0;i<oracion.length();i++){
                    
                    if(oracion.charAt(i)== 'a'|| oracion.charAt(i)=='e' || oracion.charAt(i)=='i' || oracion.charAt(i)=='o' || oracion.charAt(i)=='u'){
                      cont++;
                    }
                   
                }

                System.out.println("Numero de vocales encontradas: " +cont);
        }

}



