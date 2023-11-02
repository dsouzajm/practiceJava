package br.com.dsouzajm.generics;

import br.com.dsouzajm.generics.model.Animal;
import br.com.dsouzajm.generics.model.Cachorro;
import br.com.dsouzajm.generics.model.Gato;
import br.com.dsouzajm.generics.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class WildCardsTeste03 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        List<Animal> animais = List.of(new Cachorro(), new Gato());
        /*List<Pessoa> pessoas = List.of(new Pessoa("223.090.234-65", "Daniel"), new Pessoa("223.090.234-65", "Daniel"));
        printConsulta(pessoas);
        System.out.println("---------------------");*/
        printConsultaAnimal(animais);
        System.out.println("---------------------");
        //printConsultaAnimal(cachorros);
        System.out.println("---------------------");
        printConsulta(cachorros);
        System.out.println("---------------------");
        printConsulta(gatos);
    }
    //Aceita todo tipo de classe que herda de Animal
    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    //Aceita todo tipo de classe de Object a Animal
    private static void printConsultaAnimal(List<? super Animal> animals){
        for (Object animal : animals) {
        }
        animals.add(new Gato());
    }    
}
