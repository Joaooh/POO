package exerciciosAula6;

import java.util.ArrayList;

public class exercicio5 {

	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList<String>();
		palavras.add("Bola");
		palavras.add("Gol");
		palavras.add("Bola");
		palavras.add("Campo");
		palavras.add("Bola");

		System.out.println(ocorrencias(palavras));
	}
	
	public static int ocorrencias(ArrayList<String> palavras) {
		int ocorreCount = 0;
		
		for (String palavra : palavras) {
			if (palavra.equals("Bola")) {
				ocorreCount++;
			}
		}
		
		return ocorreCount;
	}
}