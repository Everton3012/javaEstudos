package classe;

public class Data {

    int dia = 01;
    String mes = "janeiro";
    int ano = 1970;

    Data() {

    }

    Data(int dia, String mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        return String.format("%d %s %d", this.dia, this.mes, this.ano);
    }

    void imprimirDataFormatada() {
        System.out.print(obterDataFormatada());
    }
}
