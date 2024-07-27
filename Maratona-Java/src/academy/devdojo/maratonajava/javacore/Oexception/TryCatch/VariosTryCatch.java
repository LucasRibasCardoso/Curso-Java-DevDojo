package academy.devdojo.maratonajava.javacore.Oexception.TryCatch;

public class VariosTryCatch {
    public static void main(String[] args) {
        int[] arrayInteiros = {1, 2, 3, 4, 5};

        try {
            System.out.println("Código que pode ter algum erro");
            //System.out.println(arrayInteiros[7]); Simula erro de IndexOutOfBounds
            //int divisao = 10/0; Simula erro de Arithmetic
        }
        catch (ArithmeticException e) {
            System.out.println("Captura excessao caso tente fazer operacao aritimeticas invalidas");
            e.printStackTrace();

        }
        catch (IndexOutOfBoundsException e){
            System.out.println("captura excessao caso tentar acessar um indice inexistente");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Caputura qualquer excessao que nao foi especificada acima");
        }
        finally {
            System.out.println("Executa tendo ou não exceções");
        }

    }
}
