package academy.devdojo.maratonajava.javacore.Rdata;

import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.Dominio.Local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;



class obterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek daysOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 1;

        switch (daysOfWeek) {
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}


public class TemporalAdjusterTeste02 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(15).with(new obterProximoDiaUtil());
        System.out.println(now);

        System.out.println(now.getDayOfWeek());
    }
}
