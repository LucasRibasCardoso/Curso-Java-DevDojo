package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {

        Produto produto = new Computador(3500, "Ryzen 9");

        Tomate tomate = new Tomate(20, "Tomate Americano");
        tomate.setDataValidade("11/08/2024");

        CalculadoraImposto.calcularImposto(tomate);

        System.out.println("-------------");

        CalculadoraImposto.calcularImposto(produto);
    }
}
