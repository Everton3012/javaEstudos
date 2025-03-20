package lambdas;

public class Produto extends Object {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.desconto = desconto;
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return "Nome: " + nome + " tem preço de R$ " + precoFinal;
    }

}
