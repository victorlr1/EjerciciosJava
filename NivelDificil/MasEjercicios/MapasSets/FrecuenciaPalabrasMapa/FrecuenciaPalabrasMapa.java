package NivelDificil.MasEjercicios.MapasSets.FrecuenciaPalabrasMapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrecuenciaPalabrasMapa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z ]", "");

        String[] palabras = texto.split(" ");
        Map<String, Integer> frecuencia = new HashMap<>();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
            }
        }

        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entry : frecuencia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}
