import java.util.Scanner;

public class Exercicio013 {

    public static int fatorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        int fatorial = n;
        for (int i = n - 1; i > 1; i--) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = in.nextInt();
        in.close();

        System.out.printf("Fatorial de %d: %d%n", num, fatorial(num));
    }
}