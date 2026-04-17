package br.com.pedidos.model;

import br.com.pedidos.service.Pagamento;

public class Pedido {

    private Cliente cliente;
    private Restaurante restaurante;
    private double valor;
    private Pagamento pagamento;

    public Pedido(Cliente cliente, Restaurante restaurante, double valor, Pagamento pagamento) {

        if (cliente == null || restaurante == null || pagamento == null) {
            throw new IllegalArgumentException("Dados inválidos");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }

        this.cliente = cliente;
        this.restaurante = restaurante;
        this.valor = valor;
        this.pagamento = pagamento;
    }

    public void finalizarPedido() {

    System.out.println("\n--- NOVO PEDIDO ---");

    System.out.println("Cliente: " + cliente.getNome());
    System.out.println("Restaurante: " + restaurante.getNome());

    System.out.println("Tempo estimado: 1h - 1h30");

    pagamento.processarPagamento(valor);

    System.out.printf("Valor total: R$ %.2f%n", valor);

    System.out.println("Pedido finalizado com sucesso!");
}
 }