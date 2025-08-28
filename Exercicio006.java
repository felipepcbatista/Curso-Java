import java.util.Scanner;

public class Exercicio006{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor: ");
        int n = in.nextInt();

        int[] vetor = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int soma = 0;
        int qtdPares = 0, qtdImpares = 0, qtdZeros = 0;
        int indexFirstMax = -1;

        for (int i=0; i<n; i++){
            vetor[i] = in.nextInt();
            int x = vetor[i];

            soma += x;

            if (x > max){
                max = x;
                indexFirstMax = i;
            } 
            if (x < min) min = x;
            if (x == 0) qtdZeros++;
            else if (x % 2 == 0) qtdPares++;
            else qtdImpares++;
        }

        in.close();

        System.out.printf("Max = %d%n", max);
        System.out.printf("Min = %d%n", min);
        System.out.printf("Soma = %d%n", soma);
        System.out.printf("Media = %.2f%n", soma*1.00/n);
        System.out.printf("Pares = %d%n", qtdPares);
        System.out.printf("Impares = %d%n", qtdImpares);
        System.out.printf("Zeros = %d%n", qtdZeros);
        System.out.printf("Indice do primeiro max = %d%n", indexFirstMax);
    }
}