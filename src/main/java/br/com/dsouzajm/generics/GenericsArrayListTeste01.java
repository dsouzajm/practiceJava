package br.com.dsouzajm.generics;

import br.com.dsouzajm.generics.model.Barco;
import br.com.dsouzajm.generics.model.Carro;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericsArrayListTeste01 {
    public static void main(String[] args) throws IOException {
        List<Class<String>> classes = criarArrayList1(String.class);
        System.out.println(classes);
    }
    //retorna um array de String
    private static <T> List<T> criarArrayList1(T t) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonArray = "[\"a\",\"b\",\"c\",\"d\"]";
        List<T> o = objectMapper.readValue(jsonArray, new TypeReference<List<T>>(){});
        //Object o = objectMapper.readValue(jsonArray, [T].class);
        System.out.println(jsonArray);
        System.out.println(o);
        ArrayList<T> ts = new ArrayList<>();
        for (T e: o) {
            ts.add((T)e);
        }
        return ts;
    }
}