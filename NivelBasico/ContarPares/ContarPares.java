package ContarPares;

public class ContarPares {
    
        public static void main(String[] args) {
            int[] numeros = {2, 5, 8, 13, 6, 9};
            int contador = 0;
    
            // Aquí va el bucle con la condición
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 == 0) {
                   contador++;
                }
            }
            System.out.println("Cantidad de números pares: " + contador);
        
    }
}
