package Lambdas;

import java.util.Scanner;
import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();

            Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Ímpar";

            //System.out.println(parOuImpar.apply(numero));
            Function<String, String> oResultadoE = resultado -> "O resultado é: " + resultado;

            Function<String, String> empolgado = resultado -> resultado + "!!!";

            Function<String, String> duvida = resultado -> resultado + "???";

            String resultadoFinal1
                    = parOuImpar
                            .andThen(oResultadoE)
                            .andThen(empolgado)
                            .apply(numero);

            System.out.println(resultadoFinal1);

            String resultadoFinal2
                    = parOuImpar
                            .andThen(oResultadoE)
                            .andThen(duvida)
                            .apply(numero);

            System.out.println(resultadoFinal2);

        } else {
            System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
        }

        scanner.close();
    }
}
