package Desafios;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um numero:");
        String valor = entrada.next().replace(",", ".");

        int numero = (int) Double.parseDouble(valor);
        int resultado = numero % 2;

        if (resultado != 1) {
            System.out.println("o numero "
                    + numero + " é par");
        } else {
            System.out.println("o numero " + numero + " é impar");
        }

        entrada.close();
    }
}
