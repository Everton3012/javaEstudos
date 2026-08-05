package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

    public static void main(String[] args) {
        BinaryOperator<Double> media = (Double n1, Double n2) -> (n1 + n2) / 2;

        System.out.println(media.apply(9.8, 5.7));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double mediaFinal = (n1 + n2) / 2;
            return mediaFinal >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(9.8, 2.7));

        Function<Double, String> conceito = m -> m >= 9 ? "A" : m >= 7 ? "B" : m >= 5 ? "C" : "D";

        System.err.println(conceito.apply(9.8));

    }
}
