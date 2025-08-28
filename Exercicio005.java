import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe um numero e veja a sua tabuada de 1 a 10: ");
        int num = in.nextInt();

        in.close();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %03d%n", num, i, num * i);
        }
    }
}