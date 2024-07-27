package academy.devdojo.maratonajava.javacore.Pwrappers;

public class WrapperTeste01 {
    public static void main(String[] args) {


        Integer intW = 1; // autoboxing = passa de primitivo -> Wrapper
        Boolean booleanW = true;
        Short shortW = 1;
        Character caractere = 'M';
        Double doubleW = 10D;
        Float floatW = 10F;
        Long longW = 10L;

        int i = intW; // unboxing = passa de Wrapper -> primitivo

        Integer intW2 = Integer.parseInt("2"); // Transforma a string 2 em um inteiro

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));

    }
}
