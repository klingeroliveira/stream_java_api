package functional_interface.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo1 {

    /**
     * Consumer<T>
     * Aceita um argumento do tipo T e não retorna nenhum resultado.
     * É utilizada principalmente para realizar ações nos elementos do Stream sem modificar ou retornar um valor.
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //forEach recebe um consumer (classe anônima), new Consumer para implementação automática
        numeros.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer numero) {
                if (numero % 2 == 0) {
                    System.out.println(numero);
                }
            }
        });

        //refatorando para lambda
        numeros.forEach(numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        });

        //Consumer com expressão lambda será utilizado no stream do list
        //numero será a variável do meu forEach
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //forEach do list consumindo o Consumer
        numeros.forEach(imprimirNumeroPar);
    }
}
