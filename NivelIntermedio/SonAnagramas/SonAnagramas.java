package NivelIntermedio.SonAnagramas;

import java.util.Arrays;
import java.util.Scanner;

public class SonAnagramas {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nEscribe 2 palabras para ver si son anagramas:");
    System.out.println("Palabra 1");
    String palabra1 = scanner.next();

    System.out.println("Palabra 2");
    String palabra2 = scanner.next();
    
    boolean resultado = sonAnagramas(palabra1, palabra2);
    System.out.println("¿Son anagramas? " + resultado);
    scanner.close();

    }
    public static boolean sonAnagramas(String palabra1, String palabra2) {
        
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
        char[] letras1 = palabra1.toCharArray();
        char[] letras2 = palabra2.toCharArray();
        Arrays.sort(letras1);
        Arrays.sort(letras2);

        return Arrays.equals(letras1, letras2);
        

    }
}

