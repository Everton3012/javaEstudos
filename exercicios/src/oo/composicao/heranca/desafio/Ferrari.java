package oo.composicao.heranca.desafio;

public class Ferrari extends Carro {

    @Override
    void acelerar() {
        super.acelerar();
        super.acelerar();
        super.acelerar();
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }

    @Override
    void frear() {
        super.frear();
        super.frear();
        super.frear();
    }

    public String toString() {
        return "Ferrari: " + velocidadeAtual + " km/h";
    }

}
