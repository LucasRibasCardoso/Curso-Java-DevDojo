package academy.devdojo.maratonajava.javacore.Rdata;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    public static void main(String[] args) {

        Calendar data = Calendar.getInstance();

        System.out.println(data.get(Calendar.DAY_OF_MONTH));
        System.out.println(data.get(Calendar.DAY_OF_WEEK));
        System.out.println(data.get(Calendar.DAY_OF_YEAR));

        data.add(Calendar.DAY_OF_WEEK, 2);

        Date date = data.getTime();
        System.out.println(date);
    }
}
