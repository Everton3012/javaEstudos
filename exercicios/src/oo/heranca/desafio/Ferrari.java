package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }

    @Override
    void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 10;
        }
    }

    @Override
    public void ligarTurbo() {
        velocidadeAtual += 35;
    }

    @Override
    public void desligarTurbo() {
        velocidadeAtual += 15;
    }
}
