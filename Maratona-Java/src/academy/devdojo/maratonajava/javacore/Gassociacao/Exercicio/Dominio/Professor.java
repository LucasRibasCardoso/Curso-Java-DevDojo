package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.Dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String especialidade, String nome) {
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void imprime () {
        System.out.println("------------------------------------");
        System.out.println("Professor: " + this.nome);
        if(this.seminarios == null) return;
        System.out.println("** Seminários Cadastrados **");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            System.out.println("** Alunos **");
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + " Idade: " + aluno.getIdade());
            }
        }
        System.out.println("------------------------------------");
    }
}
