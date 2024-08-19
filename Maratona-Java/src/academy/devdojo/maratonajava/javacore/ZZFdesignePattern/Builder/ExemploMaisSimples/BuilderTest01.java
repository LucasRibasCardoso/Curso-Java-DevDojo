package academy.devdojo.maratonajava.javacore.ZZFdesignePattern.Builder.ExemploMaisSimples;

public class BuilderTest01 {
    public static void main(String[] args) {

        Person person = new Person.PersonBuilder()
                .setFirstName("Lucas")
                .setLastName("Cardoso")
                .setUsername("lucasrc2005")
                .setEmail("lucasrc2005@gmail.com")
                .build();

        System.out.println(person);
    }
}
