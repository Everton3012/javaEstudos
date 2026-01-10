package Classes_e_motodos.DesafioData;

public class Data {

    int dia;
    int mes;
    int ano;

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
