package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public abstract class Produto implements Taxavel{
    protected String nome;
    protected double valor;

    public Produto(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    // GETERS E SETERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
