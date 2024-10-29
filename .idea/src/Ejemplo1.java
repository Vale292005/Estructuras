
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {
        int n = 100000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        //Agregado en arrayList
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        long end = System.nanoTime();
        System.out.println("Inserción en ArrayList: " + (end - start) + " ns");

        // agregar en LindkedList
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("Inserción en LinkedList: " + (end - start) + " ns");

        // Acceso por índice en ArrayList
        start = System.nanoTime();
        arrayList.get(n / 2);
        end = System.nanoTime();
        System.out.println("Acceso en ArrayList: " + (end - start) + " ns");

        // Acceso por índice en LinkedList
        start = System.nanoTime();
        linkedList.get(n / 2);
        end = System.nanoTime();
        System.out.println("Acceso en LinkedList: " + (end - start) + " ns");
    }
}
