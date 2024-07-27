package academy.devdojo.maratonajava.javacore.FmodificadorStatic.teste;

import academy.devdojo.maratonajava.javacore.FmodificadorStatic.dominio.Carro;

public class CarroTeste {
    public static void main (String[] args) {
        Carro carro1 = new Carro("S10", "Chevrolet", 210);
        Carro carro2 = new Carro("Hilux", "Toyota", 220);

        carro1.imprime();
        carro2.imprime();

        /* Por padrao da classe a velocidade limite do carro é 250. porem se eu alterar esse valor, todas as instancias
        * seram afetadas*/
        Carro.velocidadeLimite = 180;

        carro1.imprime();
        carro2.imprime();
    }

}
