package NivelDificil.NumeroMasRepetido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NumeroMasRepetido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres introducir? ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        System.out.println("Introduce los números:");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = scanner.nextInt();
        }

        encontrarMasRepetido(numeros);

        scanner.close();
    }

    public static void encontrarMasRepetido(int[] array) {
        Map<Integer, Integer> conteo = new HashMap<>();

        for (int numero : array) {
            conteo.put(numero, conteo.getOrDefault(numero, 0) + 1);
        }

        int maxRepeticiones = 0;

        // Encontrar el máximo número de repeticiones
        for (int repeticiones : conteo.values()) {
            if (repeticiones > maxRepeticiones) {
                maxRepeticiones = repeticiones;
            }
        }

        // Encontrar todos los números que tienen esas repeticiones
        List<Integer> empatados = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entrada : conteo.entrySet()) {
            if (entrada.getValue() == maxRepeticiones) {
                empatados.add(entrada.getKey());
            }
        }

        // Mostrar resultados
        if (empatados.size() == 1) {
            System.out.println("El número más repetido es: " + empatados.get(0));
        } else {
            System.out.println("Hay un empate entre los siguientes números:");
            for (int num : empatados) {
                System.out.println("- " + num + " (repetido " + maxRepeticiones + " veces)");
            }
        }
    }
}