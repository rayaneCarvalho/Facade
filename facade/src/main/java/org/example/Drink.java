package org.example;

import java.util.List;

public class Drink {
    private int codigo;
    private String nome;
    private List<String> ingredientes;
    private double preco;
    private double teorAlcoolico;
    private String categoria;
    private int calorias;
    private String descricao;
    private boolean disponivel;

    public Drink() {
        this.nome = "";
        this.codigo = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", ingredientes=" + ingredientes +
                ", preco=" + preco +
                ", teorAlcoolico=" + teorAlcoolico +
                ", categoria='" + categoria + '\'' +
                ", calorias=" + calorias +
                ", descricao='" + descricao + '\'' +
                ", disponivel=" + disponivel +
                '}';
    }
}
