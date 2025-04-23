package NivelDificil.MasEjercicios.LogicaSimulacion.RelojDeArena;

import java.util.Scanner;

public class RelojDeArena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número impar mayor o igual que 3: ");
        int n = scanner.nextInt();

        // Validación
        if (n < 3 || n % 2 == 0) {
            System.out.println("Número inválido. Debe ser impar y mayor o igual que 3.");
            return;
        }

        // Parte superior
        for (int i = 0; i <= n / 2; i++) {
            for (int espacio = 0; espacio < i; espacio++) {
                System.out.print(" ");
            }
            for (int estrella = 0; estrella < n - 2 * i; estrella++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferior
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int espacio = 0; espacio < i; espacio++) {
                System.out.print(" ");
            }
            for (int estrella = 0; estrella < n - 2 * i; estrella++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
