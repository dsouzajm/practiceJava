package br.com.dsouzajm.patterns.creation.builder.model;

public class Car {
    private String name;
    private String brand;
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
    private Car(String name, String brand){
        this.name = name;
        this.brand = brand;

    }
    public static class CarBuilder {
        private String name;
        private String brand;
        public static CarBuilder builder(){
            return new CarBuilder();
        }
        public CarBuilder name(String name) {
            this.name = name;
            return this;
        }
        public CarBuilder marca(String marca) {
            this.brand = marca;
            return this;
        }
        public Car build(){
            return new Car(this.name, this.brand);
        }
    }
}
