package functional_interface.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 16 - Agrupe os números em pares e ímpares:
public class Desafio16 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        List<Integer> listPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> listImpares = numeros.stream()
                .filter(n -> n % 2 != 0)
                .toList();

        System.out.println("Pares: ");
        listPares.forEach(System.out::println);
        System.out.println("Impares: ");
        listImpares.forEach(System.out::println);
    }
}
