package br.com.dsouzajm.generics;

import br.com.dsouzajm.generics.model.Animal;
import br.com.dsouzajm.generics.model.Cachorro;
import br.com.dsouzajm.generics.model.Gato;

import java.util.List;

public class WildCardsTeste02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        //printConsulta(cachorros); Erro pois o método requer a super classe Animal
    }
    private static void printConsulta(List<Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
        //nao permite adicionar elementos na lista
        animals.add(new Cachorro());
    }
}
