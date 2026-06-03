public class start {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 3000.00);
        Funcionario funcionario2 = new Funcionario("Maria", 3500.00);
        System.out.println("Funcionário 1: " + funcionario1.getNome() + ", Salário: " + funcionario1.getSalario());
        System.out.println("Funcionário 2: " + funcionario2.getNome() + ", Salário: " + funcionario2.getSalario());
    }
}
