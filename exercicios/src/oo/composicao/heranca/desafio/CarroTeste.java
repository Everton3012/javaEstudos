package oo.composicao.heranca.desafio;

public class CarroTeste {

    public static void main(String[] args) {
        Civic c = new Civic();
        Ferrari f = new Ferrari();

        c.acelerar();

        System.out.println(c);

        c.acelerar();

        System.out.println(c);

        c.acelerar();

        System.out.println(c);

        f.acelerar();

        System.out.println(f);
        f.acelerar();

        System.out.println(f);
        f.acelerar();

        System.out.println(f);

        f.frear();
        System.out.println(f);
    }
}
