package classe;

public class Data {

    int dia;
    String mes;
    int ano;

    String obterDataFormatada() {
        return String.format("%d %s %d", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.print(obterDataFormatada());
    }
}
