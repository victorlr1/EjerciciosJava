package Factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        long resultado = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + resultado);

        scanner.close();
    }

    public static long calcularFactorial(int n) {
        if (n < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
            return -1;
        }

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
