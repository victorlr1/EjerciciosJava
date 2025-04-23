package NivelDificil.FactorialRecursivo;

import java.util.Scanner;

public class FactorialRecursivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para calcular su factorial: ");
        int numero = scanner.nextInt() ;

        int resultado = factorial(numero);
        System.out.println("El factorial de "+numero+" es: "+resultado);
        scanner.close();

    }
    
        public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
    
}
}
