package exerciciosAula6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class exercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> elementos = new ArrayList<Integer>();
		elementos.add(12);
		elementos.add(12);
		elementos.add(12);
		elementos.add(24);
		elementos.add(24);
		elementos.add(40);
		elementos.add(58);
		
		System.out.println(hashUnicos(elementos));
	}
		
	public static int hashUnicos(ArrayList<Integer> elementos) {
		Set<Integer> unicos = new HashSet<>(elementos);
		return unicos.size();
	}
}


// Solução alternativa:
//public static Integer retornarNumerOelementos(ArrayList<Integer> numeros) {
//	ArrayList<Integer> unicos = new ArrayList<Integer>();
//	
//	for (Integer numero : numeros) {
//		if (!unicos.contains(numero)) {
//			unicos.add(numero);
//		}
//	}
//	return unicos.size();
//}