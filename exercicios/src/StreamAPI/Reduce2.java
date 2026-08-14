package StreamAPI;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

    public static void main(String[] args) {
        Consumer action = System.out::println;
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 8.1);
        Aluno a3 = new Aluno("Gui", 6.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = List.of(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        Function<Aluno, Double> apenasNota = a -> a.nota;

        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        alunos.parallelStream().filter(aprovado).map(apenasNota).reduce(somatorio).ifPresent(action);
    }
}
