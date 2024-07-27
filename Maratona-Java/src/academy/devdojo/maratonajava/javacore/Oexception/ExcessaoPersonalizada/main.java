package academy.devdojo.maratonajava.javacore.Oexception.ExcessaoPersonalizada;

public class main {
    public static void main(String[] args) {
        try{
            verificacao.verificarIdade(17);
        }
        catch (idadeInvalidaException e) {
            System.out.println("Excessao capturada: " + e.getMessage());
        }
    }
}
