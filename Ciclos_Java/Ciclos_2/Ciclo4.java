import java.util.Scanner;

public class Ciclo4 {

       public static void main(String[] args) {
		 System.out.println ("Por favor ingrese:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if (x <= 0) {
			 System.out.println ("No es un palíndromo");
		} 
	    String a=String.valueOf(x);
	    for(int i=0;i<a.length()/2;i++) {
	    	if(a.charAt(i)!=a.charAt(a.length()-i-1)) {
	    		 System.out.println ("No es un palíndromo");
			}else {
			 System.out.println ("el Numero es palindromo");
			}
		}
	}
 
}


      
