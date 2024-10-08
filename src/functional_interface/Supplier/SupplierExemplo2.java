package functional_interface.Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExemplo2 {

    public static void main(String[] args) {

        //supplier classe anônima
        Supplier<String> saudacao = new Supplier<String>() {
            @Override
            public String get() {
                return "Olá, seja bem-vindo(a)!";
            }
        };

        List<String> listaSaudacoes = new ArrayList<>();

        //utilizando método get do supplier
        for (int i = 0; i < 5; i++) {
            listaSaudacoes.add(saudacao.get());
        }

        //imprimindo array que recebeu dados do supplier
        for (String saudacaoGerada : listaSaudacoes) {
            System.out.println(saudacaoGerada);
        }
    }
}
