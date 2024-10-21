package functional_interface.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 4 - Remova todos os valores ímpares:
public class Desafio4 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        numeros.removeIf(n -> n % 2 != 0);

        numeros.forEach(System.out::println);
    }
}
