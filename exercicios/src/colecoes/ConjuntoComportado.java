package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();

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
