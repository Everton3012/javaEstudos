package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String clente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    double getValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.preco * item.quantidade;
        }
        return total;
    }
}
