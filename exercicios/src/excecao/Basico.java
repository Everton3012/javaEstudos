package excecao;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            ImprimirAluno(a1);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro!");
        }
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro!");
        }

        System.out.println("Fim!");
    }

    public static void ImprimirAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
