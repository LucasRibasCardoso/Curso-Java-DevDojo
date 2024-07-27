package academy.devdojo.maratonajava.javacore.Hherença.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    // Construtor


    public Funcionario(String nome) {
        super(nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprime() {
        super.imprime();
        System.out.println("Eu " + this.nome + " recebi o salario de R$" + this.salario);
    }
}
