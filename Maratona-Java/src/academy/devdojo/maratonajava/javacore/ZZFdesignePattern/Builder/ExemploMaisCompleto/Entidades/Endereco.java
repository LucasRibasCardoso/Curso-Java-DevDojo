package academy.devdojo.maratonajava.javacore.ZZFdesignePattern.Builder.ExemploMaisCompleto.Entidades;

public class Endereco {

    private String logradouro;
    private String numero;
    private String complementos;
    private String bairro;
    private String cidade;
    private String pais;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplementos() {
        return complementos;
    }

    public void setComplementos(String complementos) {
        this.complementos = complementos;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complementos='" + complementos + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
