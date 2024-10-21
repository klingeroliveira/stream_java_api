package functional_interface.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 1 - Mostre a lista na ordem numérica:
public class Desafio1 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        numeros.stream()
                .sorted(Integer::compare)
                .forEach(System.out::println);
    }
}
