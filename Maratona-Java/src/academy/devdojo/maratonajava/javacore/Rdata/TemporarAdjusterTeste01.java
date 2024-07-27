package academy.devdojo.maratonajava.javacore.Rdata;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporarAdjusterTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        // with substitui somente o valor que você passar
        now = now.withDayOfMonth(21);
        System.out.println(now);

        // retorna a data do proximo dia que você passou
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(now);

        // retorna a data do ultimo dia que você passou
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println(now);

        // retorna a data do primeiro dia do mês
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);

        // retorna a data no primeiro dia do proximo ano
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);

        // retorna a data do ultimo dia do ano
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        System.out.println(now);
    }
}
