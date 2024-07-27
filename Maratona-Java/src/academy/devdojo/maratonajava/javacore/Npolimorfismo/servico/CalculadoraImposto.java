package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        double imposto = produto.calcularImposto();
        double valorFinal = produto.getValor() + imposto;

        System.out.println("Relatório Produto");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor sem imposto: R$" + produto.getValor());
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor total: R$" + valorFinal);
        if (produto instanceof Tomate) {
            String datavalidade = ((Tomate) produto).getDataValidade();
            System.out.println("Data de validade: " + datavalidade);
        }

    }
}
