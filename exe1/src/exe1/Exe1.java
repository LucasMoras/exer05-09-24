package exe1;

abstract class FormaGeometrica {
    
    abstract double calcularArea();
}

class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return largura * altura;
    }
}

class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }
}

public class Exe1 {
    public static void main(String[] args) {
        
        FormaGeometrica circulo = new Circulo(5.0);
        FormaGeometrica retangulo = new Retangulo(4.0, 6.0);
        FormaGeometrica triangulo = new Triangulo(3.0, 7.0);
        
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
    }
}

