package arrays;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Gui"));
        lista.add(new Usuario("Natã"));
        lista.add(new Usuario("David"));

        System.out.println(lista.get(3));

        lista.remove(1);
        System.out.println("<--------------------->");

        for (Usuario u : lista) {
            System.out.println(u.getNome());
        }
    }
}
