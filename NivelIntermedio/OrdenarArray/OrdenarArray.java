package NivelIntermedio.OrdenarArray;

import java.util.Scanner;

public class OrdenarArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {5, 2, 9, 1, 7};

        System.out.println("Array original:");
        mostrarArray(numeros);

        System.out.println("\nElige cómo quieres ordenar el array:");
        System.out.println("1. Ascendente");
        System.out.println("2. Descendente");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            ordenarBubbleAscendente(numeros);
            System.out.println("\nArray ordenado de forma ascendente:");
        } else if (opcion == 2) {
            ordenarBubbleDescendente(numeros);
            System.out.println("\nArray ordenado de forma descendente:");
        } else {
            System.out.println("Opción no válida.");
            scanner.close();
            return;
        }

        mostrarArray(numeros);
        scanner.close();
    }

    // Método para ordenar de menor a mayor
    public static void ordenarBubbleAscendente(int[] array) {
        int n = array.length;
    
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Pasada " + (i + 1) + ":");
            
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
    
            // Imprimir cómo va quedando el array después de cada pasada
            mostrarArray(array);
            System.out.println(); // línea en blanco
        }
    }
    

    // Método para ordenar de mayor a menor
    public static void ordenarBubbleDescendente(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Método para mostrar el array
    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

