package exe5;

abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalario();

    public String getNome() {
        return nome;
    }
}

class Gerente extends Funcionario {
    private static final double BONUS = 1500.0;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    double calcularSalario() {
        return salarioBase + BONUS;
    }
}

class Programador extends Funcionario {
    private static final double BONUS = 800.0;

    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    double calcularSalario() {
        return salarioBase + BONUS;
    }
}

public class Exe5 {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Ana Silva", 5000.0);
        Funcionario programador = new Programador("Carlos Souza", 4000.0);

        System.out.println("Salário do Gerente " + gerente.getNome() + ": R$" + gerente.calcularSalario());
        System.out.println("Salário do Programador " + programador.getNome() + ": R$" + programador.calcularSalario());
    }
}


