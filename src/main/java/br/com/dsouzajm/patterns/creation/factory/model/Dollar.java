package br.com.dsouzajm.patterns.creation.factory.model;

import br.com.dsouzajm.patterns.creation.factory.Currency;

public class Dollar implements Currency {
    private String symbol;
    public Dollar(String symbol) {
        this.symbol = symbol;
    }
    @Override
    public Currency interchange() {
        return new Dollar("U$$");
    }
    @Override
    public String toString() {
        return "Dollar{" +
                "symbol='" + symbol + '\'' +
                '}';
    }
}