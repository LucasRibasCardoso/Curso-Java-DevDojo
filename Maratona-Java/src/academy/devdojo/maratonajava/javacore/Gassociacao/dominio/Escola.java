package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    // Construtores
    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    // Métodos
    public void imprime() {
        System.out.println("Escola: " + this.nome);
        if (professores == null) return; // caso o array for vazio retorna nada para encerrar o metodo
        for (int i = 0; i < professores.length; i++) {
            System.out.println("Professor [" + i + "] -> " + professores[i].getNome());
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }
}
