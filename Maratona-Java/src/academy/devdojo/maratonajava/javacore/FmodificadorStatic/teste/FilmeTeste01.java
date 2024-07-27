package academy.devdojo.maratonajava.javacore.FmodificadorStatic.teste;


import academy.devdojo.maratonajava.javacore.FmodificadorStatic.dominio.Filme;

public class FilmeTeste01 {
    public static void main(String[] args) {
        Filme filme1 = new Filme("RAMPAGE");
        Filme filme2 = new Filme("JUMANJI");
        Filme filme3 = new Filme("VELOZES E FURIOSOS");

        // Bloco de init não estatico é executado toda vez que uma nova instancia da classe é inicializado. Nesse caso 3

        // Bloco de init estático é executado uma unica vez para todas as instancias da classe, isso poupa processamento

    }
}
