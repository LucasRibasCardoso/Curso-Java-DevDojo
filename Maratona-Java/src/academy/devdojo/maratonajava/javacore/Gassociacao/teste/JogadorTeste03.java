package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {

        // Associacao bidirecional
        Jogador jogador1 = new Jogador("Gabigol");
        Jogador jogador2 = new Jogador("Wesley");
        Jogador jogador3 = new Jogador("Léo Pereira");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        Time time1 = new Time("Flamengo", jogadores);

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        jogador3.setTime(time1);
        time1.setJogadores(jogadores);

        System.out.println("-------Time---------");
        time1.imprime();

        for(int i=0; i< jogadores.length; i++ ) {
            System.out.println("---------Instacia do jogador [" + i + "]---------" );
            jogadores[i].imprime();
        }
    }
}
