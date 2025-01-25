package Desafios;

import java.util.Scanner;

public class Esfera {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        double R = scanner.nextDouble();

        double resultado = (4 / 3.0) * pi * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", resultado);
    }
}
