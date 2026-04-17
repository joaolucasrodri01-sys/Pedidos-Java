package br.com.pedidos.service;

public class PagamentoPix implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento via PIX: R$ %.2f%n", valor);
    }

    @Override
    public String getTipo() {
        return "PIX";
    }
}