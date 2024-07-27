package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        // Cria uma instacia do objeto Estudante
        Estudante estudante = new Estudante();

        estudante.nome = "Lucas";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);


        // Cria uma instacia do objeto Estudante
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Gustavo";
        estudante2.idade = 13;
        estudante2.sexo = 'M';

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

    }
}
