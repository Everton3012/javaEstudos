package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Reduce1 {

    public static void main(String[] args) {
        Consumer imprimir = System.out::println;
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        Integer total1 = nums.stream().reduce(soma).get();

        imprimir.accept(total1);

        Integer total2 = nums.parallelStream().reduce(100, soma);
        imprimir.accept(total2);

        nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(imprimir);

    }
}
