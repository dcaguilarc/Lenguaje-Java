import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número al usuario
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        // Determinar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo +.");
        } else if (numero < 0) {
            System.out.println("El número es negativo -.");
        } else {
            System.out.println("El número es cero.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
