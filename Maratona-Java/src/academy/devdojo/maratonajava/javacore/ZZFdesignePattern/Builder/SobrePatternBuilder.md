# Builder

O pattern Builder tem o propósito de resolver os casos onde a classe possuí muitos parâmetros e acaba que a leitura e compreensão do código fica complicada, pensando nisso podemos utilizar no designe pattern Builder. Que consiste em criar uma subclasse (builder) com os setters da classe principal, mantendo os atributos e o construtor privado. Podemos ver melhor no exemplo a seguir.

## Classe Person

```java
public class Person {

    private String firstName;
    private String lastName;
    private String username;
    private String email;

    // Construtor Privado
    private Person(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    // Classe builder de Pessoa
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

        // retona o objeto pessoa com todos os atributos preenchidos
        public Person build() {
            return new Person(firstName, lastName, username, email);
        }
    }
}

```

## Main com Builder

```java
public class BuilderTest01 {
    public static void main(String[] args) {

        Person person = new Person.PersonBuilder()
                .setFirstName("Lucas")
                .setLastName("Cardoso")
                .setUsername("lucasrc2005")
                .setEmail("lucasrc2005@gmail.com")
                .build(); 
    }
}
```

## Main sem Builder

```java
public class BuilderTest01 {
    public static void main(String[] args) {

        Person person = new Person("Lucas", "Cardoso", "lucasrc2005", "lucasrc2005@gmail.com");        
    }
}
```

Nota a diferença na legibilidade do código, quando não utilizamos o builder, precisamos ficar olhando o parâmetro e ir até a classe para ver ao que se refere, já quando aplicamos o pattern builder, o próprio método setter já explica o que é o parâmetro, dessa forma se formos ler esse código daqui algum tempo ou outra pessoa ler,  será muito mais fácil o entendimento sobre o que é e faz a classe.

Para um exemplo mais robusto, acesse :

Artigo -  [https://mballem.com/post/simplificando-com-builder-pattern/](https://mballem.com/post/simplificando-com-builder-pattern/)

Meu GitHub - https://github.com/LucasRibasCardoso/Curso-Java-DevDojo/tree/main/Maratona-Java/src/academy/devdojo/maratonajava/javacore/ZZFdesignePattern/Builder