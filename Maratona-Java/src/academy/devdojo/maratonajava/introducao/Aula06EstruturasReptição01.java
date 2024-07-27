package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasReptição01 {
    public static void main(String[] args) {
        // while, Do while, for

        // While (so executa enquanto for true)
        int count = 0;

        while (count < 10) {
            System.out.println("Whilhe: "+ ++count);
        }


        // DO While executa pelo menos uma vez mesmo que seja false
        count = 12;
        do {
            System.out.println("Dentro do DoWhile: " + ++count);
        }
        while (count < 10);

        // For
        for (int i=0; i<10; i++){
            System.out.println("For: "+ i );
        }
    }
}
