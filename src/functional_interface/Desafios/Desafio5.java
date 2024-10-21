package functional_interface.Desafios;

import java.util.Arrays;
import java.util.List;

//Desafio 5 - Calcule a média dos números maiores que 5:
public class Desafio5 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double media = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(value -> value)
                .average()
                .orElse(0);

        System.out.println("Média números > 5 = " + media);
    }
}
