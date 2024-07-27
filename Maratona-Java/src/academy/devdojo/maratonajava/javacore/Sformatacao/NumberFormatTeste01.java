package academy.devdojo.maratonajava.javacore.Sformatacao;

import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.Dominio.Local;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {

        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localePT);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localIT);
        double valor = 100_000_000.2130;

        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }
    }
}
