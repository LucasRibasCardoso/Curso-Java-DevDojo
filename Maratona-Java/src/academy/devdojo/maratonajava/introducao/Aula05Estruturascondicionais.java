package academy.devdojo.maratonajava.introducao;

public class Aula05Estruturascondicionais {
    public static void main(String[] args) {
        byte dia = 5;
        String diaSemana = "";

        // Só aceita dados dos tipos: char, byte, int, short, enum, String
        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                System.out.println("Dia da semana é: " +diaSemana);
                break;
            case 2:
                diaSemana = "Segunda";
                System.out.println("Dia da semana é: " +diaSemana);
                break;
            case 3:
                diaSemana = "Terça";
                System.out.println("Dia da semana é: " +diaSemana);
                break;
            case 4:
                diaSemana = "Quarta";
                System.out.println("Dia da semana é: " +diaSemana);
                break;
            case 5:
                diaSemana = "Quinta";
                System.out.println("Dia da semana é: " +diaSemana);
                break;
            case 6:
                System.out.println("Dia da semana é: " +diaSemana);
                break;
            case 7:
                System.out.println("Dia da semana é: " +diaSemana);
                break;
            default:
                System.out.println("Escolha um número entre 1 e 7");
                break;

        }

    }
}
