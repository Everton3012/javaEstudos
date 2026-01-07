package Classes_e_motodos.classe;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;
        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);

        System.out.printf("%s custa R$ %.2f com desconto aplicado\n", p1.nome, precoFinal1);
        System.out.printf("%s custa R$ %.2f com desconto aplicado\n", p2.nome, precoFinal2);
    }
}
