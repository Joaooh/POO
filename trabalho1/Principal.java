package exercicio2;

import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.setNome("Bolt");
        c1.setIdade(2);
        c1.setPeso(28.5);
        c1.setHabitat("Setor 1");
        c1.setRaca("Pastor branco");

        Gato g1 = new Gato();
        g1.setNome("Tom");
        g1.setIdade(4);
        g1.setPeso(4.2);
        g1.setHabitat("Setor 2");
        g1.setCor("Cinza");

        Leao l1 = new Leao();
        l1.setNome("Simba");
        l1.setIdade(6);
        l1.setPeso(190.4);
        l1.setHabitat("Setor 3");
        l1.setTamanhoJuba(24.0);

        List<Animal> animais = Arrays.asList(c1, g1, l1);

        for (Animal a : animais) {
            System.out.printf("- %s -%nNome: %s %nSom: %s %nCome: %s %n%n",
                a.getClass().getSimpleName(),
                a.getNome(),
                a.emitirSom(),
                a.alimentar()
            );
        }
    }
}
