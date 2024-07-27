package academy.devdojo.maratonajava.javacore.Dconstrutores.Dominio;

// Sobre carga de Construtores //
public class Filme {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    // Construtor (Define como o objeto vai ser criado)
    public Filme(String tipo, int episodios, String nome) {
        this.tipo = tipo;
        this.episodios = episodios;
        this.nome = nome;
    }

    public Filme () {
    }

    public Filme(String tipo, int episodios, String nome, String genero) {
        this(tipo, episodios, nome);
        this.genero = genero;
    }


    public void imprime () {
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
        System.out.println("==============");
    }

    public String getNome () {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo () {
        return this.tipo;
    }

    public void setTipo (String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios () {
        return this.episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }


}
