package academy.devdojo.maratonajava.javacore.Rdata;

import java.util.Date;

public class DateTeste {
    public static void main(String[] args) {

        // Date trabalha com milisegundos, hoje em dia seu uso está obsoleto.
        Date data = new Date();

        // Adicionar 1 hora
        data.setTime(data.getTime() + 3_600_000 );
        System.out.println(data);
    }
}
