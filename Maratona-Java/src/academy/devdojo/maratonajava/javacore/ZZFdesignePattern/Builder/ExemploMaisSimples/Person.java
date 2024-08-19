package academy.devdojo.maratonajava.javacore.ZZFdesignePattern.Builder.ExemploMaisSimples;

public class Person {

    private String firstName;
    private String lastName;
    private String username;
    private String email;

    // To String
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Construtor Privado
    private Person(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }


    // Classe builder de pessoa
    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String username;
        private String email;


        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        // Cria o objeto pessoa com todos os atributos preenchidos
        public Person build() {
            return new Person(firstName, lastName, username, email);
        }
    }
}
