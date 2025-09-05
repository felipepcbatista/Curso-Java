interface Tributavel {
    double calcularImposto();
}

class Produto implements Tributavel {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return preco * 0.10;
    }

    public String getNome() {
        return nome;
    }
}

class Servico implements Tributavel {
    private String descricao;
    private double valor;

    public Servico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return valor * 0.15;
    }

    public String getDescricao() {
        return descricao;
    }
}

public class ExTributavel {
    public static void main(String[] args) {
        java.util.List<Tributavel> tributos = new java.util.ArrayList<>();

        tributos.add(new Produto("Notebook", 3000.0));
        tributos.add(new Produto("Celular", 1500.0));

        tributos.add(new Servico("Consultoria em TI", 800.0));
        tributos.add(new Servico("Manutencao em computador", 200.0));

        double total_impostos = 0.0;

        for (Tributavel t : tributos) {
            double imposto = t.calcularImposto();
            total_impostos += imposto;
            System.out.println("Imposto calculado: R$ " + imposto);
        }

        System.out.println("Imposto total: R$ " + total_impostos);
    }
}