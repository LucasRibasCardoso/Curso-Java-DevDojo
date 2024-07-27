package academy.devdojo.maratonajava.javacore.Rdata;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTesteo01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTowYears = LocalDate.now().plusYears(2);

        // Mostra o periodo entre duas datas.
        Period p1 = Period.between(now, nowAfterTowYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofMonths(4);
        Period p4 = Period.ofYears(2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
