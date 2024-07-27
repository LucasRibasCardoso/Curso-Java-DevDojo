package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.Teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.Dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.Dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.Dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.Dominio.Seminario;


public class Teste {
    public static void main(String[] args) {
        Local local = new Local("Rua 7 de Setembro");
        Aluno aluno1 = new Aluno("Lucas", 18);
        Professor professor1 = new Professor("Técnico", "João");
        Aluno[] alunosSeminario = {aluno1};

        Seminario seminario1 = new Seminario("Introdução a Sistemas de Informação", alunosSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario1};

        professor1.setSeminarios(seminariosDisponiveis);

        professor1.imprime();

    }
}
