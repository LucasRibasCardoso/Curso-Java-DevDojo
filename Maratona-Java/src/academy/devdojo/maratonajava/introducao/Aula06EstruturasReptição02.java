package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasReptição02 {
    public static void main(String[] args) {
        // Imprimir todos os numeros pares ate 1 milhao

        for (int i=0; i < 1000000; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
