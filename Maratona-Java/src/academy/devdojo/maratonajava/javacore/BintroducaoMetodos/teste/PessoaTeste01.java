package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Lucas");
        pessoa.setIdade(18);
        pessoa.setSalario(new double[]{1200, 1000, 2000});
        pessoa.imprimeSalarios();


    }
}
