package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jõao");
        Professor professor2 = new Professor("Jorge");
        Professor professor3 = new Professor("Fernando");
        Professor[] professores = {professor1, professor2, professor3};

        // Instancia sem professores
        Escola escola1 = new Escola("Sesi");
        escola1.imprime();

        System.out.println("------------------");
        
        // Instancia com array de professores
        Escola escola2 = new Escola("IFSC", professores);
        escola2.imprime();
    }
}
