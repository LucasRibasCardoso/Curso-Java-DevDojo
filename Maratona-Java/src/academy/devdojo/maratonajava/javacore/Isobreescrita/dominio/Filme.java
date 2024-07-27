package academy.devdojo.maratonajava.javacore.Isobreescrita.dominio;

public class Filme {
    private String nome;
    private String genero;

    // Sobrescrevendo metodo ToString
    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    // Contrutores
    public Filme (String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
