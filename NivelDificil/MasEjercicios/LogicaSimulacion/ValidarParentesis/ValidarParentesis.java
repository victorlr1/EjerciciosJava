package NivelDificil.MasEjercicios.LogicaSimulacion.ValidarParentesis;

import java.util.Scanner;
import java.util.Stack;

public class ValidarParentesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una expresión con paréntesis: ");
        String expresion = sc.nextLine();

        if (esValida(expresion)) {
            System.out.println("La expresión está balanceada.");
        } else {
            System.out.println("La expresión NO está balanceada.");
        }

        sc.close();
    }

    public static boolean esValida(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) return false;

                char top = pila.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
}
