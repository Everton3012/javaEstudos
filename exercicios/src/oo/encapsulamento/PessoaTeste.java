package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(30);
        System.out.println(p1.getIdade());
        p1.setIdade(-20);
        System.out.println(p1.getIdade());
    }
}
