package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapTeste02 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Lucas");
        Consumidor consumidor2 = new Consumidor("Gustavo");

        Filme filme1 = new Filme(2L, "Oppenheimer", 15.99);
        Filme filme2 = new Filme(3L, "Carros", 12.99);
        Filme filme3 = new Filme(1L, "Toy Story", 19.99);
        Filme filme4 = new Filme(4L, "Mercenarios", 19.99);

        Map<Consumidor, Filme> consumidorFilme = new HashMap<>();

        consumidorFilme.put(consumidor1, filme1);
        consumidorFilme.put(consumidor2, filme4);

        for (Map.Entry<Consumidor, Filme> entry : consumidorFilme.entrySet()) {
            System.out.println(entry.getKey().getNome() + " -> " + entry.getValue().getNome());
        }
    }
}
