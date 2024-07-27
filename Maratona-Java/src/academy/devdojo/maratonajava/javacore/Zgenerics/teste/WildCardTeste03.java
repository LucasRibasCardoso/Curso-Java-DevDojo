package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.serviço.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class WildCardTeste03 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(List.of(new Carro("Fiat"), new Carro("BMW")));
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

        RentavelService<Carro> rentavelServiceCarros = new RentavelService<>(carros);
        RentavelService<Barco> rentavelServiceBarcos = new RentavelService<>(barcos);

        Barco barco = rentavelServiceBarcos.buscarObjetoDisponivel();
        System.out.println("Utilizando barco por um mês...");
        rentavelServiceBarcos.retornarObjetoAlugado(barco);

        System.out.println("==============================================");

        Carro carro = rentavelServiceCarros.buscarObjetoDisponivel();
        System.out.println("Utilizando carro por mês...");
        rentavelServiceCarros.retornarObjetoAlugado(carro);
    }
}
