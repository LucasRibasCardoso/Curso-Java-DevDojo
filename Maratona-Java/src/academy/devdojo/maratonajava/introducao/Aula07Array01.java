package academy.devdojo.maratonajava.introducao;

public class Aula07Array01 {
    public static void main(String[] args) {
        // Cria um array de idades com espaço de 3 slots na memória
        int[] idades = new int[3];
        idades[0] = 18;
        idades[1] = 21;
        idades[2] = 22;
        for (int i=0; i< idades.length; i++)
            System.out.println(idades[i]);
    }
}
