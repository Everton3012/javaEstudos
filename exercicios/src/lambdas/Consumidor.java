package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.34, .09);
        Produto p2 = new Produto("Notebook", 2987.99, .25);
        Produto p3 = new Produto("Caderno", 19.90, .03);
        Produto p4 = new Produto("Borracha", 7.80, .18);
        Produto p5 = new Produto("Lapis", 4.39, .19);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimirNome);

        produtos.forEach(p -> System.out.println(p.preco));

        produtos.forEach(System.out::println);
    }
}
