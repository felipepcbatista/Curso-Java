interface Pagamento {
    void processarPagamento(double valor);
}

class CartaoDeCredito implements Pagamento {
    private String numero_do_cartao;

    public CartaoDeCredito(String numero_do_cartao) {
        this.numero_do_cartao = numero_do_cartao;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " efetuado no cartao " + numero_do_cartao);
    }
}

class Boleto implements Pagamento {
    private String codigo_barra;

    public Boleto(String codigo_barra) {
        this.codigo_barra = codigo_barra;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " gerado com boleto. Codigo: " + codigo_barra);
    }
}

public class ExPagamento {
    public static void main(String[] args) {
        Pagamento p1 = new CartaoDeCredito("1234-5678-9012-3456");
        Pagamento p2 = new Boleto("83620000001 12345678901 12345678901 1 12340000010000");

        p1.processarPagamento(250.00);
        p2.processarPagamento(500.00);
    }
}
