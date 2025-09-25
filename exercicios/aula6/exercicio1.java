package exerciciosAula6;

import java.util.ArrayList;

public class exercicio1 {

	public static void main(String[] args) {
		ArrayList<String> elementos = new ArrayList<String>();
		elementos.add("Carro");
		elementos.add("Moto");
		elementos.add("Caminhão");
		
		System.out.println(elementos.size());
		System.out.println(elementos.contains("Bicicleta"));
	}

}