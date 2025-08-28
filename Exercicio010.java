import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = in.nextLine();
        in.close();

        palavra = palavra.toLowerCase();

        int n = palavra.length();
        boolean palindromo = true;

        for (int i = 0; i < n / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(n - 1 - i)) {
                palindromo = false;
                break;
            }
        }

        System.out.println(palindromo ? "A palavra eh um palindromo." : "A palavra nao eh um palindromo.");

    }
}