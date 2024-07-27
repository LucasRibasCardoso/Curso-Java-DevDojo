package academy.devdojo.maratonajava.javacore.Hherença.teste;

import academy.devdojo.maratonajava.javacore.Hherença.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherença.dominio.Pessoa;


public class HerençaTeste01 {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Gustavo Ribas Cardoso");
        pessoa1.setIdade(12);
        pessoa1.setCpf("12039012312313");


        Funcionario funcionario1 = new Funcionario("Lucas Ribas Cardoso");
        funcionario1.setIdade(18);
        funcionario1.setCpf("07571927945");
        funcionario1.setSalario(950.00);

        pessoa1.imprime();
        System.out.println("-----------------");
        funcionario1.imprime();

    }
}
