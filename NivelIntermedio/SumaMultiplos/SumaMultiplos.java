package NivelIntermedio.SumaMultiplos;

public class SumaMultiplos {

    public static void main(String[] args) {
        int resultado = sumarMultiplos(10);
        System.out.println("Resultado: " + resultado);
    }

    public static int sumarMultiplos(int n) {
        // Aquí va la lógica
        int suma=0;
        for (int i = 1; i < n; i++) {
            if( i % 3 ==0 || i % 5 ==0 ){
                suma+=i;
            }
        }
        return suma;
    }
}
