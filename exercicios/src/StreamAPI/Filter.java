package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        Consumer imprimir = System.out::println;

        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 5.8);
        Aluno a3 = new Aluno("Ana", 9.8);
        Aluno a4 = new Aluno("Ana", 6.8);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Ana", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Function<Aluno, String> saudacaoAprovado = a -> "Parabéns! : " + a.nome + " você foi aprovado(a) com nota: " + a.nota;
        alunos.stream()
                .filter(aprovados).map(saudacaoAprovado).forEach(imprimir);
    }
}
