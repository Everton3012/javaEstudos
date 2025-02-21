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

        System.out.println(total / notasAlunoA.length);

    }
}
