package arrays;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        double[] notas = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = (double) scanner.nextDouble();
        }

        double total = (double) 0;

        for (double nota : notas) {
            total += nota;
        }

        double media = (double) total / tamanho;

        System.out.printf("A média das notas é: %.2f%n", media
        );

        scanner.close();
    }
}
