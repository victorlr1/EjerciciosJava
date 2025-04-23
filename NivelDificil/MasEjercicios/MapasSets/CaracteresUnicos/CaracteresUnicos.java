package NivelDificil.MasEjercicios.MapasSets.CaracteresUnicos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CaracteresUnicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String texto = sc.nextLine().toLowerCase().replaceAll(" ", "");

        Set<Character> conjunto = new HashSet<>();
        boolean todosUnicos = true;

        for (char c : texto.toCharArray()) {
            if (conjunto.contains(c)) {
                todosUnicos = false;
                break;
            }
            conjunto.add(c);
        }

        if (todosUnicos) {
            System.out.println("Todos los caracteres son únicos.");
        } else {
            System.out.println("La cadena tiene caracteres repetidos.");
        }

        sc.close();
    }
}
