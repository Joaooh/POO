package exerciciosAula6;

import java.util.ArrayList;

public class exercicio4 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(2);
		numeros.add(4);
		numeros.add(8);
		numeros.add(1);
		
		System.out.println(menor(numeros));
	}
	
	public static int menor(ArrayList<Integer> numeros) {
		int menor = numeros.get(0);
		int indiceMenor = 0;
		
		for (int i = 1, size = numeros.size(); i < size; i++) {
			if (numeros.get(i) < menor) {
				menor = numeros.get(i);
				indiceMenor = i;
			}
		}
		return indiceMenor;
	}
}