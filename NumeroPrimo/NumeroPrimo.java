package NumeroPrimo;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        scanner.close();
    }

    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }

        // Puedes recorrer hasta n - 1, pero mejor aún hasta la raíz cuadrada para optimizar
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Si encuentra un divisor, no es primo
            }
        }

        return true; // Si no encontró divisores, es primo
    }
}

