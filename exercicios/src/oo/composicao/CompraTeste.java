package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.clente = "João";

        c1.adicionarItem("Caneta", 20, 7.45);
        c1.adicionarItem("Borracha", 12, 3.89);
        c1.adicionarItem("Caderno", 3, 18.79);

        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());
    }
}
