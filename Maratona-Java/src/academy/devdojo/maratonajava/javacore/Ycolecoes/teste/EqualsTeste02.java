package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTeste02 {
    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone("12AS23", "Samsung");
        Smartphone smartphone2 = new Smartphone("12AS23", "Iphone");

        System.out.println(smartphone1.equals(smartphone2));

    }
}
