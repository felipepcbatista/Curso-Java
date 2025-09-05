import java.util.Scanner;

public class ContaBancaria {
    public String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }

        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }

        saldo -= valor;
    }

    double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Preencha os dados a seguir:");

        System.out.print("Titular: ");
        String titular = sc.nextLine();

        ContaBancaria conta = new ContaBancaria(titular);

        int opc;
        do {
            System.out.println("Bem-vindo! Selecione uma opcao:");
            System.out.printf("1- Depositar valor%n2- Sacar valor%n3- Consultar saldo%n4- Sair%n%nOpcao: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    break;

                case 3:
                    double saldo_atual = conta.getSaldo();
                    System.out.println("Saldo atual: R$ " + saldo_atual);
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        } while (opc != 4);

        sc.close();
    }
}
