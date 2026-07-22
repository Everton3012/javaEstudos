package oo.composicao.heranca;

public class Monstro extends Jogador {

    Monstro() {
        super(0, 0);
        this.life = 80;
    }

    Monstro(int x, int y) {
        super(x, y);
        this.life = 80;
    }

}
