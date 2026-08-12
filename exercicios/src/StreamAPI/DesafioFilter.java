package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Consumer<String> imprimir = System.out::println;

        Produto p1 = new Produto("Notebook", 3000.00, 0.30, 0);
        Produto p2 = new Produto("Smartphone", 1500.00, 0.32, 0);
        Produto p3 = new Produto("Tablet", 800.00, 0.32, 0);
        Produto p4 = new Produto("Monitor", 600.00, 0.05, 25.00);
        Produto p5 = new Produto("Teclado", 100.00, 0.1, 10.00);
        Produto p6 = new Produto("Mouse", 50.00, 0.2, 5.00);
        Produto p7 = new Produto("Cadeira", 200.00, 0.15, 15.00);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
        Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
        Predicate<Produto> produtoRelevante = p -> p.preco >= 500;

        Function<Produto, String> chamadaPromocional = p -> "Produto: " + p.nome + ", Preço: " + p.preco + ", Desconto: " + p.desconto + ", Frete: " + p.valorFrete;

        produtos.stream().filter(superPromocao).filter(freteGratis).filter(produtoRelevante).map(chamadaPromocional).forEach(imprimir);
    }
}
