public class Funcionario {
    private static int nextId = 1;
    private int id;
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.id = nextId++;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
