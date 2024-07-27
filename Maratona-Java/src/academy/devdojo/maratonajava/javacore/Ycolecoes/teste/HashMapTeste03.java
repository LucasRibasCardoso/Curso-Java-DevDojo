package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTeste03 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Lucas");
        Consumidor consumidor2 = new Consumidor("Gustavo");

        Filme filme1 = new Filme(2L, "Oppenheimer", 15.99);
        Filme filme2 = new Filme(3L, "Carros", 12.99);
        Filme filme3 = new Filme(1L, "Toy Story", 19.99);
        Filme filme4 = new Filme(4L, "Mercenarios", 19.99);

        List<Filme> listFilmeConsumidor1 = List.of(filme1, filme2);
        List<Filme> listFilmeConsumidor2 = List.of(filme3, filme4);

        Map<Consumidor, List<Filme>> mapConsumidorFilme = new HashMap<>();

        mapConsumidorFilme.put(consumidor1, listFilmeConsumidor1);
        mapConsumidorFilme.put(consumidor2, listFilmeConsumidor2);

        for (Map.Entry<Consumidor, List<Filme>> entry : mapConsumidorFilme.entrySet()) {

            String consumidor = entry.getKey().getNome();
             System.out.println("Consumidor: " + consumidor);

            int tamanhoListaFilmes = entry.getValue().size();
            for (int i = 0; i < tamanhoListaFilmes; i ++) {

                String filme = entry.getValue().get(i).getNome();
                System.out.println("Filme ["+i+"] -> " + filme);
            }
            System.out.println(); // pular linha
        }


    }
}
