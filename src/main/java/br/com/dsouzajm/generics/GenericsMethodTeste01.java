package br.com.dsouzajm.generics;

import br.com.dsouzajm.generics.model.Barco;
import br.com.dsouzajm.generics.model.Carro;
import br.com.dsouzajm.generics.service.AluguelGenericoService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericsMethodTeste01 {
    public static void main(String[] args) {
        Carro fusca = new Carro("Fusca");
        Barco iate = new Barco("Iate");

        criarArrayListVoid(fusca);
        criarArrayListVoid(iate);

        System.out.println(criarArrayList(fusca));
        System.out.println(criarArrayList(iate));
    }

    //não retorna nada
    private static <T> void criarArrayListVoid(T t){
        List<T> list = List.of(t);
        System.out.println(list);
    }

    //retorna uma lista de acordo com o tipo de parâmetro enviado
    private static <T> List<T> criarArrayList(T t){
        List<T> list = List.of(t);
        return list;
    }
}