package functional_interface.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 17 - Filtrar os números primos da lista:
public class Desafio17 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        numeros.removeIf(n -> {
            int count = 0;

            for (int i = 1; i <= n; i++) {

                if (n % i == 0) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
            }

            return count != 2;
        });

        numeros.forEach(System.out::println);

    }
}