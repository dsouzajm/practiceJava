package br.com.dsouzajm.patterns.creation.builder;

import br.com.dsouzajm.patterns.creation.builder.model.Car;

public class BuilderTest02 {
    public static void main(String[] args) {
        Car c1 = Car.CarBuilder.builder()
                                    .name("X1")
                                    .marca("BMW")
                                .build();
        System.out.println(c1);
    }
}
