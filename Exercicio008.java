import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = in.nextInt();
            }
            System.out.println();
        }

        in.close();

        int[] diag_primaria = new int[3];
        int[] diag_secundaria = new int[3];

        boolean simetrica = true, identidade = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diag_primaria[i] = matriz[i][j];
                    if (diag_primaria[i] != 1 && matriz[i + 1][j + 1] != 0) {
                        identidade = false;
                    }
                }

                if (i + j == 2) {
                    diag_secundaria[i] = matriz[i][j];
                }

                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
            }
        }

        System.out.println("Diagonais primaria e secundaria, respectivamente:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ", diag_primaria[i]);
            System.out.printf("%d ", diag_secundaria[i]);
        }

        if (!simetrica) {
            System.out.println("A matriz digitada nao eh simetrica.");
        } else
            System.out.println("A matriz digitada eh simetrica.");

        if (!identidade) {
            System.out.println("A matriz digitada nao eh identidade.");
        } else
            System.out.println("A matriz digitada eh identidade.");
    }
}