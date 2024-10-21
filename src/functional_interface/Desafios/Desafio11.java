package functional_interface.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
public class Desafio11 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        numeros.stream()
                .mapToInt(value -> (int) Math.pow(value, 2))
                .forEach(System.out::println);

        int reduce = numeros.stream()
                .mapToInt(value -> (int) Math.pow(value, 2))
                .reduce(Integer::sum)
                .orElse(0);

        System.out.println(reduce);
    }
}