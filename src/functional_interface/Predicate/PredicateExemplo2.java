package functional_interface.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo2 {

    /**
     * Predicate<T>:
     * Aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
     * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isPar = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };

        List<Integer> numerosPares = new ArrayList<>();

        for (Integer numero : numeros) {
            if (isPar.test(numero)) {
                numerosPares.add(numero);
            }
        }

        numerosPares.forEach(System.out::println);
    }
}
