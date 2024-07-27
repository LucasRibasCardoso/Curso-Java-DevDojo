package academy.devdojo.maratonajava.javacore.Rdata;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTeste01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, Month.JULY, 12);
        LocalDate dateAgora = LocalDate.now();

        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.isLeapYear()); // Verifica se ano é bissexto
        System.out.println(dateAgora);
    }
}
