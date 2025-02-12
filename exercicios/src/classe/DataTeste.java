package classe;

public class DataTeste {

    public static void main(String[] args) {
        Data data = new Data();

        int dia = data.dia = 30;
        String mes = data.mes = "Dezembro";
        int ano = data.ano = 2000;

        System.out.printf("%d %s %d", dia, mes, ano);
    }
}
