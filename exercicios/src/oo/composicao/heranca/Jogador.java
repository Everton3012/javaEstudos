package oo.composicao.heranca;

public class Jogador {

    int life = 100;
    int forca = 10;
    int x;
    int y;

    public Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean atacar(Jogador oponente) {

        int detalX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (detalX == 0 && deltaY == 1) {
            oponente.life -= forca;
            return true;
        } else if (deltaY == 0 && detalX == 1) {
            oponente.life -= forca;
            return true;
        } else {
            return false;
        }

    }

    boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
            default:
                throw new AssertionError();
        }

        return true;
    }
}
