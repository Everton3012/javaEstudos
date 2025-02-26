package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Everton");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("David");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("web 2025");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        curso3.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno3);

        for (Aluno aluno : curso1.alunos) {
            System.out.printf("Estou matriculado no curso : %s ... ", curso3.nome);
            System.out.printf("e o meu nome é %s%n", aluno.nome);
        }

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");

        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
