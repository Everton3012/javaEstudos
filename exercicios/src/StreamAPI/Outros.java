package StreamAPI;

import java.util.List;
import java.util.function.Consumer;

public class Outros {

    public static void main(String[] args) {
        Consumer action = System.out::println;
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 7.1);
        Aluno a3 = new Aluno("Gui", 7.1);
        Aluno a4 = new Aluno("Gabi", 10);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Luna", 7.1);
        Aluno a7 = new Aluno("Gui", 7.1);
        Aluno a8 = new Aluno("Gabi", 10);

        List<Aluno> alunos = List.of(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println(alunos.stream().count());
        alunos.stream().distinct()
                .skip(2).limit(2).forEach(action);

        alunos.stream().distinct().skip(2).takeWhile(a -> a.nota >= 7).forEach(action);
    }
}
