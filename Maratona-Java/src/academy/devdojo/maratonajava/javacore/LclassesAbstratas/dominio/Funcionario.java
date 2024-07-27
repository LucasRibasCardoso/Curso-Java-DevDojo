package academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio;

public abstract class Funcionario extends Pessoa{
    // Uma classe abstratc serve como um template, é utilizado principalmente para fazer extend.

    protected String nome;
    protected double salario;

    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    // Método abstrado, só funciona em Classe abstrata
    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
