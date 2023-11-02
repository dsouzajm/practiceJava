package br.com.dsouzajm.patterns.creation.builder;

import br.com.dsouzajm.patterns.creation.builder.model.Person;

public class BuilderTest01 {
    public static void main(String[] args) {
        Person p1 = Person.PersonBuilder
                                    .builder()
                                        .name("Nome 1")
                                        .idade(31)
                                        .sexo("M")
                                    .build();
        System.out.println(p1);
        //Person person = new Person();
    }
}
