package arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {
        Deque<String> Livros = new ArrayDeque<>();

        Livros.add("O Pequeno Príncipe");
        Livros.push("O Hobbit");
        Livros.push("O Senhor dos Anéis");

        System.out.println("<--------------------->");

        for (String livro : Livros) {
            System.out.println(livro);
        }

        System.out.println("<--------------------->");

        System.out.println(Livros.peek()); // Retorna o último elemento da pilha sem removê-lo
        System.out.println(Livros.element());  // Retorna o último elemento da pilha sem removê-lo, mas lança uma exceção se a pilha estiver vazia

        System.out.println(Livros.size());

        System.out.println(Livros.isEmpty());

        System.out.println(Livros.contains("O Hobbit"));

        System.out.println(Livros.pop()); // Retorna e remove o último elemento da pilha

        System.out.println(Livros.remove()); // Retorna e remove o último elemento da pilha, mas lança uma exceção se a pilha estiver vazia
    }
}
