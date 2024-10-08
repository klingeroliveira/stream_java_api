package functional_interface.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo1 {

    /**
     * BinaryOperator<T>
     * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
     * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        BinaryOperator<Integer> soma = (n1, n2) -> n1 + n2;

        int resultado = numeros.stream()
                .reduce(0, soma);

        int resultado2 = numeros.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer n1, Integer n2) {
                        return n1 + n2;
                    }
                });

        // n1 + n2 = Integer::sum
        int resultado3 = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
}
