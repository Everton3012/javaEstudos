package ProjetoPessoal;

import java.util.Locale;
import java.util.Scanner;

public class SalarioBonus {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();

        double bonus = vendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", salario + bonus, 3);

        scanner.close();

    }

}
