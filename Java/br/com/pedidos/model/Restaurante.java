package br.com.pedidos.model;

public class Restaurante {
    private String nome;
    private String categoria;

    public Restaurante(String nome, String categoria) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }
}