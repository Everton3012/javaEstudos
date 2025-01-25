package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class area {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double PI = 3.14159;

        double TRIANGULO = (A * C) / 2;
        double CIRCULO = PI * Math.pow(C, 2);
        double TRAPEZIO = ((A + B) / 2) * C;
        double QUADRADO = Math.pow(B, 2);
        double RETANGULO = A * B;

        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);

        scanner.close();
    }
}
