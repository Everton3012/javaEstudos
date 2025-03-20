package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Everton", "David", "Gui", "Luca");

        System.out.println("\n Usando o foreach... \n");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\n Usando Iterator... \n");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n Usando Stream... \n");

        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);

    }
}
