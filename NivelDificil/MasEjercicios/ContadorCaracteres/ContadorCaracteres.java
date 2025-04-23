package NivelDificil.MasEjercicios.ContadorCaracteres;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorCaracteres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        contarCaracteres(frase);

        scanner.close();
    }

    public static void contarCaracteres(String frase) {
        // Pasar a minúsculas y eliminar espacios
        frase = frase.toLowerCase().replaceAll(" ", "");

        // Mapa para almacenar la frecuencia de cada letra
        Map<Character, Integer> contador = new HashMap<>();

        for (char c : frase.toCharArray()) {
            // Solo contar letras (opcional, si no quieres contar signos)
            if (Character.isLetter(c)) {
                contador.put(c, contador.getOrDefault(c, 0) + 1);
            }
        }

        // Mostrar resultados
        for (Map.Entry<Character, Integer> entrada : contador.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
