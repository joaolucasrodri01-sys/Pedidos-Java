package br.com.pedidos.model;

public abstract class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public abstract String getDescricao();
}