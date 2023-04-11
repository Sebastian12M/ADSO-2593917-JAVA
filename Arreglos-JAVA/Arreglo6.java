import java.util.Scanner;

public class Arreglo6 {

    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de números en el arreglo: ");
        int n = scanner.nextInt();

        
        int[] arregloOriginal = new int[n];
        System.out.println("Ingrese " + n + " números para llenar el arreglo:");
        for (int i = 0; i < n; i++) {
            arregloOriginal[i] = scanner.nextInt();
        }

        
        int[] arregloPrimos = new int[n];
        int[] arregloNoPrimos = new int[n];
        int contadorPrimos = 0;
        int contadorNoPrimos = 0;
        for (int i = 0; i < n; i++) {
            if (esPrimo(arregloOriginal[i])) {
                arregloPrimos[contadorPrimos] = arregloOriginal[i];
                contadorPrimos++;
            } else {
                arregloNoPrimos[contadorNoPrimos] = arregloOriginal[i];
                contadorNoPrimos++;
            }
        }

        
        System.out.print("Arreglo Original: { ");
        for (int i = 0; i < n; i++) {
            System.out.print(arregloOriginal[i] + " ");
        }
        System.out.println("}");
        System.out.print("Arreglo Primos: { ");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.print(arregloPrimos[i] + " ");
        }
        System.out.println("} (Longitud: " + contadorPrimos + ")");
        System.out.print("Arreglo No Primos: { ");
        for (int i = 0; i < contadorNoPrimos; i++) {
            System.out.print(arregloNoPrimos[i] + " ");
        }
        System.out.println("} (Longitud: " + contadorNoPrimos + ")");
    }
}