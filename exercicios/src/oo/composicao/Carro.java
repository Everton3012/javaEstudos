package oo.composicao;

public class Carro {

    Motor motor = new Motor();

    void acelerar() {
        motor.fatorInjecao += 0.4;
    }

    void frear() {
        if (motor.giros() > 3000) {
            motor.fatorInjecao -= 0.4; // Reduz o fator de injeção para frear
        }
        if (motor.giros() < 3000) {
            motor.fatorInjecao = 3000 / motor.getFatorBase(); // Ajusta para manter no mínimo 3000 giros
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }

    void travar() {
        motor.ligado = false;
        motor.fatorInjecao = 0;
    }
}
