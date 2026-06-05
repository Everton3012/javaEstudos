package Classes_e_motodos.classe;

public class MembroDeInstacia {

    int a = 3;
    static int c = 4;

    public static void main(String[] args) {
        MembroDeInstacia b = new MembroDeInstacia();
        System.out.println(b.a);
        System.out.println(c);
    }
}
