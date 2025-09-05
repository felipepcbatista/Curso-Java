abstract class Funcionario {
    protected String nome;
    protected double salario_base;

    public Funcionario(String nome, double salario_base) {
        this.nome = nome;
        this.salario_base = salario_base;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }
}

class Gerente extends Funcionario {

    public Gerente(String nome, double salario_base) {
        super(nome, salario_base);
    }

    @Override
    public double calcularSalario() {
        return salario_base * 1.2;
    }
}

class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salario_base, double comissao) {
        super(nome, salario_base);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salario_base + comissao;
    }
}

public class TesteFuncionarios {
    public static void main(String[] args) {

        Funcionario f1 = new Gerente("Felipe Paz", 20000);
        Funcionario f2 = new Vendedor("Dexter Morgan", 5000, 1200);
        Funcionario f3 = new Vendedor("Debra Morgan", 3000, 800);

        Funcionario[] funcionarios = { f1, f2, f3 };

        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + " - Salario: R$ " + f.calcularSalario());
        }
    }
}
