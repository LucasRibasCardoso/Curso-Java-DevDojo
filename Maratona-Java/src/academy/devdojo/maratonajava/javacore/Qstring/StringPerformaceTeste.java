package academy.devdojo.maratonajava.javacore.Qstring;

public class StringPerformaceTeste {
    public static void main(String[] args) {


        // Manipulando String
        long inicio1 = System.currentTimeMillis();
        concatString(100000);
        long fim1 = System.currentTimeMillis();
        System.out.println("Tempo de execução String: " + (fim1 - inicio1) + "ms");

        // Manipulando StringBuilder
        long inicio2 = System.currentTimeMillis();
        concatStringBuild(1_000_000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo de execução StringBuild: " + (fim2 - inicio2) + "ms");

        // Manipulando StringBuffer
        long inicio3 = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo de execução StringBuffer: " + (fim3 - inicio3) + "ms");

    }

    public static void concatString(int tamanho) {
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    public static void concatStringBuild(int tamanho) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int tamanho) {
        StringBuffer sbf = new StringBuffer();

        for (int i = 0; i < tamanho; i++) {
            sbf.append(i);
        }
    }
}
