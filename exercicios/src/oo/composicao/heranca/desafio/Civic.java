package oo.composicao.heranca.desafio;

public class Civic extends Carro {

    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }

    @Override
    void frear() {
        if (velocidadeAtual >= 15) {
            velocidadeAtual -= 15;
        } else {
            velocidadeAtual = 0;
        }
    }

    public String toString() {
        return "Civic: " + velocidadeAtual + " km/h";
    }

}
