package exerciciosAula6;

import java.util.ArrayList;

public class exercicio6 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		
		System.out.println(impares(numeros));
		
	}
		
		public static ArrayList<Integer> impares(ArrayList<Integer> numeros) {
			ArrayList<Integer> resultado = new ArrayList<>();
			for (Integer numero : numeros) {
				if (numero % 2 != 0) {
					resultado.add(numero);
				}
			}
			
			return resultado;
	}
}
