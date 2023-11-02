package br.com.dsouzajm.generics;

import br.com.dsouzajm.generics.model.Animal;
import br.com.dsouzajm.generics.model.Cachorro;
import br.com.dsouzajm.generics.model.Gato;
import br.com.dsouzajm.generics.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class WildCardsTeste01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        System.out.println("----------");
        printConsulta(cachorros);
        System.out.println("----------");
        printConsulta(gatos);
        Animal[] animals = {new Gato(), new Cachorro()};
        Animal animal = new Gato();
        System.out.println("----------");
        printConsulta(animals);
    }
    //usando polimorfismo em arrays
    private static void printConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
//        animals[1] = new Gato();
    }
}
