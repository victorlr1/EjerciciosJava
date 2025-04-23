package NivelDificil.MasEjercicios.Colecciones.DetectarElementoComun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetectarElementoComun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad de elementos para la primera lista: ");
        int n = sc.nextInt();
        List<Integer> lista1 = new ArrayList<>();
        System.out.println("Introduce los elementos:");
        for (int i = 0; i < n; i++) lista1.add(sc.nextInt());

        System.out.print("Introduce la cantidad de elementos para la segunda lista: ");
        int m = sc.nextInt();
        List<Integer> lista2 = new ArrayList<>();
        System.out.println("Introduce los elementos:");
        for (int i = 0; i < m; i++) lista2.add(sc.nextInt());

        boolean tieneComun = false;
        for (int num : lista1) {
            if (lista2.contains(num)) {
                tieneComun = true;
                break;
            }
        }

        if (tieneComun) {
            System.out.println("Las listas tienen al menos un elemento en común.");
        } else {
            System.out.println("Las listas NO tienen elementos en común.");
        }

        sc.close();
    }
}
