package NivelDificil.MasEjercicios.ArraysMatrices.MaxSubArraySuma;

import java.util.Scanner;

public class MaxSubArraySuma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a introducir? ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Introduce los números:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sumaMaxima = encontrarSumaMaxima(array);
        System.out.println("La suma máxima de una subarray contigua es: " + sumaMaxima);

        scanner.close();
    }

    public static int encontrarSumaMaxima(int[] nums) {
        int maxActual = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxActual = Math.max(nums[i], maxActual + nums[i]);
            maxGlobal = Math.max(maxGlobal, maxActual);
        }

        return maxGlobal;
    }
}
