package NivelDificil.MasEjercicios.LogicaSimulacion.AnalizadorTexto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AnalizadorTexto {
    public static void main(String[] args) {

        System.out.println("Escribe una frase: ");
        Scanner scanner= new Scanner(System.in);

        String expresion = scanner.nextLine();

        //eliminarDuplicadas(expresion);
        Set<String> palabrasUnicas = eliminarDuplicadas(expresion);
        System.out.println();

        scanner.close();
    }
    public static Set<String> eliminarDuplicadas(String expresion) {
        String limpio = expresion.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        String[] palabras = limpio.split(" ");

        Set<String> palabrasUnicas = new HashSet<>();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                palabrasUnicas.add(palabra);
            }
        }
        
        System.out.println("Palabras únicas encontradas:");
        for (String palabra : palabrasUnicas) {
            System.out.println(palabra);
            }



        
        
        return palabrasUnicas;
    }

}
