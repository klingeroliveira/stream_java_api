package functional_interface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo3 {

    /**
     * Predicate<T>:
     * Aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
     * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
     */

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("javaa", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> maisDe5 = p -> p.length() > 5;

        palavras.stream()
                .filter(maisDe5)
                .forEach(System.out::println);

        palavras.stream()
                .filter(p -> p.length() == 5)
                .forEach(System.out::println);

        for (String p : palavras) {
            if (maisDe5.test(p)) {
                System.out.println(p);
            }
        }
    }
}
