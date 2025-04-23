package NivelDificil.MasEjercicios.ArraysMatrices.BusquedaBinaria;

import java.util.Scanner;

public class BusquedaBinaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a introducir (ordenados)? ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Introduce los números ordenados:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("¿Qué número quieres buscar? ");
        int objetivo = scanner.nextInt();

        int resultado = buscarNumero(array, objetivo);

        if (resultado != -1) {
            System.out.println("El número se encuentra en el índice: " + resultado);
        } else {
            System.out.println("El número no está en el array.");
        }

        scanner.close();
    }

    public static int buscarNumero(int[] array, int objetivo) {
        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (array[medio] == objetivo) {
                return medio;
            } else if (array[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1; // No encontrado
    }
}

