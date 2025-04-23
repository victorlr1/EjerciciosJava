package NivelDificil.MasEjercicios.InvertirPalabras;

import java.util.Scanner;

public class InvertirPalabras {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();

        String resultado = invertirPalabras(frase);
        System.out.println("Frase invertida: " + resultado);

        scanner.close();
    }

    public static String invertirPalabras(String frase) {
        // Dividir la frase por espacios
        String[] palabras = frase.split(" ");
        
        // Usamos StringBuilder para construir la frase invertida
        StringBuilder resultado = new StringBuilder();

        // Recorremos el array desde el final al principio
        for (int i = palabras.length - 1; i >= 0; i--) {
            resultado.append(palabras[i]);
            if (i > 0) {
                resultado.append(" ");
            }
        }

        return resultado.toString();
    }
}
