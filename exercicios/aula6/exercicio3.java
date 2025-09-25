package exerciciosAula6;

import java.util.ArrayList;

public class exercicio3 {

    public static void main(String[] args) {
        ArrayList<Integer> elementos1 = new ArrayList<>();
        elementos1.add(4);
        elementos1.add(4);
        elementos1.add(18);
        elementos1.add(18);
        elementos1.add(30);
        elementos1.add(35);

        ArrayList<Integer> elementos2 = new ArrayList<>();
        elementos2.add(2);
        elementos2.add(2);
        elementos2.add(9);
        elementos2.add(9);
        elementos2.add(15);
        elementos2.add(17);

        ArrayList<Integer> exclusivos = elementosExclusivos(elementos1, elementos2);
        System.out.println(exclusivos);
    }

    public static ArrayList<Integer> elementosExclusivos(ArrayList<Integer> elementos1, ArrayList<Integer> elementos2) {
        ArrayList<Integer> resultado = new ArrayList<>();

        for (Integer n1 : elementos1) {
            if (!elementos2.contains(n1) && !resultado.contains(n1)) {
                resultado.add(n1);
            }
        }

        for (Integer n2 : elementos2) {
            if (!elementos1.contains(n2) && !resultado.contains(n2)) {
                resultado.add(n2);
            }
        }

        return resultado;
    }
}
