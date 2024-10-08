package functional_interface.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo2 {

    /**
     * BinaryOperator<T>
     * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
     * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        BinaryOperator<Integer> soma = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer n1, Integer n2) {
                return n1 + n2;
            }
        };

        int resultado = numeros.stream().reduce(0, soma);

        System.out.println(resultado);
    }
}
