package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {

        /*
        \d = encontra todos os dígitos
        \D = encontra tudo que não for dígito
        \s = encontra espaços em brancos
        \S = encontra todos os caracteres menos espaços em branco
        \w = encontra tudo de a-z e digitos
        \W = encontra tudo que não seja alfanumérico e não seja um sublinhado (_).
        */

        String regex = "\\W";
        String texto = "j_@3hj2gu(*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 012345678910");
        while (matcher.find()) {
            // Pega o índice de onde foi encontrado o padrão
            System.out.print(matcher.start() + " ");
        }
    }
}
