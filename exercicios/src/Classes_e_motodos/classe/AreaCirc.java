package Classes_e_motodos.classe;

public class AreaCirc {

    double raio;
    static final double PI = Math.PI;

    AreaCirc(double raioInicial) {
        raio = raioInicial;

    }

    double area() {
        return PI * raio * raio;
    }
}
