package academy.devdojo.maratonajava.javacore.Oexception.RuntimeException;

public class RuntimExecptionTeste01 {
    public static void main(String[] args) {
        System.out.println(divisao(2, 0));
    }

    public static int divisao(int a, int b) {
        /**
         * @param b: não pode ser zero.
         */

        if (b == 0 ) {
            throw new IllegalArgumentException("Argumento inválido. Nào é possivel divisão por 0.");
        }

        return a/b;
    }
}
