package functional_interface.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//Desafio 18 - Verifique se todos os números da lista são iguais:
public class Desafio18 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 2));

        //pega o primeiro número da lista e compara com os demais
        boolean todosIguais = numeros.isEmpty()
                || numeros.stream().allMatch(numero -> Objects.equals(numeros.get(0), numero));

        System.out.println(todosIguais);
    }
}
