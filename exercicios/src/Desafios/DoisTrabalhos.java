package Desafios;

import java.util.Scanner;

public class DoisTrabalhos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("O primeiro trabalho foi confirmado ? ");
        String primeiroTrabalho = entrada.next();

        System.out.print("O segundo trabalho foi confirmado ? ");
        String segundoTrabalho = entrada.next();

        if (primeiroTrabalho.equals("sim".trim()) && segundoTrabalho.equals("sim".trim())) {
            System.out.println("Compraremos a televisão de 50 polegadas e comeremos sorvete");
        } else if (primeiroTrabalho.equals("nao".trim()) && segundoTrabalho.equals("nao".trim())) {
            System.out.println("Ficaremos em casa");
        } else {
            System.out.println("Compraremos a televisão de 32 polegadas e comeremos sorvete");
        }

        entrada.close();
    }
}
