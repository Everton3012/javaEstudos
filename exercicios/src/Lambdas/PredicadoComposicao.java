package Lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        System.err.println(isPar.and(isTresDigitos).test(222));
        System.err.println(isPar.and(isTresDigitos).test(22));
        System.err.println(isPar.or(isTresDigitos).test(34));
    }
}
