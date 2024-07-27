package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

import java.util.Scanner;


public class Calculadora {

    Scanner scanner = new Scanner(System.in);


    public int opcoes (int opcao) {
        while (opcao == 0) {

            System.out.println("Selecione uma Opção:");
            System.out.println("[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Divisão");
            System.out.println("[4] Resto da Divisão");
            System.out.println("[5] Equação de 2 Grau");

            opcao = scanner.nextInt();
            break;
        }
        return opcao;
    }

    public void adicao (double numero1, double numero2) {
        double resultado =   numero1 + numero2;
        System.out.println("Subtração: " + resultado);
    }

    public void subtracao (double numero1, double numero2) {
        double resultado =   numero1 - numero2;
        System.out.println("Subtração: " + resultado);
    }

    public void divisao (double numero1, double numero2) {
        double resultado =   numero1 / numero2;
        System.out.println("Divisão: " + resultado);
    }

    public void restoDivisao (double numero1, double numero2) {
        double resultado =   numero1 % numero2;
        System.out.println("Resto da Divisão: " + resultado);
    }

    public void equacaoSegundoGrau(double a, double b, double c) {

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("A equação é indeterminada (qualquer valor de x é solução).");
                } else {
                    System.out.println("A equação é contraditória (não há solução).");
                }
            } else {
                double x = -c / b;
                System.out.println("Esta é uma equação linear. A raiz é: " + x);
            }
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("As raízes são: " + raiz1 + " e " + raiz2);
        }
        else if (delta == 0) {
            double raizDupla = -b / (2 * a);
            System.out.println("A raíz é:" + raizDupla);
        }
        else {
            System.out.println("A equação não possui raízes reais.");
        }
    }
}
