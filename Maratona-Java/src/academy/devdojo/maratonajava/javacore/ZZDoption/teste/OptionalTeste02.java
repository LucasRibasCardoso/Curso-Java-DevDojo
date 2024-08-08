package academy.devdojo.maratonajava.javacore.ZZDoption.teste;

import academy.devdojo.maratonajava.javacore.ZZDoption.dominio.Filme;
import academy.devdojo.maratonajava.javacore.ZZDoption.repositorio.FilmeRepository;

import java.util.Optional;

public class OptionalTeste02 {
    public static void main(String[] args) {

        Optional<Filme> filmeByTitle = FilmeRepository.findByTitle("Atirador");
        filmeByTitle.ifPresent(filme -> filme.setTitle("O atirador"));
        System.out.println(filmeByTitle);

        Filme filmeById = FilmeRepository.findById(3).orElseThrow(IllegalArgumentException::new);
        System.out.println(filmeById);

        Filme newFilme = FilmeRepository.findByTitle("Agente 007")
                .orElseGet(() -> new Filme(4, "Agente 007", 8)
        );
        System.out.println(newFilme);
    }
}
