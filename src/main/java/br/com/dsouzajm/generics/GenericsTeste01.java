package br.com.dsouzajm.generics;

import br.com.dsouzajm.generics.model.Barco;
import br.com.dsouzajm.generics.model.Carro;
import br.com.dsouzajm.generics.service.AluguelGenericoService;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste01 {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>(List.of(new Carro("Fusca"), new Carro("Opala")));
        List<Barco> listaBarcos = new ArrayList<>(List.of(new Barco("Iate"), new Barco("Caiaque")));
        
        AluguelGenericoService<Carro> carrosGenericoService = new AluguelGenericoService(listaCarros);
        Carro carro = carrosGenericoService.buscarObjetoDisponivel();
        System.out.println(carro);
        carrosGenericoService.retornarBarcoAlugado(carro);

        AluguelGenericoService<Barco> barcosGenericoService = new AluguelGenericoService(listaBarcos);
        Barco barco = barcosGenericoService.buscarObjetoDisponivel();
        System.out.println(barco);
        barcosGenericoService.retornarBarcoAlugado(barco);
    }
}