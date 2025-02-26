package oo.heranca;

public class Jogo {

    public static void main(String[] args) {
        Monstro j1 = new Monstro();
        Heroi j2 = new Heroi();

        j1.x = 10;
        j1.y = 10;
        j2.x = 10;
        j2.y = 11;

        j1.atacar(j2);
        j1.atacar(j2);

        j2.atacar(j1);
        System.out.println(j2.vida);
        System.out.println(j1.vida);

        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.SUL);
        j1.andar(Direcao.SUL);
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.OESTE);

        System.out.println(j1.y);
        System.out.println(j1.x);
    }
}
