package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {

        // Associação 1 para 1 (1 time recebe 1 jogador)
        Jogador jogador1 = new Jogador("Gabigol");
        Time time1 = new Time("Flamengo");

        jogador1.setTime(time1);

        jogador1.imprime();
    }
}
