package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;


import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {

        Computador computador = new Computador(3000, "Gaming 3i");

        Tomate tomate = new Tomate(10, "Tomate Australiano");
        Televisao tv = new Televisao(4500, "Samsung 55\" ");

        CalculadoraImposto.calcularImposto(computador);

        System.out.println("================================");

        CalculadoraImposto.calcularImposto(tomate);

        System.out.println("================================");

        CalculadoraImposto.calcularImposto(tv);
    }
}
