package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;


public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "COMPRADOR{" +
                "Nome = " + nome+
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
