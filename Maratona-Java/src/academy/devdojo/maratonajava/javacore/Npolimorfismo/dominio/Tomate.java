package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    private static final double IMPOSTO = 0.06;
    private String dataValidade;

    public Tomate(double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
