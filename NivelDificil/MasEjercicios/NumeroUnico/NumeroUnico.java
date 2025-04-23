package NivelDificil.MasEjercicios.NumeroUnico;

import java.util.Scanner;

public class NumeroUnico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos la cantidad de elementos
        System.out.print("¿Cuántos números vas a introducir? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        // Llenamos el array con los valores introducidos
        System.out.println("Introduce los números uno a uno:");
        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        // Mostramos el resultado
        System.out.println("El número que aparece una sola vez es: " + encontrarUnico(numeros));

        sc.close();
    }

    // Método que encuentra el número único usando XOR
    public static int encontrarUnico(int[] nums) {
        int resultado = 0;

        for (int num : nums) {
            resultado ^= num;
        }

        return resultado;
    }
}
