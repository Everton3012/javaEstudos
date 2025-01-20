package ProjetoPessoal;

import java.util.Locale;
import java.util.Scanner;

public class GastoDeCombustivel {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int Time = scanner.nextInt();
        scanner.nextLine();
        int Velocity = scanner.nextInt();
        int KmL = 12;

        double result = (double) Velocity * Time / KmL;

        System.out.printf("%.3f%n", result);

        scanner.close();
    }
}
