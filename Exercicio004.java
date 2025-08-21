import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite idades (Enter vazio para encerrar):");

        while (true) {
            if (!in.hasNextLine())
                break;
            String linha = in.nextLine().trim();

            if (linha.isEmpty())
                break;

            try {
                int idade = Integer.parseInt(linha);
                if (idade < 0) {
                    System.out.println("Idade invalida.");
                    continue;
                }

                String categoria;

                if (idade <= 12)
                    categoria = "Crianca";
                else if (idade <= 17)
                    categoria = "Adolescente";
                else if (idade <= 59)
                    categoria = "Adulto";
                else
                    categoria = "Idoso";

                System.out.println("Idade: " + idade + " -> Categoria: " + categoria);
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida: digite um inteiro.");
            }
        }

        in.close();
    }
}