package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

/* final  em classes -> nao permite a classe ser estendida
 public final class Carro */

public class Carro {
    private String nome;
    public static final int VELOCIDADE_LIMITE = 250; // final -> define constantes
    public final Comprador COMPRADOR = new Comprador();

    // final em método -> nao permite ser sobescrito
    public final void imprime() {
        System.out.println("Nome: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
