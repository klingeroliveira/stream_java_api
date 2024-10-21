package functional_interface.Desafios;

import java.util.Arrays;
import java.util.List;

//Desafio 7 - Encontrar o segundo número maior da lista:
public class Desafio7 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 15, 4, 3);

        numeros.stream()
                .distinct()
                .sorted((n1, n2) -> Integer.compare(n2, n1))
                .skip(1)
                .limit(1)
                .forEach(System.out::println);
    }
}
