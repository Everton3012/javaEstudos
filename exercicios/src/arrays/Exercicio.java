package arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        String notas = Arrays.toString(notasAlunoA);

        System.out.println(notas);

        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }

        double media = (double) total / notasAlunoA.length;
        System.out.println(media);

        if (media >= 7) {
            System.out.println("Aluno A: Aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno A: Recuperação");
        } else {
            System.out.println("Aluno A: Reprovado");
        }

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
        String notasB = Arrays.toString(notasAlunoB);
        System.out.println(notasB);

        double totalB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalB += notasAlunoB[i];
        }
        double mediaB = (double) totalB / notasAlunoB.length;
        System.out.println(mediaB);

        if (mediaB >= 7) {
            System.out.println("Aluno B: Aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno B: Recuperação");
        } else {
            System.out.println("Aluno B: Reprovado");
        }

    }
}
