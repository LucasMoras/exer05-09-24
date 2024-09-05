package exe2;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {

    abstract void emitirSom();
    
    abstract void mover();
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O cachorro faz: Au Au!");
    }

    @Override
    void mover() {
        System.out.println("O cachorro está correndo.");
    }
}

class Gato extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O gato faz: Miau!");
    }

    @Override
    void mover() {
        System.out.println("O gato está se movendo suavemente.");
    }
}

class Passaro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O pássaro faz: Piu Piu!");
    }

    @Override
    void mover() {
        System.out.println("O pássaro está voando.");
    }
}

public class Exe2 {
    public static void main(String[] args) {

        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Passaro());
        
        for (Animal animal : animais) {
            animal.emitirSom();
            animal.mover();
            System.out.println();
        }
    }
}

