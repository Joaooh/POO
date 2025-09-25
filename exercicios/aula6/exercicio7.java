package exerciciosAula6;

import java.util.ArrayList;
import java.util.Collections;

public class exercicio7 {
	public static void main(String[] args) {	
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Alice", 26));
		pessoas.add(new Pessoa("Bob", 34));
		pessoas.add(new Pessoa("Carlos", 25));
		pessoas.add(new Pessoa("Daniel", 22));
		pessoas.add(new Pessoa("Eduardo", 41));
		pessoas.add(new Pessoa("Fernando", 34));
		
		ordenar(pessoas);
	}
	
	public static void ordenar(ArrayList<Pessoa> pessoas) {
		Collections.sort(pessoas);
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
	}

}

class Pessoa implements Comparable<Pessoa> {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa other) {
        // Ordena por idade em ordem crescente
        return Integer.compare(this.idade, other.idade);
    }

    @Override
    public String toString() {
        return "\"" + nome + '\"' + " / " + idade;
    }
}