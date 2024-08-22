package academy.devdojo.maratonajava.javacore.ZZFdesignePattern.Builder.ExemploParamOpcional;

public class ContaCorrenteTest01 {

    public static void main(String[] args) {

        ContaCorrenteBuilder contaCorrente1 = new ContaCorrenteBuilder();
        contaCorrente1
                .addNomeTitular("Lucas Ribas Cardoso")
                .addNumeroConta(1384)
                .addNumeroAgencia(2303213)
                .addSaldo(1500D)
                .build();
        System.out.println(contaCorrente1);


        ContaCorrenteBuilder contaCorrente2 = new ContaCorrenteBuilder();
        contaCorrente2
                .addNomeTitular("Gustavo Cardoso")
                .addNumeroConta(123)
                .build();
        System.out.println(contaCorrente2);


        ContaCorrenteBuilder contaCorrente3 = new ContaCorrenteBuilder();
        contaCorrente3
                .addNomeTitular("Eduardo Laudelino Cardoso")
                .addNumeroAgencia(2303213)
                .addNumeroConta(123)
                .build();
        System.out.println(contaCorrente3);


    }
}
