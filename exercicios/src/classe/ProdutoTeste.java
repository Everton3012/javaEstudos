package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = .25;

        double valorFinal = p1.preco * (1 - p1.desconto);

        System.out.printf("%.2f", valorFinal);

    }
}
