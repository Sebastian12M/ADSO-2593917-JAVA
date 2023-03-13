import java.util.Scanner;

public class Ejercicio3 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

            System.out.println("Ingrese su nombre completo");
            String oracion = entrada .nextLine();  


               
                
              int posicion=0;
              String invertida = "";
              for (int i = oracion.length() -1; i >= 0; i--) {
			
			       
              invertida += oracion.charAt(i);
                    
		        }
                
                 
              System.out.println("Cadena invertida: " + invertida);
                    
                    
        }

}



