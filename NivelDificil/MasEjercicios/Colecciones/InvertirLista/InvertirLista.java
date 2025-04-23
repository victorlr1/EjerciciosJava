package NivelDificil.MasEjercicios.Colecciones.InvertirLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvertirLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos elementos tendrá la lista?: ");
        int n = sc.nextInt();

        List<Integer> lista = new ArrayList<>();
        System.out.println("Introduce los elementos:");
        for (int i = 0; i < n; i++) {
            lista.add(sc.nextInt());
        }

        System.out.println("Lista original: " + lista);

        System.out.print("Lista invertida: [");
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.get(i));
            if (i > 0) System.out.print(", ");
        }
        System.out.println("]");

        sc.close();
    }
}
