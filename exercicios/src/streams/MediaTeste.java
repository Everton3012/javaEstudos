package streams;

public class MediaTeste {

    public static void main(String[] args) {
        Media m1 = new Media().adicionar(6.7).adicionar(8.3);
        Media m2 = new Media().adicionar(7.9).adicionar(6.6);

        double valor1 = m1.getValor();
        double valor2 = m2.getValor();

        System.out.println(valor1);
        System.out.println(valor2);

        double mediaCombinada = Media.combinar(m1, m2).getValor();

        System.out.println(mediaCombinada);
    }
}
