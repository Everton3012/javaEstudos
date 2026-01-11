package Classes_e_motodos.classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto(String nome) {
        this.nome = nome;
    }

    Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    Produto() {
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - descontoDoGerente);
    }
}
