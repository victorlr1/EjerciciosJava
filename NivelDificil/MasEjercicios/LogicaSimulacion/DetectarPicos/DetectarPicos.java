package NivelDificil.MasEjercicios.LogicaSimulacion.DetectarPicos;

import java.util.Scanner;

public class DetectarPicos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos elementos tendrá el array?: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Introduce los elementos:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Picos encontrados: ");
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                System.out.print(array[i] + " ");
            }
        }

        scanner.close();
    }
}
