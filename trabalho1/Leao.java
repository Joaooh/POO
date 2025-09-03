package exercicio2;

public class Leao extends Animal {
    private double tamanhoJuba;

    @Override
    public String emitirSom() {
        return "rugido";
    }

    @Override
    public String alimentar() {
        return "carne";
    }

    public double getTamanhoJuba() {
        return tamanhoJuba;
    }

    public void setTamanhoJuba(double tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }
}
