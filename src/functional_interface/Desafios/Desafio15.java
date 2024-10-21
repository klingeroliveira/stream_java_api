package functional_interface.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
public class Desafio15 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        boolean isNegativo = numeros.stream()
                .anyMatch(n -> n < 0);

        System.out.println("A lista " + (!isNegativo ? "não" : "") + " contém numero negativo");
    }
}
