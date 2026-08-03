package Lambdas;

import java.util.function.BinaryOperator;

public class CauculoTeste2 {

    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> {
            double resultado = x + y;
            return resultado;
        };

        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> x - y;

        System.out.println(calc.apply(5.0, 3.0));

    }
}
