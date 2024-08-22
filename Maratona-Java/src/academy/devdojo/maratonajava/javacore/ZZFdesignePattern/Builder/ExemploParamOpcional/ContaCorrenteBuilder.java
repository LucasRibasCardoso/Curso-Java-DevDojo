package academy.devdojo.maratonajava.javacore.ZZFdesignePattern.Builder.ExemploParamOpcional;

/**
 * Suponha que você tenha uma classe ContaCorrente que representa contas correntes do fictício AluraBank!
 * E que ao criar uma conta, podemos fazê-lo apenas com o número da nova conta ou, opcionalmente informando
 * também o saldo inicial da conta.
 *
 * Normalmente criaríamos vários construtores correspondendo a cada parâmetro opcional. Uma maneira de resolver
 * isso é utilizando o pattern builder, que permite que possamos criar o mesmo objeto de várias maneiras diferentes
 * sem precisar criar vários construtores.
 */

public class ContaCorrenteBuilder {

    private String nomeTitular;
    private int numeroConta;
    private int numeroAgencia;
    private double saldo;


    public ContaCorrenteBuilder addNomeTitular (String nome) {
        this.nomeTitular = nome;
        return this;
    }

    public ContaCorrenteBuilder addNumeroConta(int numero) {
        this.numeroConta = numero;
        return this;
    }

    public ContaCorrenteBuilder addNumeroAgencia(int numero) {
        this.numeroAgencia = numero;
        return this;
    }

    public ContaCorrenteBuilder addSaldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    public ContaCorrenteBuilder build() {
        return new ContaCorrenteBuilder();
    }

    @Override
    public String toString() {
        return "ContaCorrenteBuilder{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", numeroConta=" + numeroConta +
                ", numeroAgencia=" + numeroAgencia +
                ", saldo=" + saldo +
                '}';
    }
}
