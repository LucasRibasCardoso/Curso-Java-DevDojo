package academy.devdojo.maratonajava.javacore.Sformatacao;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTeste01 {
    public static void main(String[] args) {

        // Transforma o date em String (Format -> objeto para String)
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        /*
         Transforma a string s1 em Objeto (parse -> String para objeto)
         O tipo de DataTimeFormatter deve combinar com o formato da String para parseado corretamente
         */
        LocalDate parse1 = LocalDate.parse(s1, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse(s2, DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse(s3, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("String: " + s1);
        System.out.println("Objeto: " + parse1);

        System.out.println("String: " + s2);
        System.out.println("Objeto: " + parse2);

        System.out.println("String: " + s3);
        System.out.println("Objeto: " + parse3);

        /*
         Caso seja necessário construir seu próprio DateTimeFormatter, veja abaixo como pode ser feito
         Exemplo: dd/mm/yyyy
         */
        DateTimeFormatter formatterBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBrasil = LocalDate.now().format(formatterBrasil);
        System.out.println("String: " + formatBrasil);

        LocalDate parseBrasil = LocalDate.parse(formatBrasil, formatterBrasil);
        System.out.println("Objeto: " + parseBrasil);

    }
}
