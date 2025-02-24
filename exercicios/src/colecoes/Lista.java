package colecoes;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("aeri"));

        System.out.println(lista.get(1).nome);
        System.out.println(">>>>>>>>" + lista.remove(0));

        System.out.println(lista.contains(new Usuario("Ana")));
        for (Usuario usuario : lista) {
            System.out.println(usuario);
        }
    }
}
