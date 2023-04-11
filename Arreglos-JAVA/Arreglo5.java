import java.util.Scanner;

public class Arreglo5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de números en el arreglo: ");
        int n = scanner.nextInt();

        
        int[] arreglo = new int[n];
        System.out.println("Ingrese " + n + " números para llenar el arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        
        System.out.print("Ingrese el número de movimientos: ");
        int numMovimientos = scanner.nextInt();
        for (int i = 0; i < numMovimientos; i++) {
            int temp = arreglo[0];
            for (int j = 1; j < n; j++) {
                arreglo[j - 1] = arreglo[j];
            }
            arreglo[n - 1] = temp;
            System.out.print("Movimiento " + (i + 1) + ": { ");
            for (int j = 0; j < n; j++) {
                System.out.print(arreglo[j] + " ");
            }
            System.out.println("}");
        }
    }
}
