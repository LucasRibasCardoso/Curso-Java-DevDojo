package academy.devdojo.maratonajava.javacore.ZZFdesignePattern.Builder.ExemploMaisCompleto;

import academy.devdojo.maratonajava.javacore.ZZFdesignePattern.Builder.ExemploMaisCompleto.Builder.PessoaBuilder;
import academy.devdojo.maratonajava.javacore.ZZFdesignePattern.Builder.ExemploMaisCompleto.Entidades.Pessoa;
import academy.devdojo.maratonajava.javacore.ZZFdesignePattern.Builder.ExemploMaisCompleto.Entidades.Telefone;

public class CadastroTest01 {
    public static void main(String[] args) {

        Pessoa pessoa1 = PessoaBuilder.build()
                .addNome("Lucas", "Ribas Cardoso")
                .addDataNascimento(05, 9, 2005)
                .addLogradouro("Rua das Oliveiras")
                .addNumero("123")
                .addComplemento("Beco 1")
                .addBairro("Pindamonhangaba")
                .addCidade("Xique-Xique")
                .addPais("Brasil")
                .addFone(47, 36424124, Telefone.TipoFone.RESIDENCIAL)
                .addFone(47, 99623632, Telefone.TipoFone.CELULAR)
                .get();
        System.out.println(pessoa1.toString());


        PessoaBuilder pessoaBuilder = new PessoaBuilder()
                .addNome("Joao", "dos Santos")
                .addDataNascimento(22, 5, 1989)
                .addLogradouro("Rua das Oliveiras")
                .addNumero("272")
                .addComplemento("Bloco B")
                .addBairro("Centro")
                .addCidade("Porto Alegre")
                .addPais("Brasil")
                .addFone(51, 32221236, Telefone.TipoFone.RESIDENCIAL)
                .addFone(51, 99623632, Telefone.TipoFone.CELULAR);

        Pessoa pessoa2 = pessoaBuilder.get();
        System.out.println(pessoa2.toString());
    }
}
