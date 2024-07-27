package academy.devdojo.maratonajava.javacore.Rdata;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTeste01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYear = LocalDateTime.now().plusYears(2);
        LocalTime timenow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        // Mede a duração entre duas datas que possuem segundos, LocalDate não funciona
        Duration d1 = Duration.between(now, nowAfterTwoYear);
        Duration d2 = Duration.between(timenow, timeMinus7Hours);

        System.out.println(d1);
        System.out.println(d2);
    }
}
