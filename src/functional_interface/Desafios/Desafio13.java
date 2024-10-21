package functional_interface.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 13 - Filtrar os números que estão dentro de um intervalo:
public class Desafio13 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        numeros.stream()
                .filter(n -> n > 5 && n < 10)
                .forEach(System.out::println);
    }
}
