package exe4;

abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    abstract double calcularValor();
}

class PagamentoCartaoCredito extends Pagamento {
    private static final double TAXA_CARTAO = 0.02;

    public PagamentoCartaoCredito(double valor) {
        super(valor);
    }

    @Override
    double calcularValor() {
        return valor + (valor * TAXA_CARTAO);
    }
}

class PagamentoBoleto extends Pagamento {
    private static final double TAXA_BOLETO = 0.01; // Taxa de 1% sobre o valor

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    double calcularValor() {
        return valor + (valor * TAXA_BOLETO);
    }
}

public class Exe4 {
    public static void main(String[] args) {

        Pagamento pagamentoCartaoCredito = new PagamentoCartaoCredito(1000.0);
        Pagamento pagamentoBoleto = new PagamentoBoleto(1000.0);

        System.out.println("Valor do pagamento com Cartão de Crédito: R$" + pagamentoCartaoCredito.calcularValor());
        System.out.println("Valor do pagamento com Boleto: R$" + pagamentoBoleto.calcularValor());
    }
}

