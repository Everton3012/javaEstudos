package StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MinMax {

    public static void main(String[] args) {
        Consumer action = System.out::println;
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 7.1);
        Aluno a3 = new Aluno("Gui", 7.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = List.of(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if (aluno1.nota > aluno2.nota) {
                return 1;
            }
            if (aluno1.nota < aluno2.nota) {
                return -1;
            }
            return 0;
        };

        Comparator<Aluno> menorNota = (aluno1, aluno2) -> {
            if (aluno1.nota < aluno2.nota) {
                return 1;
            }
            if (aluno1.nota > aluno2.nota) {
                return -1;
            }
            return 0;
        };

        Aluno maiorResultado = alunos.stream().max(melhorNota).get();
        action.accept(maiorResultado);
        Aluno menorResultado = alunos.stream().max(menorNota).get();
        action.accept(menorResultado);
    }
}
