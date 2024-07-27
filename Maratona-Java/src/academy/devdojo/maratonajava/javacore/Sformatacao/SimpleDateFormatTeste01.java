package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {

        String mascaraFormato = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(mascaraFormato);

        System.out.println(sdf.format(new Date()));

    }
}
