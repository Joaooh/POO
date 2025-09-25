package exerciciosAula6;

import java.util.ArrayList;

public class exercicio10 {

	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList<>();
		palavras.add("Pista");
		palavras.add("Lua");
		palavras.add("Arara");
		palavras.add("Justo");
		palavras.add("A base do teto desaba");
		
		System.out.println("Lista original: " + palavras);
		System.out.println("Lista invertida: " + inverso(palavras));
	}
	
	public static ArrayList<String> inverso(ArrayList<String> palavras) {
		ArrayList<String> inverso = new ArrayList<>();
		String espaco = "";
		
		for (String palavra : palavras) {
			
		    for (int i = 0, tamanho = palavra.length(); i < tamanho; i++) {
		        char letra = palavra.charAt(i);
		        espaco = letra + espaco;
		        
		        if (espaco.length() == palavra.length()) {
		        	inverso.add(espaco);
		        	espaco = "";
		        }
		        
		    }
		}
		
		return inverso;
	}

}
