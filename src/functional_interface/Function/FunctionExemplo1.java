package functional_interface.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemplo1 {

    /**
     * Function<T, R>
     * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
     * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //function para multiplicar número, recebe um tipo Integer e retorna um Integer
        Function<Integer, Integer> dobrar = num -> num * 2;

        //function passada no map para transformar o valor recebido
        List<Integer> numerosDobrados = numeros
                .stream()
                .map(dobrar)
                .toList();

        numerosDobrados.forEach(System.out::println);

        //function como classe anônima no map
        List<Integer> numerosDobrados2 = numeros
                .stream()
                .map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer n) {
                        return n % 2 == 0 ? n * 2 : n;
                    }
                })
                .toList();

        numerosDobrados2.forEach(System.out::println);

        //function como expressão lambda no map
        List<Integer> numerosDobrados3 = numeros
                .stream()
                .map(n -> n % 2 == 0 ? n * 2 : n)
                .toList();

        numerosDobrados3.forEach(System.out::println);
    }
}
