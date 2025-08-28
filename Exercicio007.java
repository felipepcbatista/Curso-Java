import java.util.Scanner;

public class Exercicio007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tam = in.nextInt();
        int v[] = new int[tam];

        System.out.println("Preencha o vetor a seguir:");
        for (int i = 0; i < tam; i++) {
            System.out.printf("Vetor[%d]: ", i);
            v[i] = in.nextInt();
        }

        System.out.print("Digite o numero a ser removido do vetor: ");
        int x = in.nextInt();
        in.close();

        int idx = -1;
        for (int i = 0; i < tam; i++) {
            if (v[i] == x) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            for (int i = idx; i < tam - 1; i++) {
                v[i] = v[i + 1];
            }
            tam--;
        }

        System.out.printf("Novo tamanho do vetor: %d%n", tam);
        System.out.print("Vetor resultante: ");
        for (int i = 0; i < tam; i++) {
            System.out.printf("%d ", v[i]);
        }
    }
}