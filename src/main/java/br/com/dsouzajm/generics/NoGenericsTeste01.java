package br.com.dsouzajm.generics;

import br.com.dsouzajm.generics.model.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class NoGenericsTeste01 {
    public static void main(String[] args) {
        //Uso de lista sem generics
        List list = new ArrayList();
        list.add("Teste1");
        list.add(123L);
        list.add(new Pessoa("223.090.234-65", "Daniel"));
        System.out.println(list);
        for (Object o : list) {
            System.out.println(o);
        }

        List<String> list2 = new ArrayList<>();
        list2.add("Teste01");
        list2.add("Teste02");
        for (String s : list2) {
            System.out.println(s);
        }
        add(list2, new Pessoa("223.090.234-65", "Daniel"));
        for (Object o : list2) {
            System.out.println(o);
        }
    }
    //generics valida o tipo em tempo de compilacao
    private static void add(List list, Pessoa pessoa){
        list.add(pessoa);
    }
}
