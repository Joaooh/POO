package exercicio2;

public class Gato extends Animal {
    private String cor;

    @Override
    public String emitirSom() {
        return "miau";
    }

    @Override
    public String alimentar() {
        return "ração de gato";
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
