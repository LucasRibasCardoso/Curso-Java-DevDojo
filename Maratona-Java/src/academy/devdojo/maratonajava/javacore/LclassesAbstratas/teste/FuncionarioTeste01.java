package academy.devdojo.maratonajava.javacore.LclassesAbstratas.teste;

import academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        /*
        Tanto Gerente quanto Desenvolvedor são objetos que herderam o "template" de funcionario.
        Funcionario por ser uma classe abstrata, não pode ser iniciado um objeto Funcionario, essa classe apenas
        serviu como uma forma para as outras.
         */

        Gerente gerente = new Gerente("Jõao", 4500);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Lucas", 3400);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();

    }
}
