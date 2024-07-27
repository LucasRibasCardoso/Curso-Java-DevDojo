package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("312313", "Apple");
        Smartphone smartphone2 = new Smartphone("09089675", "Samsung");
        Smartphone smartphone3 = new Smartphone("123456", "Motorola");

        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

        // smartphones.clear();

        // adicionando mais um smartphone na lista
        Smartphone smartphone4 = new Smartphone("0987689", "Pixel");

        System.out.println("Smartphone4 esta na lista: " + smartphones.contains(smartphone4));

        smartphones.add(0, smartphone4);

        int indexSmartphone4 = smartphones.indexOf(smartphone4);
        System.out.println("Indice smartphone4: " + indexSmartphone4);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
    }
}
