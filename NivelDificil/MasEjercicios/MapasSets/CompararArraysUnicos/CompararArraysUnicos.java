package NivelDificil.MasEjercicios.MapasSets.CompararArraysUnicos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CompararArraysUnicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamaño del primer array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Introduce los elementos:");
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();

        System.out.print("Tamaño del segundo array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Introduce los elementos:");
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();

        boolean mismosUnicos = tienenMismosUnicos(a, b);

        if (mismosUnicos) {
            System.out.println("Ambos arrays tienen los mismos elementos únicos.");
        } else {
            System.out.println("Los arrays tienen elementos únicos diferentes.");
        }

        sc.close();
    }

    public static boolean tienenMismosUnicos(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        for (int num : a) setA.add(num);

        Set<Integer> setB = new HashSet<>();
        for (int num : b) setB.add(num);

        return setA.equals(setB);
    }
}
