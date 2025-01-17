package ProjetoPessoal;

import java.util.Locale;
import java.util.Scanner;

public class Caixa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int peca1 = scanner.nextInt();
        int quantity1 = scanner.nextInt();
        double price1 = scanner.nextDouble();

        double valor1 = (double) quantity1 * price1;

        int peca2 = scanner.nextInt();
        int quantity2 = scanner.nextInt();
        double price2 = scanner.nextDouble();

        double valor2 = (double) quantity2 * price2;

        double valorFinal = (double) valor1 + valor2;

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorFinal));

        scanner.close();
    }
}
