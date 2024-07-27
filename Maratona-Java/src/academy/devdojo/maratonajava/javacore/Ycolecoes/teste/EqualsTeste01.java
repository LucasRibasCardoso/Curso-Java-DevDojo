package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone("12AS23", "Samsung");
        Smartphone smartphone2 = new Smartphone("12AS23", "Iphone");

        // Sobrescrevemos a função equals para comparar se dois smatphones são iguais, com base no serialNumber
        System.out.println(smartphone1.equals(smartphone2));

    }
}
