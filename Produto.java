import java.util.Scanner;

// Classe Produto:
// Atributos privados: nome, preço, produto
// Construtor: chama métodos setters
// calcularValorTotal(): calcula preço x quantidade
// Setters: inicializa atributos privados
public class Produto {
    private String nome;
    private double preco;
    private int qtd;

    // Construtor: chama setters passando parâmetros recebidos
    public Produto(String nome, double preco, int qtd) {
        setNome(nome);
        setPreco(preco);
        setQtd(qtd);
    }

    // Retorna preço x quantidade
    public double calcularValorTotal() {
        return preco * qtd;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    // MAIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Inicializa scanner

        System.out.println("Preencha os dados a seguir:");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preco: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        int qtd = sc.nextInt();

        sc.close();
        Produto p = new Produto(nome, preco, qtd);

        double valor_total = p.calcularValorTotal();
        System.out.println("Valor total: " + valor_total);
    }
}
