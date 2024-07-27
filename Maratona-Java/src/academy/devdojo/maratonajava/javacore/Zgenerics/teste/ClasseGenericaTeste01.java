package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.serviço.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.serviço.CarroRentavelService;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();

        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mês...");

        carroRentavelService.retornarCarroAlugado(carro);

        System.out.println("------------------------------------------------");

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();

        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando barco por um mês...");

        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
