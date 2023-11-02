package br.com.dsouzajm.patterns.creation.factory;

import br.com.dsouzajm.patterns.creation.factory.model.Dollar;
import br.com.dsouzajm.patterns.creation.factory.model.Country;
import br.com.dsouzajm.patterns.creation.factory.model.Real;

public class CurrencyFactory {
    public static Currency factory(Country pais){
        if(pais.equals(Country.BRAZIL)){
            return new Real("R$");
        } else {
            return new Dollar("US$");
        }
    }
}
