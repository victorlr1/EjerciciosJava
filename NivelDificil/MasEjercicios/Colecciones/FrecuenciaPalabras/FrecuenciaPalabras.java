package NivelDificil.MasEjercicios.Colecciones.FrecuenciaPalabras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrecuenciaPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine().toLowerCase();

        String[] palabras = frase.split(" ");
        Map<String, Integer> frecuencia = new HashMap<>();

        for (String palabra : palabras) {
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }

        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entrada : frecuencia.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        sc.close();
    }
}
