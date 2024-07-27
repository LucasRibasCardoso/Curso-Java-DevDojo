package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste04 {
    public static void main(String[] args) {

        /*
        \d = encontra todos os dígitos
        \D = encontra tudo que não for dígito
        \s = encontra espaços em brancos
        \S = encontra todos os caracteres menos espaços em branco
        \w = encontra tudo de a-z e digitos
        \W = encontra tudo que não seja alfanumérico e não seja um sublinhado (_).
        [] = define um intervalo
        ? = zero ou uma ocorrencias
        * = zero ou mais ocorrencias
        + = uma ou mais ocorrencias
        {n, m} = de n até m
        () = agrupa as expressoes
        | = ou, o(c|v)o encontraria ovo ou oco
        $ = encontra o fim da linha
        . = pro exemplo 1.3 retornaria 123, 133, 1@3, 1A3
        */

        String regex = "0[xX]([0-9a-fA-F])+\\s|$";
        String texto = "123G as 0xFFABC 0Xd";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 012345678910");
        while (matcher.find()) {
            // Pega o índice de onde foi encontrado o padrão
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        // Número hexadecimal
        int numeroHex = 0x59F86A;

    }
}
