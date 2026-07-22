package oo.composicao.desafio;

public class Sistema {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1.5, 20);
        compra1.adicionarItem(new Item(new Produto("Caderno", 15.0), 2));

        Compra compra2 = new Compra();
        compra2.adicionarItem("Lápis", 0.5, 10);
        compra2.adicionarItem(new Item(new Produto("Borracha", 2.0), 1));
    }
}
