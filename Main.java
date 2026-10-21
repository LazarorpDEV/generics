import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // A lista aceita qualquer objeto que seja um Carro.
        List<Carro> carros = new ArrayList<>();

        carros.add(new Civic());
        carros.add(new Corolla());
        carros.add(new Onix());

        System.out.println("=== Lista de carros ===");

        for (Carro carro : carros) {
            carro.exibirInformacoes();
        }
    }
}

// Classe abstrata com as características comuns dos carros.
abstract class Carro {
    private final String marca;
    private final String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInformacoes() {
        System.out.println(marca + " - " + modelo);
        acelerar();
        System.out.println();
    }

    public abstract void acelerar();
}

// Cada classe concreta representa um tipo de carro.
class Civic extends Carro {
    public Civic() {
        super("Honda", "Civic");
    }

    @Override
    public void acelerar() {
        System.out.println("O Civic está acelerando.");
    }
}

class Corolla extends Carro {
    public Corolla() {
        super("Toyota", "Corolla");
    }

    @Override
    public void acelerar() {
        System.out.println("O Corolla está acelerando.");
    }
}

class Onix extends Carro {
    public Onix() {
        super("Chevrolet", "Onix");
    }

    @Override
    public void acelerar() {
        System.out.println("O Onix está acelerando.");
    }
}