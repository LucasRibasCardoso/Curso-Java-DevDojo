package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {

        // Lista não tipada
        List nomes1 = new ArrayList<>(10); // até a versão 1.4
        nomes1.add("Lucas");
        nomes1.add("Gustavo");
        nomes1.add(123123);

        for (Object nome1 : nomes1) {
            System.out.println(nome1);
        }

        System.out.println("-------------------------");

        // Lista tipada
        List<String> nomes2 = new ArrayList<>(10);
        nomes2.add("Lucas");
        nomes2.add("Gustavo");
        // nomes2.add(123123); só aceita string

        for (int i = 0; i < nomes2.size(); i++) {
            System.out.println(nomes2.get(i).replace("u", "*"));
        }

        System.out.println("-------------------------");

        // Listas não aceitam tipos primitivos
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("-------------------------");

        // Juntando listas
        nomes1.addAll(nomes2);
        System.out.println(nomes1);
    }
}
