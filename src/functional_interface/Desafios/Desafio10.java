package functional_interface.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
public class Desafio10 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        numeros.stream()
                .distinct()
                .filter(n -> n % 2 != 0)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .sorted(Integer::compare)
                .forEach(System.out::println);
    }
}
