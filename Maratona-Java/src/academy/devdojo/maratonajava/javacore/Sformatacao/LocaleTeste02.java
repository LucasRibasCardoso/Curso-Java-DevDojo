package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.util.Locale;

public class LocaleTeste02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String country : isoCountries) {
            System.out.print(country + " ");
        }

        System.out.println(" ");

        for (String language : isoLanguages) {
            System.out.print(language + " ");
        }
    }
}
