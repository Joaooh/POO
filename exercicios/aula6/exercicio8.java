package exerciciosAula6;

import java.util.ArrayList;

public class exercicio8 {

	public static void main(String[] args) {
		ArrayList<String> coisas = new ArrayList<>();
		coisas.add("Carro");
		coisas.add("Laranja");
		coisas.add("Computador");
		coisas.add("Gelo");
		coisas.add("Chave");
		coisas.add("Lápis");
		coisas.add("Roupa");
		
		System.out.println(ordenador(coisas));	
	}
	
	public static ArrayList<String> ordenador(ArrayList<String> coisas) {
		ArrayList<String> coisasOrdenadas = new ArrayList<>();
		
		char letra = 'C';
		
		for (int i = 0, tamanho = coisas.size(); i < tamanho; i++) {
			char primeiraLetraString = coisas.get(i).charAt(0); 
			
			if (primeiraLetraString == letra) {
				coisasOrdenadas.add(coisas.get(i));
			}
		}
		
		return coisasOrdenadas;
	}

}
