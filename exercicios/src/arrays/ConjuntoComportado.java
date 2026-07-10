package arrays;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {
        //Set<String> lista = new HashSet<String>();
        Set<String> lista = new TreeSet<String>();
        lista.add("Ana");
        lista.add("Everton");
        lista.add("Bia");
        lista.add("natã");
        lista.add("david");

        for (String valor : lista) {
            System.out.println(valor);
        }

    }
}
