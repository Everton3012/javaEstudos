package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class salario {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int horas = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        double salario = horas * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));

        scanner.close();
    }
}
