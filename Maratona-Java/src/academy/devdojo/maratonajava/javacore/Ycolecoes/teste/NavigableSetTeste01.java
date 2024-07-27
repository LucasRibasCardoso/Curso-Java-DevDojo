package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Filme;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

// Classe que implementa o Comparator para comparar objetos Smartphone pelo atributo 'marca'
class smartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        // Verifica se ambos os atributos 'marca' são nulos
        if (o1.getMarca() == null && o2.getMarca() == null) {
            return 0;
        }
        // Se o 'marca' do primeiro smartphone for nulo, ele é considerado menor
        if (o1.getMarca() == null) {
            return -1;
        }
        // Se o 'marca' do segundo smartphone for nulo, ele é considerado menor
        if (o2.getMarca() == null) {
            return 1;
        }
        // Compara as marcas dos smartphones lexicograficamente
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTeste01 {
    public static void main(String[] args) {

        // Cria um TreeSet de smartphones com o comparador de marca personalizado
        NavigableSet<Smartphone> setSmartphones = new TreeSet<>(new smartphoneMarcaComparator());
        // Adiciona um smartphone ao TreeSet
        Smartphone smartphone1 = new Smartphone("123", "Nokia");
        Smartphone smartphone2 = new Smartphone("213", "Apple");
        Smartphone smartphone3 = new Smartphone("533", "Motorola");
        setSmartphones.add(smartphone1);
        setSmartphones.add(smartphone2);
        setSmartphones.add(smartphone3);

        for (Smartphone setSmartphone : setSmartphones) {
            System.out.println(setSmartphone);
        }

        System.out.println("-------------------------------------------------------------------");

        // Cria um TreeSet de filmes, que usará a ordenação do compareTo definida na classe Filme (ID)
        NavigableSet<Filme> setFilmes = new TreeSet<>();
        setFilmes.add(new Filme(2L, "Oppenheimer", 15.99, 2));
        setFilmes.add(new Filme(3L, "Carros", 12.99, 0));
        setFilmes.add(new Filme(1L, "Toy Story", 19.99, 8));
        setFilmes.add(new Filme(4L, "Mercenarios", 19.99, 0));
        setFilmes.add(new Filme(5L, "Hobbit", 29.99, 10));
        // Tentativa de adicionar um filme duplicado (não será adicionado, pois TreeSet não permite duplicatas)
        setFilmes.add(new Filme(5L, "Hobbit", 29.99, 10));

        // Imprime os filmes ordenados no TreeSet
        for (Filme setFilme : setFilmes) {
            System.out.println(setFilme);
        }

    }
}

/*
 * TreeSet é uma implementação da interface NavigableSet, baseada em uma árvore Red-Black (uma forma de árvore binária
 * de busca auto-balanceada). Ele garante que os elementos armazenados estejam sempre ordenados de acordo com sua ordem
 * natural (implementação de Comparable) ou um Comparator fornecido. TreeSet não permite elementos duplicados.
 *
 * É muito útil em várias situações onde a ordenação dos elementos e a não duplicação são necessárias.
 */
