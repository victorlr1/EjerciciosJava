package SumarDigitos;

import java.util.Scanner;

public class SumarDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        int suma = sumarDigitos(numero);

        System.out.println("La suma de los dígitos es: " + suma);

        scanner.close();
    }

    public static int sumarDigitos(int numero) {
        int suma = 0;

        while (numero > 0) {
            int digito = numero % 10; // obtener el último dígito
            suma += digito;           // sumarlo
            numero = numero / 10;     // quitar el último dígito
        }

        return suma;
    }
}
