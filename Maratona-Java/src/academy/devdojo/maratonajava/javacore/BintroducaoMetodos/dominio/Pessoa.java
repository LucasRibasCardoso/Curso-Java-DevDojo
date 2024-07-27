package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;


public class Pessoa {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;
    private double valorTotalSalarios;

    public void imprimeSalarios() {
        if (salarios == null) {
            return;
        }else {
            for (int i=0; i < salarios.length; i++) {
                valorTotalSalarios += salarios[i];
            }
            media = valorTotalSalarios / salarios.length;
            System.out.println("Média: " + media);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salarios;
    }

    public void setSalario(double[] salario) {
        this.salarios = salario;
    }

    public double getMedia(){
        return media;
    }

}
