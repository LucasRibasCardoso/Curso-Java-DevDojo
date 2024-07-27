package academy.devdojo.maratonajava.introducao;

public class Aula07Array02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Lucas";
        nomes[1] = "Gustavo";
        nomes[2] = "Eduardo";

        for (int i=0; i<nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println("-----------");

        nomes = new String[3];
        for (int i=0; i<nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
