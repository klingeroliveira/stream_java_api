package functional_interface.Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 8 - Somar os dígitos de todos os números da lista:
public class Desafio8 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 13));

        int somaDigitos = numeros.stream()
                .mapToInt(pValue -> {
                    int valor = 0;
                    int tamanho = String.valueOf(pValue).length();

                    if (tamanho > 1) {
                        for (int i = 0; i < tamanho; i++) {
                            String digito = String.valueOf(String.valueOf(pValue).charAt(i));
                            valor += Integer.parseInt(digito);
                        }
                    } else {
                        valor += pValue;
                    }
                    return valor;
                })
                .reduce(0, Integer::sum);

        System.out.println(somaDigitos);
    }
}
