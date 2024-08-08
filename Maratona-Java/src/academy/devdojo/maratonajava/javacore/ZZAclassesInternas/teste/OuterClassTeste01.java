package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.teste;

// Classe externa
public class OuterClassTeste01 {

    private String name = "Lucas Ribas Cardoso";

    // Classe interna
    class InnerClass {
        public void printOuterClassAtribute () {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        // Cria um objeto da classe externa, obrigatorio para criar o objeto da classe interna
        OuterClassTeste01 outerClass = new OuterClassTeste01();

        // Cria um objeto da classe interna de OuterClassTeste01
        InnerClass innerClass = outerClass.new InnerClass();

        // Chama a classe interna que tem acesso aos atributos da classe externa e imprime-os
        innerClass.printOuterClassAtribute();
    }
}
