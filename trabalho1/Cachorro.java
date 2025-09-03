package exercicio2;

public class Cachorro extends Animal {
    private String raca;

    @Override
    public String emitirSom() {
        return "latido";
    }

    @Override
    public String alimentar() {
        return "ração";
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
