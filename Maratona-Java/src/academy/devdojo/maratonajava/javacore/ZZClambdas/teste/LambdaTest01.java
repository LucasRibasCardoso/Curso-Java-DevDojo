package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {

    public static void main(String[] args) {

       List<String> nameList = List.of("Lucas", "Eduardo", "Gustavo");
       List<Integer> numbersList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       forEach(nameList,  name -> System.out.println(name));

       forEach(numbersList, number -> {
           if (number % 2 == 0) {
               System.out.print(number);
           }
       });
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}

