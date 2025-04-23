package NivelIntermedio.ContarCaracteres;

import java.util.HashMap;
import java.util.Map;

public class ContarCaracteres {

    public static void main(String[] args) {
        String texto = "hola HoLa";
        contarLetras(texto);
    }

    public static void contarLetras(String texto) {
        Map<Character, Integer> contador = new HashMap<>();
        
        texto = texto.toLowerCase(); // Convertimos a minúsculas
    
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
    
            if (letra != ' ') {
                if (contador.containsKey(letra)) {
                    contador.put(letra, contador.get(letra) + 1);
                } else {
                    contador.put(letra, 1);
                }
            }
        }
    
        // Mostrar el resultado
        for (Map.Entry<Character, Integer> entrada : contador.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }
}    
