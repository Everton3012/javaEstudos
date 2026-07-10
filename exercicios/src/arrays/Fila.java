package arrays;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.offer("Lia");
        fila.offer("Gui");
        fila.offer("Natã");
        fila.offer("David");
        fila.add("Maria");

        System.err.println("<--------------------->");
        for (String nome : fila) {
            System.out.println(nome);
        }

        System.err.println("<--------------------->");
        System.out.println(fila.peek()); // Retorna o primeiro elemento da fila sem removê-lo
        System.out.println(fila.element());  // Retorna o primeiro elemento da fila sem removê-lo, mas lança uma exceção se a fila estiver vazia

        System.err.println(fila.size());

        System.err.println(fila.isEmpty());

        System.err.println(fila.contains("Gui"));

        System.out.println(fila.poll()); // Retorna e remove o primeiro elemento da fila

        System.out.println(fila.remove()); // Retorna e remove o primeiro elemento da fila, mas lança uma exceção se a fila estiver vazia

        fila.clear();

    }
}
