package Classes_e_motodos.DesafioData;

public class DataTeste {

    public static void main(String[] args) {
        Data data = new Data();
        data.dia = 30;
        data.mes = 12;
        data.ano = 2000;
        Data data2 = new Data();

        System.out.println(data.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());
    }
}
