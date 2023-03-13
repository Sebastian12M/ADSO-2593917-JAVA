import java.util.Scanner;

public class Ejercicio4 {

      public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

          System.out.println("Ingrese su nombre completo");
           String oracion = entrada .nextLine();  


               
                
                
            String invertida = "";
            for (int i = oracion.length() -1; i >= 0; i--) {
			
			invertida += oracion.charAt(i);
                    
	      }
                
                
            if(oracion.equalsIgnoreCase(invertida)){
            System.out.println("Es palindromo");
            }else{
            System.out.println("No es palindromo");
            }
                    
                
      }
}

