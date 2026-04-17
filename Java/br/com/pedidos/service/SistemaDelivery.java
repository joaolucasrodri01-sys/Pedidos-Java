package br.com.pedidos.service;

import br.com.pedidos.model.*;

import java.util.ArrayList;
import java.util.List;

public class SistemaDelivery {

    private List<Pedido> pedidos = new ArrayList<>();

    public void criarPedido(Cliente cliente, Restaurante restaurante, double valor, Pagamento pagamento) {

        Pedido pedido = new Pedido(cliente, restaurante, valor, pagamento);

        pedidos.add(pedido);

        pedido.finalizarPedido();
    }
}