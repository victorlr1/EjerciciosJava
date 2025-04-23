package MaximoEnArray;

public class MaximoEnArray {
    public static void main(String[] args) {
        int[] numeros = {4, 15, 2, 33, 10};

        int max = numeros[0];

        // aquí va el bucle para encontrar el número más grande
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max=numeros[i];
            }
        }

        System.out.println("El número más grande es: " + max);
    }
}
