package br.com.dsouzajm.generics.service;

import br.com.dsouzajm.generics.model.Carro;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CarroAluguelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Porshe 911"), new Carro("Ferrari")));
    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carro disponivel...");
        System.out.println(carrosDisponiveis);
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(carrosDisponiveis);
    }
}
