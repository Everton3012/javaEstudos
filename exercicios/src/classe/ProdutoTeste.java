package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89, .25);
        //p1.preco = 4356.89;
        //p1.desconto = .25;

        double valorFinal = p1.precoComDesconto(-0.25);

        System.out.println(p1.nome);
        System.out.printf("%.2f", valorFinal);

    }
}
