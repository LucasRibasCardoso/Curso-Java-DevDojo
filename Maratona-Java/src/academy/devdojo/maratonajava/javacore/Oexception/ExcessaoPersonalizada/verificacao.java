package academy.devdojo.maratonajava.javacore.Oexception.ExcessaoPersonalizada;

public class verificacao {
    public static void verificarIdade(int idade) throws idadeInvalidaException {
        if (idade < 18) {
            throw new idadeInvalidaException("Idade inválida! Precisa ter mais de 18 anos.");
        } else {
            System.out.println("Idade válida: " + idade + " anos");
        }
    }
}
