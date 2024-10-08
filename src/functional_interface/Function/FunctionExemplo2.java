package functional_interface.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemplo2 {

    /**
     * Function<T, R>
     * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
     * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //function como classe anônima
        Function<Integer, Integer> dobrar = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer num) {
                return num * 2;
            }
        };

        List<Integer> numerosDobrados = new ArrayList<>();

        //utilizando método apply da function para dobrar o número
        for (Integer numero : numeros) {
            numerosDobrados.add(dobrar.apply(numero));
        }

        for (Integer numero : numerosDobrados) {
            System.out.println(numero);
        }
    }
}
