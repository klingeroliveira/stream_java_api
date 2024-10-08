package functional_interface.Supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemplo1 {

    /**
     * Supplier<T>
     * Não aceita argumento e retorna um resultado do tipo T.
     * Usada para criar ou fornecer novos objetos de um determinado tipo.
     */

    public static void main(String[] args) {

        //gerando supplier para argumento do generate
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        //gera uma lista com 5 linhas
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        //utiliza o forEach para percorrer e imprimir a lista
        listaSaudacoes.forEach(System.out::println);

        //um supplier como classe anônima
        List<String> listaSaudacoes2 = Stream.generate(new Supplier<String>() {
                    @Override
                    public String get() {
                        return "Olá, seja bem-vindo(a)!";
                    }
                })
                .limit(5)
                .toList();

        listaSaudacoes2.forEach(System.out::println);

        //um supplier na expressão lambda
        List<String> listaSaudacoes3 = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
                .limit(5)
                .toList();

        listaSaudacoes3.forEach(System.out::println);
    }
}
