package academy.devdojo.maratonajava.javacore.Rdata;

import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.Dominio.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2024-08-12");
        LocalTime time = LocalTime.parse("23:45:15");

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);

        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
