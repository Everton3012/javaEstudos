package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome + " custa R$" + p.preco * (1 - p.desconto));
        Produto p1 = new Produto("Notebook", 2000, 0.15);
        Produto p2 = new Produto("Notebook", 2000, 0.15);
        Produto p3 = new Produto("Caneta", 2, 0.05);
        Produto p4 = new Produto("Caderno", 20, 0.10);
        Produto p5 = new Produto("Borracha", 5, 0.05);
        imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(
                p1, p2, p3, p4, p5
        );
        produtos.forEach(imprimir);
    }
}
