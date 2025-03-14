package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if (!(velocidadeAtual + delta >= VELOCIDADE_MAXIMA)) {
            velocidadeAtual += delta;
        }
        velocidadeAtual = VELOCIDADE_MAXIMA;
    }

    void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        }
        velocidadeAtual = 0;
    }

    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + "km/h";
    }
}
