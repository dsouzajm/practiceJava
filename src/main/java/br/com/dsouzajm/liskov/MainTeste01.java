package br.com.dsouzajm.liskov;

import br.com.dsouzajm.liskov.model.Animal;
import br.com.dsouzajm.liskov.model.Cachorro;

public class MainTeste01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        jogarNoLago(animal);
    }
    public static void jogarNoLago(Animal animal){
        animal.nadar();
    }
}
