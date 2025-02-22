package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportadoOrdenado {

    public static void main(String[] args) {
        SortedSet<String> lista = new TreeSet<String>();

        lista.add("Everton");
        lista.add("Ronald");
        lista.add("David");
        lista.add("Junior");
        lista.add("Natã");

        System.out.println(lista);

        for (String candidato : lista) {
            System.out.println(candidato);
        }

    }
}
