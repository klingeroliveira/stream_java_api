package functional_interface.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 12 - Encontre o produto de todos os números da lista:
public class Desafio12 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        int reduce = numeros.stream()
                .reduce((n1, n2) -> n1 * n2)
                .orElse(0);

        System.out.println(reduce);
    }
}