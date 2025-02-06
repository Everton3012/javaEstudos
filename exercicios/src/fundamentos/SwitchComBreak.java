package fundamentos;

import java.util.Scanner;

public class SwitchComBreak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String conceito = "";
        System.out.print("Informe a nota: ");
        byte nota = scanner.nextByte();

        switch (nota) {
            case 10:
            case 9:
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
            case 0:
                conceito = "D";
                break;
            default:
                conceito = "Ivalido!";
        }

        System.out.printf("Conceito é %s", conceito);
        scanner.close();
    }

}
