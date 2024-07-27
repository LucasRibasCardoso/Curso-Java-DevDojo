package academy.devdojo.maratonajava.javacore.Qstring;

public class StringBuild {
    public static void main(String[] args) {

        StringBuilder nome = new StringBuilder(); // por padrao vem setado com 16 espaços
        nome.append("Lucas Ribas Cardoso");

        // Métodos Stringbuild
        nome.reverse();
        nome.delete(0, 2);
        nome.insert(0, "Inserido");
        System.out.println(nome);
    }
}
