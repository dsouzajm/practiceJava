package br.com.dsouzajm.patterns.creation.factory.model;

import br.com.dsouzajm.patterns.creation.factory.Currency;

public class Real implements Currency {
    private String symbol;
    public Real(String symbol) {
        this.symbol = symbol;
    }
    @Override
    public Currency interchange() {
        return new Real("R$");
    }
    @Override
    public String toString() {
        return "Real{" +
                "symbol='" + symbol + '\'' +
                '}';
    }
}
