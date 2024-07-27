package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste05 {
    public static void main(String[] args) {

        String texto = "lucas@gmail.com, 13123joao@hotmail.com.br, gustavocardoso.com, #@!teste_@gmail.com";
        String regex = "([a-zA-Z0-9\\._-]+@([a-zA-Z])+(\\.([a-zA-Z])+)+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
