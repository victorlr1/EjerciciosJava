package InvertirString;

import java.util.Scanner;

public class InvertirString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Creamos el escáner

        System.out.print("Escribe un texto: ");
        String texto = scanner.nextLine();         // Leemos el texto escrito

        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);          // Invertimos el texto
        }

        System.out.println("Texto invertido: " + invertido);
        scanner.close();  // Cerramos el escáner
    }


}
