package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.teste;



public class OuterClassTeste02 {

    private String name = "Lucas Ribas Cardoso";

    void print() {
        class LocalClass {

            public void printLocal() {
                System.out.println(name);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {

        OuterClassTeste02 outerClassTeste02 = new OuterClassTeste02();

        outerClassTeste02.print();

    }
}
