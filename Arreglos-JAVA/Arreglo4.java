import java.util.Scanner;
import java.util.Arrays;

public class Arreglo4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de números en el arreglo: ");
        int n = scanner.nextInt();

        
        int[] arreglo = new int[n];
        System.out.println("Ingrese " + n + " números para llenar el arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));

        
        Arrays.sort(arreglo);
        int[] arregloOrdenado = new int[n];
        for (int i = 0; i < n; i++) {
            arregloOrdenado[i] = arreglo[n - i - 1];
        }

       
        System.out.println("Arreglo ordenado en orden descendente: " + Arrays.toString(arregloOrdenado));
    }
}
