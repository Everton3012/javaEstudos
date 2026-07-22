package oo.composicao;

public class Motor {

    boolean ligado = false;
    double fatorInjecao = 1.0;

    int giros() {
        if (!ligado) {
            return 0;
        }
        return (int) (fatorInjecao * 3000); // Exemplo: fator base é 3000
    }

    double getFatorBase() {
        return 3000.0; // Retorna o fator base para cálculo
    }
}
