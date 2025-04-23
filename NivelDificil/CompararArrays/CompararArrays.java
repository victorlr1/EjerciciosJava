package NivelDificil.CompararArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompararArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos la longitud del primer array
        System.out.print("¿Cuántos elementos tiene el primer array? ");
        int longitud1 = scanner.nextInt();
        int[] array1 = new int[longitud1];

        // Pedimos los valores del primer array
        System.out.println("Introduce los elementos del primer array:");
        for (int i = 0; i < longitud1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Pedimos la longitud del segundo array
        System.out.print("¿Cuántos elementos tiene el segundo array? ");
        int longitud2 = scanner.nextInt();
        int[] array2 = new int[longitud2];

        // Pedimos los valores del segundo array
        System.out.println("Introduce los elementos del segundo array:");
        for (int i = 0; i < longitud2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Comprobamos si son iguales
        boolean iguales = compararArrays(array1, array2);

        // Mostramos el resultado
        if (iguales) {
            System.out.println("Los arrays tienen los mismos elementos.");
        } else {
            System.out.println("Los arrays son diferentes.");
        }

        scanner.close();
    }

    // Método que compara dos arrays ignorando el orden
    public static boolean compararArrays(int[] a, int[] b) {
        Arrays.sort(a); // Ordenamos el primer array
        Arrays.sort(b); // Ordenamos el segundo array

        // Si tienen diferente longitud, no pueden ser iguales
        if (a.length != b.length) {
            return false;
        }

        // Comparamos elemento por elemento
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        // Si pasaron todas las comparaciones, son iguales
        return true;
    }
}

