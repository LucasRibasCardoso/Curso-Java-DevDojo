package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {

        Locale localBrasil = new Locale("pt", "BR");
        Locale localItaly = new Locale("it", "IT");


        DateFormat data1 = DateFormat.getDateInstance(DateFormat.FULL, localBrasil);
        DateFormat data2 = DateFormat.getDateInstance(DateFormat.FULL, localItaly);
        Calendar calendar = Calendar.getInstance();

        System.out.println("Brasil: " + data1.format(calendar.getTime()));
        System.out.println("Italia: " + data2.format(calendar.getTime()));


    }
}