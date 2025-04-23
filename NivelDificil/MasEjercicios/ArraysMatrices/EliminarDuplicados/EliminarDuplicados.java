package NivelDificil.MasEjercicios.ArraysMatrices.EliminarDuplicados;

import java.util.ArrayList;
import java.util.Scanner;

public class EliminarDuplicados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a introducir? ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Introduce los números:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] resultado = eliminarDuplicados(array);

        System.out.println("Array sin duplicados:");
        for (int num : resultado) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static int[] eliminarDuplicados(int[] array) {
        ArrayList<Integer> listaUnicos = new ArrayList<>();

        for (int num : array) {
            if (!contiene(listaUnicos, num)) {
                listaUnicos.add(num);
            }
        }

        // Convertimos ArrayList a array
        int[] resultado = new int[listaUnicos.size()];
        for (int i = 0; i < listaUnicos.size(); i++) {
            resultado[i] = listaUnicos.get(i);
        }

        return resultado;
    }

    // Método auxiliar que comprueba si un número ya está en la lista
    public static boolean contiene(ArrayList<Integer> lista, int valor) {
        for (int num : lista) {
            if (num == valor) return true;
        }
        return false;
    }
}
