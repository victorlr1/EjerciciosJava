package MayoresQueMedia;

public class MayoresQueMedia {

    public static void main(String[] args) {
        int[] numeros = {4, 7, 10, 2, 8};

        int suma = calcularSuma(numeros);
        double media = calcularMedia(numeros);

        int mayores = contarMayoresQueMedia(numeros, media);

        System.out.println("Resultado suma: " + suma);
        System.out.println("La media es: " + media);
        System.out.println("Cantidad de números mayores que la media: " + mayores);
    }

    public static int calcularSuma(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }

    public static double calcularMedia(int[] array) {
        int suma = calcularSuma(array);
        return (double) suma / array.length;
    }

    public static int contarMayoresQueMedia(int[] array, double media) {
        int contador = 0;
        for (int num : array) {
            if (num > media) {
                contador++;
            }
        }
        return contador;
    }
}

    

