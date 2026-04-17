package br.com.pedidos.service;

public interface Pagamento {
    void processarPagamento(double valor);
    String getTipo();
}