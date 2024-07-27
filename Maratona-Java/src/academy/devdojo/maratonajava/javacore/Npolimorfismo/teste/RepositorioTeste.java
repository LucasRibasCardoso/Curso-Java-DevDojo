package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {

        /*
        Dessa maneira utilizando a interface Repositorio que é abrange todos os tipos de repositorios, caso eu queira
        alterar o objeto de RepositorioBancoDeDados para RepositorioArquivo eu so preciso trocar em um lugar, isso
        ajuda na manutebilidade do código
         */

        // Repositorio repositorio = new RepositorioArquivo
        // Repositorio repositorio = new RepositorioMemoria
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
