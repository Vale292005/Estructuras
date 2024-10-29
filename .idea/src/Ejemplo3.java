import java.util.HashMap;
import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        HashMap<String, Integer> wordCount = new HashMap<>();//contador palabra
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el texto:");
        String texto = scanner.nextLine();

        String[] palabras = texto.split("\\w+");

        for (String palabra : palabras) {
            palabra = palabra.toLowerCase();
            wordCount.put(palabra, wordCount.getOrDefault(palabra, 0) + 1);
        }

        for (String palabra : wordCount.keySet()) {
            System.out.println(palabra + ": " + wordCount.get(palabra));
        }
    }
}

