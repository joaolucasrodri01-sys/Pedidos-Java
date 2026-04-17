package br.com.pedidos.model;

public class Cliente extends Pessoa {

    public Cliente(String nome, String telefone) {
        super(nome, telefone);
    }

    @Override
    public String getDescricao() {
        return "Cliente: " + getNome();
    }
}