package functional_interface.Consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerExemplo3 {

    /**
     * Consumer<T>
     * Aceita um argumento do tipo T e não retorna nenhum resultado.
     * É utilizada principalmente para realizar ações nos elementos do Stream sem modificar ou retornar um valor.
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //refatorando para utilizar predicate no filter()
        //predicate recebe um argumento e devolve um boolean
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
