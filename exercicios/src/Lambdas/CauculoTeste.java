package Lambdas;

public class CauculoTeste {

    public static void main(String[] args) {
        Calculo calc = (x, y) -> {
            double resultado = x + y;
            return resultado;
        };

        System.out.println(calc.executar(2, 3));

        calc = (x, y) -> x - y;

        System.out.println(calc.executar(5, 3));
    }
}
