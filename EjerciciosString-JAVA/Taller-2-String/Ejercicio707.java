import java.util.Scanner;

public class Ejercicio707 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número para la posición " + i + ": ");
            arreglo[i] = scanner.nextInt();
        }

        System.out.print("Ingrese una posición del arreglo: ");
        int posicion = scanner.nextInt();

        System.out.println("Arreglo original:");
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }

        System.out.println("Arreglo en sentido anti horario  " + posicion + ":");
        for (int i = posicion; i >= 0; i--) {
            System.out.print(arreglo[i] + ", ");
        }
        for (int i = n - 1; i > posicion; i--) {
            System.out.print(arreglo[i] + ", ");
        }

        
    }
}