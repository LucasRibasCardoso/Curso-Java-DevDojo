package academy.devdojo.maratonajava.javacore.Rdata;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {

        Map<String, String> map = ZoneId.SHORT_IDS;
        System.out.println(map);

        // Imprime a zona em que o sistema está
        System.out.println(ZoneId.systemDefault());

        // Define o fuso horário de Tóquio.
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // Exibe o horario atual do sistema para a TimeZone de tokyo
        ZonedDateTime zonedDateTime1 = now.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

        // Captura o instante atual no tempo (em UTC).
        Instant nowInstant = Instant.now();
        // Imprime o instante atual no formato ISO-8601, incluindo o sufixo 'Z' que indica UTC.
        System.out.println(nowInstant);
        // Converte o instante atual (UTC) para o fuso horário de Tóquio.
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        // Imprime o ZonedDateTime no formato ISO-8601, incluindo o deslocamento de +09:00 e o identificador de fuso horário 'Asia/Tokyo'.
        System.out.println(zonedDateTime2);

    }
}
