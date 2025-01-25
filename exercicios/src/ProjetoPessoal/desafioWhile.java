package ProjetoPessoal;

import java.util.Scanner;

public class desafioWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Infome a nota (ou -1 p/ sair):");
            nota = scanner.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;
            } else if (nota != -1) {
                System.out.println("(Nota inválida !!!! ;D)");
            }
        }

        double media = total / quantidadeDeNotas;
        System.out.printf("Média = %.2f%n", media);
        scanner.close();

    }
}
