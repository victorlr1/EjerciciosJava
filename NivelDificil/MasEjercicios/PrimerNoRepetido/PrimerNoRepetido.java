package NivelDificil.MasEjercicios.PrimerNoRepetido;

import java.util.*;

public class PrimerNoRepetido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una palabra o frase: ");
        String texto = scanner.nextLine();

        Character resultado = primerNoRepetido(texto);

        if (resultado != null) {
            System.out.println("El primer carácter no repetido es: " + resultado);
        } else {
            System.out.println("No hay ningún carácter no repetido.");
        }

        scanner.close();
    }

    public static Character primerNoRepetido(String texto) {
        // Convertimos a minúsculas para ignorar mayúsculas/minúsculas
        texto = texto.toLowerCase();

        // Usamos LinkedHashMap para mantener el orden
        Map<Character, Integer> conteo = new LinkedHashMap<>();

        // Contamos apariciones (ignorando espacios)
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == ' ') continue; // ignoramos espacios

            conteo.put(c, conteo.getOrDefault(c, 0) + 1);
        }

        // Buscamos el primer carácter que aparece solo una vez
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == ' ') continue; // ignoramos espacios

            if (conteo.get(c) == 1) {
                return c;
            }
        }

        return null; // no hay ningún carácter no repetido
    }
}

