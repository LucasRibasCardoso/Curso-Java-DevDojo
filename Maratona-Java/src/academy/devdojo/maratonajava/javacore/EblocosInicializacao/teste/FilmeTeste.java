package academy.devdojo.maratonajava.javacore.EblocosInicializacao.teste;

import academy.devdojo.maratonajava.javacore.EblocosInicializacao.dominio.Filme;

public class FilmeTeste {

    public static void main(String[] args) {

        Filme filme1 = new Filme("Rampage");
        Filme filme2 = new Filme("Mad Max");

        filme1.imprimeEpisodios();
        System.out.println();
        filme2.imprimeEpisodios();

    }
}
