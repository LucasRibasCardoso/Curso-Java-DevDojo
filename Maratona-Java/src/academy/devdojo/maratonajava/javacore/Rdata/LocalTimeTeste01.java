package academy.devdojo.maratonajava.javacore.Rdata;

import java.time.LocalTime;

public class LocalTimeTeste01 {
    public static void main(String[] args) {

        LocalTime hora = LocalTime.of(23, 15, 30);
        LocalTime horaAtual = LocalTime.now();

        System.out.println(hora);
        System.out.println(horaAtual);

    }
}
