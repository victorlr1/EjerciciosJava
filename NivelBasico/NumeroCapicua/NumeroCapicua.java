package NumeroCapicua;

import java.util.Scanner;

public class NumeroCapicua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        if (esCapicua(numero)) {
            System.out.println(numero + " es un número capicúa.");
        } else {
            System.out.println(numero + " no es un número capicúa.");
        }

        scanner.close();
    }

    public static boolean esCapicua(int numero) {
        // Convertimos el número a String
        String original = String.valueOf(numero);

        // Invertimos el string usando StringBuilder
        String invertido = new StringBuilder(original).reverse().toString();

        // Comparamos ambos strings
        return original.equals(invertido);
    }
}

