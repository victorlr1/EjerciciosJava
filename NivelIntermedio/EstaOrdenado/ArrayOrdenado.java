package NivelIntermedio.EstaOrdenado;

public class ArrayOrdenado {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        boolean ordenado = estaOrdenado(numeros);
        System.out.println("¿Está ordenado? " + ordenado);
    }

    public static boolean estaOrdenado(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

