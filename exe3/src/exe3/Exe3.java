package exe3;

abstract class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    abstract void sacar(double valor);

    abstract void depositar(double valor);

    public double getSaldo() {
        return saldo;
    }
}

class ContaCorrente extends ContaBancaria {
    private static final double LIMITE_DESCUBERTO = 500.0;

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    void sacar(double valor) {
        if (valor <= saldo + LIMITE_DESCUBERTO) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor + ".");
        }
    }

    @Override
    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }
}

class ContaPoupanca extends ContaBancaria {
    private static final double TAXA_JUROS = 0.01;

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor + ".");
        }
    }

    @Override
    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void aplicarJuros() {
        saldo += saldo * TAXA_JUROS;
        System.out.println("Juros aplicados. Novo saldo: R$" + saldo);
    }
}

public class Exe3 {
    public static void main(String[] args) {

        ContaBancaria contaCorrente = new ContaCorrente(1000.0);
        ContaBancaria contaPoupanca = new ContaPoupanca(500.0);

        contaCorrente.depositar(200.0);
        contaCorrente.sacar(150.0);
        System.out.println("Saldo da Conta Corrente: R$" + contaCorrente.getSaldo());

        contaPoupanca.depositar(100.0);
        contaPoupanca.sacar(50.0);
        ((ContaPoupanca) contaPoupanca).aplicarJuros();
        System.out.println("Saldo da Conta Poupança: R$" + contaPoupanca.getSaldo());
    }
}

