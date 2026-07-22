package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pedro");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("João");

        Curso c1 = new Curso("Java");
        Curso c2 = new Curso("Python");
        Curso c3 = new Curso("JavaScript");

        c1.adicionarAluno(a1);
        c1.adicionarAluno(a2);

        c2.adicionarAluno(a1);

        c3.adicionarAluno(a1);
        c3.adicionarAluno(a2);
        c3.adicionarAluno(a3);

        for (Aluno aluno : c1.alunos) {
            System.out.println("Aluno do curso " + c1.nome + ": " + aluno.nome);
        }

        System.out.println("\n<--------------------->\n");
        for (Aluno aluno : c2.alunos) {
            System.out.println("Aluno do curso " + c2.nome + ": " + aluno.nome);
        }

        System.out.println("\n<--------------------->\n");
        for (Aluno aluno : c3.alunos) {
            System.out.println("Aluno do curso " + c3.nome + ": " + aluno.nome);
        }

        System.out.println("\n<--------------------->\n");
        for (Curso curso : a1.cursos) {
            System.out.println("Curso do aluno " + a1.nome + ": " + curso.nome);
        }

        System.out.println("\n<--------------------->\n");
        for (Curso curso : a2.cursos) {
            System.out.println("Curso do aluno " + a2.nome + ": " + curso.nome);
        }

        System.out.println("\n<--------------------->\n");
        for (Curso curso : a3.cursos) {
            System.out.println("Curso do aluno " + a3.nome + ": " + curso.nome);
        }

    }
}
