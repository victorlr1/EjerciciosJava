package NivelDificil.InvertirPalabras;

public class InvertirPalabras {
    
    public static void main(String[] args) {
        String frase = "Hoy me siento fuerte";
        String resultado = invertirPalabras(frase);
        System.out.println(resultado);
    }

    public static String invertirPalabras(String frase) {
        String[] palabras = frase.split(" ");
        StringBuilder resultado = new StringBuilder();
    
        for (int i = palabras.length - 1; i >= 0; i--) {
            resultado.append(palabras[i]);
            if (i != 0) {
                resultado.append(" ");
            }
        }
    
        return resultado.toString();
    }
    

  /*  public static String invertirPalabras(String frase) {
       
        String[] palabras=frase.split(" ");
        String palabraInvertida=("");
        for (int i = palabras.length - 1; i >= 0; i--) {
            palabraInvertida += palabras[i] + " ";

        }

        return palabraInvertida.trim();
    }
        */ 
}
