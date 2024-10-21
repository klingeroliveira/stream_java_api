package functional_interface.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:

public class Desafio19 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 14, 13, 16, 17, 18, 19, 20, 21));

        List<Integer> div3e5 = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .toList();

        System.out.println("Divisiveis por 3 e 5: ");
        div3e5.forEach(System.out::println);
    }
}

