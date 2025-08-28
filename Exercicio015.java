import java.util.Scanner;

public class Exercicio015 {
    public static int contaVogais(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Digite uma string: ");
        String s = in.nextLine();
        in.close();

        int num_vogais = contaVogais(s);
        System.out.println("A string inserida contem " + num_vogais + " vogais.");
    }
}