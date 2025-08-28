import java.util.Scanner;

public class Exercicio014 {
    public static double calculaMedia(int[] v) {
        int len = v.length;

        if (len == 0)
            return 0.0;

        double soma = 0.0;
        for (int i = 0; i < len; i++) {
            soma += v[i];
        }

        return soma / len;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor a ser preenchido: ");
        int len = in.nextInt();

        int vet[] = new int[len];
        System.out.println("Preencha o vetor a seguir:");

        for (int i = 0; i < len; i++) {
            System.out.printf("V[%d]: ", i);
            vet[i] = in.nextInt();
        }
        in.close();

        double media = calculaMedia(vet);
        System.out.printf("A media do vetor equivale a: %.2f", media);
    }
}