package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.Scanner;

public class ScannerTeste01 {
    public static void main(String[] args) {
        String nomes = "Lucas,João,Gustavo,Eduardo";
        Scanner scanner = new Scanner(nomes);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            }
            else if (scanner.hasNextBoolean()) {
                boolean b = scanner.hasNextBoolean();
                System.out.println("Boolean: " + b);
            }
            else {
                System.out.println(scanner.next());
            }
        }
    }
}
