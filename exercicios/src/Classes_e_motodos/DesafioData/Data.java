package Classes_e_motodos.DesafioData;

public class Data {

    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
