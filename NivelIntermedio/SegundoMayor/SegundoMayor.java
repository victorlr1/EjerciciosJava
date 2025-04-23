package NivelIntermedio.SegundoMayor;

public class SegundoMayor {

    public static void main(String[] args) {
        int[] numeros = {5, 8, 2, 10, 7};

        int segundoMayor = encontrarSegundoMayor(numeros);

        System.out.println("El segundo número más grande es: " + segundoMayor);
    }

    public static int encontrarSegundoMayor(int[] array) {
        // Aquí irá la lógica para encontrar el segundo mayor
        if (array.length < 2) {
            System.out.println("El array no tiene suficientes elementos.");
            return -1;
        }
        int mayor = Integer.MIN_VALUE;
        int segundoMayor = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];

            if (num > mayor) {
                segundoMayor = mayor;
                mayor = num;
            } else if (num > segundoMayor && num != mayor) {
                segundoMayor = num;
            }
        }

        // Si segundoMayor no cambió, no hay segundo distinto
        if (segundoMayor == Integer.MIN_VALUE) {
            System.out.println("No hay un segundo número mayor distinto.");
            return -1;
        }

        return segundoMayor;
    }
}

