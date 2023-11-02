package br.com.dsouzajm.patterns.creation.builder.model;

public class Person {
    private String name;
    private int idade;
    private String sexo;

    private Person(String name, int idade, String sexo) {
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public Person name(String name) {
        this.name = name;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Person idade(int idade) {
        this.idade = idade;
        return this;
    }

    public String getSexo() {
        return sexo;
    }

    public Person sexo(String sexo) {
        this.sexo = sexo;
        return this;
    }

    public Person build(){
        return this;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public final static class PersonBuilder {
        private String name;
        private int idade;
        private String sexo;
        private PersonBuilder(){}
        public static PersonBuilder builder(){
            return new PersonBuilder();
        }
        public PersonBuilder name(String name){
            this.name = name;
            return this;
        }
        public PersonBuilder idade(int idade){
            this.idade = idade;
            return this;
        }
        public PersonBuilder sexo(String sexo){
            this.sexo = sexo;
            return this;
        }
        public Person build(){
            return new Person(this.name, this.idade, this.sexo);
        }
    }
}
