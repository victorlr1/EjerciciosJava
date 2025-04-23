package NivelDificil.MasEjercicios.ArraysMatrices.RotarMatriz;

import java.util.Scanner;

public class RotarMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño de la matriz NxN: ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        rotar90Grados(matriz);

        System.out.println("Matriz rotada 90 grados:");
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void rotar90Grados(int[][] matriz) {
        int n = matriz.length;

        // Transponer la matriz (intercambiar filas por columnas)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = temp;
            }
        }

        // Invertir cada fila
        for (int i = 0; i < n; i++) {
            int inicio = 0;
            int fin = n - 1;
            while (inicio < fin) {
                int temp = matriz[i][inicio];
                matriz[i][inicio] = matriz[i][fin];
                matriz[i][fin] = temp;
                inicio++;
                fin--;
            }
        }
    }
}
