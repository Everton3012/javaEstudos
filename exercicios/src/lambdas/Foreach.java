package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList(
                "Ana", "Lia", "Bia", "Gui"
        );

        System.out.println("Forma tradicional...\n");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...\n");
        aprovados.forEach((nome)
                -> System.out.println(nome + "!!!"));

        System.out.println("\nMethod Reference #01...\n");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02...\n");
        aprovados.forEach((nome)
                -> meuImprimir(nome));

        System.out.println("\nMethod Reference #02...\n");
        aprovados.forEach(Foreach::meuImprimir);

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }
}
