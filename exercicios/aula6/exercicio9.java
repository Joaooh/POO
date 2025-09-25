package exerciciosAula6;

import java.util.ArrayList;

public class exercicio9 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(4);
		numeros.add(6);
		numeros.add(8);
		numeros.add(10);
		
		System.out.println(media(numeros));
	}
	
	public static float media(ArrayList<Integer> numeros) {
		float media = 0;
		int soma = 0;
		
		for (Integer numero : numeros) {
			soma += numero;
		}
		
		media = soma / numeros.size();
		
		return media;
	}
}
