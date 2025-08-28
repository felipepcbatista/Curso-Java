import java.util.Scanner;

public class Exercicio009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();
        in.close();

        int count = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'A')
                count++;
        }

        System.out.println("A letra 'a' aparece " + count + " vezes na frase.");
    }
}