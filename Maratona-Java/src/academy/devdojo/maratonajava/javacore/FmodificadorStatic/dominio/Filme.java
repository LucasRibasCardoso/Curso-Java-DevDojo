package academy.devdojo.maratonajava.javacore.FmodificadorStatic.dominio;

public class Filme {
    private String nome;
    private static int[] episodios;

    // BLOCOS DE INICIALIZAÇÃO STATICO é executado uma unica vez pela JVM
    static {
        System.out.println("BLOCO DE INIT STATICO 01");
        episodios = new int[100];
        for (int i=0; i< episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("BLOCO DE INIT STATICO 02");
    }

    static {
        System.out.println("BLOCO DE INIT STATICO 03");
    }


    {
        System.out.println("BLOCO DE INIT NÃO ESTATICO");
    }


    // Contrutores
    public Filme(String nome) {
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
