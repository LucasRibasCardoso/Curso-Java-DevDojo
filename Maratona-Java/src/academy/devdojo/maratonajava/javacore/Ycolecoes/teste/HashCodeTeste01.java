package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class HashCodeTeste01 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("312313", "Apple");

        System.out.println(smartphone.hashCode());
    }
}
