package NivelDificil.Palindromo;

public class Palindromo {

    public static void main(String[] args) {
        String texto = "Anita lava la tina";
        boolean es = esPalindromo(texto);
        System.out.println("¿Es palíndromo? " + es);
    }

    public static boolean esPalindromo(String texto) {
       
        String texto2="";
        texto2.toLowerCase();
        texto = texto.toLowerCase().replace(" ", "");
        
        for (int i = texto.length() - 1; i >= 0; i--) {
            texto2 += texto.charAt(i);          // Invertimos el texto
        }
        if(texto2.equals(texto)){
            return true;
        }else{
            return false;}
        
    }

   /*  public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase().replace(" ", "");
    
        StringBuilder invertido = new StringBuilder(texto);
        invertido.reverse();
    
        return texto.equals(invertido.toString());
    }*/
}
