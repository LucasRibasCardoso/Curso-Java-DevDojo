package academy.devdojo.maratonajava.javacore.CsobreCargaMetodos.Dominio;

// Sobre carga de métodos //
public class Filme {

    private String nome;
    private String tipo;
    private int episodios;


    // método de inicializacao de variaveis
    public void init (String tipo, int episodios) {
        this.tipo = tipo;
        this.episodios = episodios;
    }

    /* Caso seja necessario declarar um novo atributo, por exemplo NOME, podemos reutilizar
    o metodo de inicializacao das variaveis */
    public void init (String tipo, int episodios, String nome) {
        this.init(tipo, episodios);
        this.nome = nome;
    }


    public void imprime () {
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
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
