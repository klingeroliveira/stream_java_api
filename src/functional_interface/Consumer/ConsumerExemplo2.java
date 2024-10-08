package functional_interface.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo2 {

    /**
     * Consumer<T>
     * Aceita um argumento do tipo T e não retorna nenhum resultado.
     * É utilizada principalmente para realizar ações nos elementos do Stream sem modificar ou retornar um valor.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Consumer com classe anônima será utilizado para receber o list para impressão
        Consumer<Integer> imprimirNumeroPar = new Consumer<Integer>() {
            @Override
            public void accept(Integer numero) {
                if (numero % 2 == 0) {
                    System.out.println(numero);
                }
            }
        };

        //list passado no accept do Consumer
        for (Integer numero : numeros) {
            imprimirNumeroPar.accept(numero);
        }
    }
}
