package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTeste01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] date = new DateFormat[7];

        date[0] = DateFormat.getInstance();
        date[1] = DateFormat.getDateInstance();
        date[2] = DateFormat.getDateTimeInstance();
        date[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        date[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        date[5] = DateFormat.getDateInstance(DateFormat.LONG);
        date[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat : date) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
