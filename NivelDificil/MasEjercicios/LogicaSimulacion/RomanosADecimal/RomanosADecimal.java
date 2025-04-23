package NivelDificil.MasEjercicios.LogicaSimulacion.RomanosADecimal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanosADecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número romano: ");
        String romano = scanner.nextLine().toUpperCase();

        int resultado = convertirARomano(romano);
        System.out.println("Valor decimal: " + resultado);

        scanner.close();
    }

    public static int convertirARomano(String s) {
        Map<Character, Integer> valores = new HashMap<>();
        valores.put('I', 1);
        valores.put('V', 5);
        valores.put('X', 10);
        valores.put('L', 50);
        valores.put('C', 100);
        valores.put('D', 500);
        valores.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int valorActual = valores.get(s.charAt(i));

            if (i + 1 < s.length()) {
                int valorSiguiente = valores.get(s.charAt(i + 1));

                if (valorActual < valorSiguiente) {
                    total -= valorActual; // resta
                } else {
                    total += valorActual; // suma
                }
            } else {
                total += valorActual;
            }
        }

        return total;
    }
}
