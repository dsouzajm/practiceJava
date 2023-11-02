package br.com.dsouzajm.generics.model;

public class Pessoa {
    private String cpf;
    private String name;
    public Pessoa(String cpf, String name){
        this.cpf = cpf;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + name + '\'' +
                '}';
    }
}
