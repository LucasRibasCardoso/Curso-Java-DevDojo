package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapTeste01 {
    public static void main(String[] args) {

        // Map utiliza o padrão <Key, Value>
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Lucas");
        map.put(2, "Gustavo");
        map.put(3, "Eduardo");

        // adiciona elemento se a chave não existir no map
        map.putIfAbsent(4, "Fernando");

        // Itera sobre as chaves do map
        for (Integer keyMap : map.keySet()) {
            System.out.println(keyMap + " -> " + map.get(keyMap));
        }

        System.out.println("--------------------------");

        // Itera sobre os valores do map
        for (String valueMap : map.values()) {
            System.out.println(valueMap);
        }

        System.out.println("--------------------------");

        // Uma maneira de pegar cada item do map com chave e valor junto
        for (Map.Entry<Integer, String> itenMap : map.entrySet()) {
            System.out.println(itenMap);
        }

        System.out.println("--------------------------");

        // LinkedHashMap mantem a ordem de inserção
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Lucas");
        linkedHashMap.put(1, "Gustavo");
        linkedHashMap.put(2, "Eduardo");

        for (Integer keyMap : linkedHashMap.keySet()) {
            System.out.println(keyMap + " -> " + map.get(keyMap));
        }
    }
}
