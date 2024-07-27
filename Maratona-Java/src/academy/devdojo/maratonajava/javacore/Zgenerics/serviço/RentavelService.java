package academy.devdojo.maratonajava.javacore.Zgenerics.serviço;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentavelService<T> {
    private List<T> objetosDisponiveis;

    public RentavelService (List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando objeto disponivel");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Carros objetos para alugar:");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto: "+ t);
        objetosDisponiveis.add(t);
        System.out.println("Carros objetos para alugar:");
        System.out.println(objetosDisponiveis);
    }

}
