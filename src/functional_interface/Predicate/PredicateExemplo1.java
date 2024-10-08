package functional_interface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo1 {

    /**
     * Predicate<T>:
     * Aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
     * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isPar = n -> n % 2 == 0;

        numeros.stream()
                .filter(isPar)
                .forEach(System.out::println);
    }
}
