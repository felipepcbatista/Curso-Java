import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextDouble()) {
            double celsius = in.nextDouble();
            double fahrenheit = celsius * 1.8 + 32;
            System.out.printf("C=%.2f -> F=%.2f%n", celsius, fahrenheit);
        }

        in.close();
    }
}
