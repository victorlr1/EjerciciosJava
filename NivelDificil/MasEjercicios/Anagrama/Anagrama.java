package NivelDificil.MasEjercicios.Anagrama;

public class Anagrama {


    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Introduce la primera frase:");
        String frase1 = scanner.nextLine();
        System.out.println("Introduce la segunda frase:");
        String frase2 = scanner.nextLine();

        boolean resultado = sonAnagramas(frase1, frase2);
        if (resultado) {
            System.out.println("¡Son anagramas!");
        } else {
            System.out.println("No son anagramas.");
        }
        scanner.close();
    }

    public static boolean sonAnagramas(String frase1, String frase2) {
        // Eliminar espacios y pasar a minúsculas
        frase1 = frase1.replaceAll("\\s", "").toLowerCase();
        frase2 = frase2.replaceAll("\\s", "").toLowerCase();

        // Convertir en arreglo de caracteres
        char[] arr1 = frase1.toCharArray();
        char[] arr2 = frase2.toCharArray();

        // Ordenar los arreglos
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        // Comparar
        return java.util.Arrays.equals(arr1, arr2);
    }
}

