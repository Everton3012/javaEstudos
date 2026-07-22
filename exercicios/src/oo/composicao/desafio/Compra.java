package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));

    }

    void adicionarItem(Produto produto, int quantidade) {
        this.itens.add(new Item(produto, quantidade));
    }

    double obterValorTotal() {
        double total = 0;
        for (Item item : this.itens) {
            total += item.produto.preco * item.quanditade;
        }
        return total;
    }

    public void adicionarItem(Item item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarItem'");
    }
}
