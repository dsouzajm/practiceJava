package br.com.dsouzajm.patterns.creation.factory;

import br.com.dsouzajm.patterns.creation.factory.model.Country;

public class FactoryTest01 {
    public static void main(String[] args) {
        Currency currency1 = CurrencyFactory.factory(Country.BRAZIL);
        System.out.println(currency1);

        Currency currency2 = CurrencyFactory.factory(Country.USA);
        System.out.println(currency2);
    }
}
