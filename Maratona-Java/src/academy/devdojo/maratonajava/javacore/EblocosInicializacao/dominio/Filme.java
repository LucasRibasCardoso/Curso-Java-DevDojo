package academy.devdojo.maratonajava.javacore.EblocosInicializacao.dominio;

public class Filme {
    private String nome;
    private int[] episodios;

    /* Bloco de inicialização. É executado todos as vezes que a classe é inicializada
    pode ser utilizado para não precisar reptir código dentro dos contrutores */
    {
        episodios = new int[100];
        for (int i=0; i< episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    // Contrutores
    public Filme (String nome) {
        this.nome = nome;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    // métodos
    public void imprimeEpisodios () {
        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
    }

}
