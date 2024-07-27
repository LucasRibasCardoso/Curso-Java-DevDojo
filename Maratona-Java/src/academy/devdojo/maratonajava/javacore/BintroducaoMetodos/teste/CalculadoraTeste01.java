package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;
import java.util.Scanner;


public class CalculadoraTeste01 {
    public static void main(String[] args) {

        double numero1;
        double numero2;
        double numero3;
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("CALCULADORA");

        int opcaoSelecionada = calculadora.opcoes(0);

        switch (opcaoSelecionada) {
            default:
                System.out.println("Selecione uma opção válida!!!");
                break;

            case 1:
                System.out.println("Digite dois valores:");
                numero1 = scanner.nextDouble();
                numero2 = scanner.nextDouble();

                calculadora.adicao(numero1, numero2);
                break;

            case 2:
                System.out.println("Digite dois valores:");
                numero1 = scanner.nextDouble();
                numero2 = scanner.nextDouble();

                calculadora.subtracao(numero1, numero2);
                break;

            case  3:
                System.out.println("Digite dois valores:");
                numero1 = scanner.nextDouble();
                numero2 = scanner.nextDouble();

                calculadora.divisao(numero1, numero2);
                break;

            case 4:
                System.out.println("Digite dois valores:");
                numero1 = scanner.nextDouble();
                numero2 = scanner.nextDouble();

                calculadora.restoDivisao(numero1, numero2);
                break;

            case 5:
                System.out.println("Digite o valor de A: ");
                numero1 = scanner.nextDouble();

                System.out.println("Digite o valor de B: ");
                numero2 = scanner.nextDouble();

                System.out.println("Digite o valor de C: ");
                numero3 = scanner.nextDouble();

                calculadora.equacaoSegundoGrau(numero1, numero2, numero3);

        }
    }
}
