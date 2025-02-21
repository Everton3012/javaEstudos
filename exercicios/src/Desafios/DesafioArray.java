package Desafios;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas: ");

        final int qtdeNotas = scanner.nextInt();

        double[] notas = new double[qtdeNotas];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("iforme a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        String todasAsNotas = Arrays.toString(notas);

        System.out.println(todasAsNotas);

        double media = (total / notas.length);
        System.out.printf("A média é %.2f", media);

        scanner.close();
    }
}
