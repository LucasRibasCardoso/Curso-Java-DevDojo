package academy.devdojo.maratonajava.javacore.Oexception.ExcessaoPersonalizada;

public class idadeInvalidaException extends Exception {

    // Contrutor caso só tenha mensagem.
    public idadeInvalidaException(String message) {
        super(message);
    }
    // Construtor caso tenha mensagem e a causa da excessao.
    public idadeInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }
}
