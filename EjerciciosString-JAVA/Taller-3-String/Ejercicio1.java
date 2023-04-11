import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String contrasena = scanner.nextLine();
        if (validarContrasena(contrasena)) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña NO es válida.");
        }
    }

    public static boolean validarContrasena(String contrasena) {
        
        if (contrasena.length() < 8) {
            return false;
        }

        
        if (!contrasena.matches(".*[A-Z].*")) {
            return false;
        }

        if (!contrasena.matches(".*[a-z].*")) {
            return false;
        }

        
        if (!contrasena.matches(".*\\d.*")) {
            return false;
        }

        
        if (!contrasena.matches(".*[.\\-\\*{}\\[\\]#$%&/?!¡!].*")) {
            return false;
        }

        
        if (contrasena.contains(" ")) {
            return false;
        }

        
        return true;
    }
}
