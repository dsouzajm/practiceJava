package br.com.dsouzajm.generics;

import br.com.dsouzajm.generics.model.Barco;
import br.com.dsouzajm.generics.model.Carro;
import br.com.dsouzajm.generics.service.BarcoAluguelService;
import br.com.dsouzajm.generics.service.CarroAluguelService;

public class DuplicateServicesTeste01 {
    public static void main(String[] args) {
        CarroAluguelService carroAluguelService = new CarroAluguelService();
        Carro carro = carroAluguelService.buscarCarroDisponivel();
        System.out.println(carro);
        carroAluguelService.retornarCarroAlugado(carro);

        BarcoAluguelService barcoAluguelService = new BarcoAluguelService();
        Barco barco = barcoAluguelService.buscarBarcoDisponivel();
        System.out.println(barco);
        barcoAluguelService.retornarBarcoAlugado(barco);
    }
}