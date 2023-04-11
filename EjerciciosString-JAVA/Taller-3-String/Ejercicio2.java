import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        
        int longitud = frase.length();
        String resultado = "";
        
        for (int i = 0; i < longitud; i++) {
            int indice = (i + numero) % longitud;
            resultado += frase.charAt(indice);
        }
        
        System.out.println("Resultado: " + resultado);
    }
}
