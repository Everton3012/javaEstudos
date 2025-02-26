package oo.composicao.desafio;

public class Sistema {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria joana");
        Compra compra1 = new Compra();

        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto("notebook", 1897.88), 2);
        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto("impressora", 998.98), 1);

        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
