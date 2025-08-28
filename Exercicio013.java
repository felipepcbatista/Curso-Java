import java.util.Scanner;

public class Exercicio013 {

    public static int fatorial(int n) {
        int fatorial = n;
        for (int i = n - 1; i > 0; i--) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = in.nextInt();
        in.close();

        System.out.printf("Fatorial de %d: %d", num, fatorial(num));
    }
}