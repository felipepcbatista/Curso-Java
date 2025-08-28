import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();
        in.close();

        String[] palavras = frase.split("[\\s,.;]+");
        int num_palavras = palavras.length;

        System.out.println("Frase invertida:");
        for (int i = num_palavras - 1; i >= 0; i--) {
            System.out.print(palavras[i]);
            if (i > 0)
                System.out.print(" ");
        }

        System.out.println();
    }
}