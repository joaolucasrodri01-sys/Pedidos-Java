package br.com.pedidos.service;

public class PagamentoCartao implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Cartão: R$ " + valor);
    }

    @Override
    public String getTipo() {
        return "Cartão";
    }
}