package academy.devdojo.maratonajava.javacore.ZZClambdas.dominio;

public class Filme {

    private String title;
    private int episodes;

    public Filme(String title, int quantiyt) {
        this.episodes = quantiyt;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "title='" + title + '\'' +
                ", quantiyt=" + episodes +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
