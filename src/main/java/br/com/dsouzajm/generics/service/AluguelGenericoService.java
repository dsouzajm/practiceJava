package br.com.dsouzajm.generics.service;

import br.com.dsouzajm.generics.model.Barco;

import java.util.ArrayList;
import java.util.List;

public class AluguelGenericoService<T> {
    private List<T> objetosDisponiveis;

    public AluguelGenericoService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponivel...");
        System.out.println(objetosDisponiveis);
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objeto disponíveis para alugar:");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarBarcoAlugado(T t){
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar:");
        System.out.println(objetosDisponiveis);
    }
}
