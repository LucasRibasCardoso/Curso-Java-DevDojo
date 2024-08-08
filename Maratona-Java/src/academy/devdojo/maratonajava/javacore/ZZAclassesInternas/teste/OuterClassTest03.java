package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.teste;

public class OuterClassTest03 {

    private String name = "Lucas";

    static class Nested {
        private String lastname = "Ribas Cardoso";
        void print() {
            System.out.println(new OuterClassTest03().name + " " + lastname);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();

        nested.print();
    }
}
