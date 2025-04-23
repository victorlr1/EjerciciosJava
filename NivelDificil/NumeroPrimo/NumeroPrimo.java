package NivelDificil.NumeroPrimo;

public class NumeroPrimo {
    

    public static void main(String[] args) {
        int numero=7;
        boolean esPrimo = esNumeroPrimo(numero);
        System.out.println("Es primo ? "+ esPrimo);
    }

    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
    
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
    
        return true;
    }
}