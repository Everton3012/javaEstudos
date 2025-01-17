package ProjetoPessoal;

import java.util.Locale;
import java.util.Scanner;

public class PlanoDeDieta {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double n = 3.14159;

        double r = Math.pow(raio, 2);

        double X = n * r;

        System.out.printf("A=%.4f%n", X);

        scanner.close();
    }
}
