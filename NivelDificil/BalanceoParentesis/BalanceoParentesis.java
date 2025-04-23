package NivelDificil.BalanceoParentesis;

import java.util.Scanner;

public class BalanceoParentesis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una expresión con paréntesis: ");
        String expresion = scanner.nextLine();

        boolean estaBalanceado = verificarBalanceo(expresion);

        if (estaBalanceado) {
            System.out.println("La expresión está balanceada.");
        } else {
            System.out.println("La expresión NO está balanceada.");
        }

        scanner.close();
    }

    public static boolean verificarBalanceo(String expresion) {
        int contador = 0;

        for (int i = 0; i < expresion.length(); i++) {
            if (expresion.charAt(i) == '(') {
                contador++;
            } else if (expresion.charAt(i) == ')') {
                contador--;
                if (contador < 0) {
                    return false; // Se cerró un paréntesis sin haberse abierto
                }
            }
        }

        return contador == 0; // Tiene que terminar en 0 para estar balanceado
    }
}


