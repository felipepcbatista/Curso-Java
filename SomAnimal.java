class Animais {

    public void emitirSom() {
        System.out.println("Animal emitindo som");
    }
}

class Cachorro extends Animais {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

class Gato extends Animais {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

class Ovelha extends Animais {
    @Override
    public void emitirSom() {
        System.out.println("Beeeeh!");
    }
}

public class SomAnimal {
    public static void main(String[] args) {
        java.util.List<Animais> animais = new java.util.ArrayList<>();

        animais.add(new Gato());
        animais.add(new Cachorro());
        animais.add(new Ovelha());

        for (Animais a : animais) {
            a.emitirSom();
        }
    }
}
