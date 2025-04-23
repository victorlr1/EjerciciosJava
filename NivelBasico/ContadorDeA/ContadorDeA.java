public class ContadorDeA {
    public static void main(String[] args) {
        String palabra = "banana";
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a') {
                contador++;
            }
        }

        System.out.println("Número de letras 'a': " + contador);
    }
}