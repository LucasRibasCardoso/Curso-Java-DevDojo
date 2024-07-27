package academy.devdojo.maratonajava.javacore.CsobreCargaMetodos.Testes;

import academy.devdojo.maratonajava.javacore.CsobreCargaMetodos.Dominio.Filme;

public class FilmeTeste01 {
    public static void main(String[] args) {

        Filme filme = new Filme();

        // inicializao um objeto Filme com atributos
        filme.init("Ação", 9, "MadMax");
        filme.imprime();
    }
}
