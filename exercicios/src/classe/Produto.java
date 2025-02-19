package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = .25;

    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    float precoComDesconto() {
        return (float) (preco * (1 - desconto));
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - (desconto + descontoDoGerente));
    }

}
