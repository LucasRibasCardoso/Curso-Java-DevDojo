package academy.devdojo.maratonajava.javacore.Oexception.LançandoExcessoes;


// EXCESSOES PERSONALIZADAS
public class LançandoExcessao {
    public static void main(String[] args) {

        try {
            verificarIdade(17);
        }
        catch (Exception e) {
            System.out.println("Excessão capturada: " +e.getMessage());
        }
        finally {
            System.out.println("Você precisa ter CNH para dirigir!");
        }
    }

    /** Método verificar idade.
     * "throws Exception" esta avisando que esse método pode retornar um excessão do tipo Exception (tipo mais amplo),
     * porém como não é feito o tratamento dentro do método, através de try e catch, o método que chamar "verificacao"
     * (nesse caso "main") deverá realizar esse tratamento.
    */
    public static void verificarIdade(int idade) throws Exception {
        if (idade < 18) {
            throw new Exception("Idade inválida! Precisa ter 18 anos ou mais para dirigir.");
        } else {
            System.out.println("Parabéns você já pode dirigir!");
        }
    }


}
