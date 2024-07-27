package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTeste01 {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("A", "Letra A");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("D", "Letra D");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Imprime até a chave D
        System.out.println(map.headMap("D"));

        /*
        O NavigableMap em Java é uma extensão da interface SortedMap que oferece métodos de navegação e busca
        adicionalmente às funcionalidades de ordenação. Ele é útil em situações onde você precisa não apenas acessar
        elementos de um mapa em ordem, mas também realizar operações específicas de navegação, como encontrar o maior
        ou menor elemento, ou buscar elementos em relação a um dado valor.
         */
    }
}
