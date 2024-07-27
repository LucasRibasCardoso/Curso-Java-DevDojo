package academy.devdojo.maratonajava.javacore.Dconstrutores.Testes;

import academy.devdojo.maratonajava.javacore.Dconstrutores.Dominio.Filme;

public class FilmeTeste01 {
    public static void main(String[] args) {

        Filme filme1 = new Filme("TV", 9, "MadMax");
        Filme filme2 = new Filme();
        Filme filme3 = new Filme("TV", 5, "Tarzan", "Aventura");

        filme1.imprime();
        filme2.imprime();
        filme3.imprime();
    }
}
