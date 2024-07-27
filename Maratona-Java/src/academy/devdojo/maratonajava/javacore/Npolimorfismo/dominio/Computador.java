package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto {
    private static final double IMPOSTO = 0.10;

    public Computador(double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO;
    }
}
