package StreamAPI;

public class MediaTeste {

    public static void main(String[] args) {
        Media m1 = new Media().adicionar(8.3).adicionar(6.7).adicionar(9.8);

        m1.adicionar(6.7);

        Media m2 = new Media().adicionar(7.8).adicionar(5.4);

        m2.adicionar(7.8);
        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combinar(m1, m2).getValor());
    }
}
