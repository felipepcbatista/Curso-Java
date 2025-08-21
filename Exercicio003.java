import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a operação (ex: 10 + 5): ");
        double a = in.nextFloat();
        String op = in.next();
        double b = in.nextDouble();

        in.close();

        double resultado = 0;
        boolean valido = true;

        switch (op) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Erro: divisao por zero.");
                    valido = false;
                    break;
                }
                resultado = a / b;
                break;
            default:
                System.out.println("Operacao invalida.");
                valido = false;
        }

        if (valido) {
            System.out.printf("Resultado: %.2f%n", resultado);
        }
    }
}