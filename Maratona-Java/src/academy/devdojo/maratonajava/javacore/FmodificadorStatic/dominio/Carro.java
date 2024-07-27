package academy.devdojo.maratonajava.javacore.FmodificadorStatic.dominio;


public class Carro {

    private String modelo;
    private String marca;
    private double velocidadeMaxima;

    // variavel static, essa variavel se torna parte da Classe e não de uma instância.
    public static double velocidadeLimite = 250;


    public void imprime() {
        System.out.println("--------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Valocidade Maxima: " + velocidadeMaxima);
        System.out.println("Valocidade Limite: " + Carro.velocidadeLimite);
    }

    // Contrutor
    public Carro (String modelo, String marca, double velocidadeMaxima) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

}
