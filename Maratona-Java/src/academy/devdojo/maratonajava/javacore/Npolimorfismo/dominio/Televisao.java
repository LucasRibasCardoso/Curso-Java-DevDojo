package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto {
    private static final double IMPOSTO = 0.25;

    public Televisao(double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO;
    }
}
