package Lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        int PrecoMedio = 1000;
        Predicate<Produto> isCaro = p -> (p.preco * (1 - p.desconto))>= PrecoMedio;

        Produto p1 = new Produto("Notebook", 2000, 0.85);

        System.out.println("O produto " + p1.nome + " é caro? " + isCaro.test(p1));
    }
}
