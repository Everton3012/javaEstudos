package oo.heranca;

public class Jogo {

    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        Heroi heroi = new Heroi();

        monstro.x = 10;
        monstro.y = 10;
        heroi.x = 10;
        heroi.y = 11;

        monstro.atacar(heroi);
        monstro.atacar(heroi);

        heroi.atacar(monstro);
        heroi.atacar(monstro);
        System.out.println(heroi.vida);
        System.out.println(monstro.vida);

        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.SUL);
        monstro.andar(Direcao.SUL);
        monstro.andar(Direcao.LESTE);
        monstro.andar(Direcao.LESTE);
        monstro.andar(Direcao.OESTE);

        System.out.println(monstro.y);
        System.out.println(monstro.x);
    }
}
