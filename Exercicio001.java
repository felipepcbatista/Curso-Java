import java.util.Scanner;

public class Exercicio001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        double num = in.nextDouble();

        double quadrado = Math.pow(num, 2);
        double raiz = Math.sqrt(quadrado);

        System.out.printf("Quadrado: %.2f%nRaiz quadrada: %.2f", quadrado, raiz);

        in.close();
    }
}