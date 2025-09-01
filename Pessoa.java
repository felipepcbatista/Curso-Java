import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Classe Pessoa:
// Atributos privados: nome e idade
// Construtor: inicializa atributos
// Apresentação(): Imprime atributos do objeto
public class Pessoa {

    // Declara atributos
    private String nome;
    private int idade;

    // Inicializa atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Imprime atributos
    public void apresentar() {
        System.out.println("Ola, meu nome e " + nome + " e tenho " + idade + " anos.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Inicializa Scanner
        List<Pessoa> pessoas = new ArrayList<>(); // Inicializa ArrayList de objetos Pessoa

        // Instancia 3 objetos Pessoa e armazena no ArrayList
        for (int i = 0; i < 3; i++) {
            System.out.println("PESSOA " + (i + 1) + ":");

            // Armazena nome do objeto
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            // Armazena idade do objeto
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); // Consome ENTER que sobrou

            // Inicializa objeto com nome e idade
            pessoas.add(new Pessoa(nome, idade));
        }

        sc.close(); // Fecha Scanner

        // Imprime pessoas registradas
        for (Pessoa p : pessoas) {
            p.apresentar();
        }
    }
}