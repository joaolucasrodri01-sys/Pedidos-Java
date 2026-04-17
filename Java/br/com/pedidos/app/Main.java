package br.com.pedidos.app;

import br.com.pedidos.model.Cliente;
import br.com.pedidos.model.Restaurante;
import br.com.pedidos.service.Pagamento;
import br.com.pedidos.service.PagamentoPix;
import br.com.pedidos.service.SistemaDelivery;
// Se tiver o PagamentoCartao, importe-o também

public class Main {

    public static void main(String[] args) {
        // Instanciando modelos
        Restaurante r1 = new Restaurante("Santé Varanda", "Pizza");
        Cliente c1 = new Cliente("João Lucas", "35992446220");

        // Instanciando o serviço
        SistemaDelivery sistema = new SistemaDelivery();

        // Criando a forma de pagamento
        Pagamento pix = new PagamentoPix();

        // Executando a lógica
        sistema.criarPedido(c1, r1, 59.90, pix);
    }
}