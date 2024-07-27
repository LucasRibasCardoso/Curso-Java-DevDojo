package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {
        List<Barco> listBarcos = criarArrayComUmObjeto(new Barco("Lancha"));
        System.out.println(listBarcos);
    }

    private static <T> List<T> criarArrayComUmObjeto(T obj) {
        return List.of(obj);
    }
}
