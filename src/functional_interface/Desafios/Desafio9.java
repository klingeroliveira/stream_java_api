package functional_interface.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
public class Desafio9 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));
        List<Integer> numerosRepetitos = new ArrayList<>();

        for (Integer numero : numeros) {
            long count = numeros.stream().filter(n -> n.equals(numero)).count();
            if (count > 1) {
                numerosRepetitos.add(numero);
            }
        }

        long count = numerosRepetitos.stream().distinct().count();

        System.out.println("A lista possui "
                + count
                + " números repetidos!");

        numerosRepetitos.stream().sorted(Integer::compare).forEach(System.out::println);
    }
}
