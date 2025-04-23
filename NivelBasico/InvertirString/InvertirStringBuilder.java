package InvertirString;
import java.util.Scanner;
public class InvertirStringBuilder {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe un texto: ");
        String texto = scanner.nextLine();

        
        //¿Por qué usar StringBuilder?
        //En Java, los String son inmutables: cada vez que usas +=, estás creando un nuevo objeto en memoria.
        //StringBuilder permite modificar cadenas sin crear nuevos objetos, lo que mejora el rendimiento.
        
        StringBuilder sb = new StringBuilder(texto);
        String invertido = sb.reverse().toString();

        System.out.println("Texto invertido: " + invertido);
        scanner.close();
    }
}


