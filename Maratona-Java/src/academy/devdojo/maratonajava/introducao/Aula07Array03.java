package academy.devdojo.maratonajava.introducao;

public class Aula07Array03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        // criar o array diretamente com os valores ja atribuidos
        int[] numeros2 = {1, 2, 3};

        for (int i=0; i<numeros2.length; i++){
            System.out.println(numeros2[i]);
        }

        for (int valor : numeros2) {
            System.out.println(valor);
        }
    }
}
