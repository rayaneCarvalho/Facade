package org.example;

import java.util.List;

public class DrinkBuilder {

    private Drink drink;

    public DrinkBuilder() {
        drink = new Drink();
    }

    public Drink build() {
        if (drink.getCodigo() == 0) {
            throw new IllegalArgumentException("Código do drink inválido");
        }
        if (drink.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return drink;
    }

    public DrinkBuilder setCodigo(int codigo) {
        drink.setCodigo(codigo);
        return this;
    }

    public DrinkBuilder setNome(String nome) {
        drink.setNome(nome);
        return this;
    }

    public DrinkBuilder setIngredientes(List<String> ingredientes) {
        drink.setIngredientes(ingredientes);
        return this;
    }

    public DrinkBuilder setPreco(double preco) {
        drink.setPreco(preco);
        return this;
    }

    public DrinkBuilder setTeorAlcoolico(double teorAlcoolico) {
        drink.setTeorAlcoolico(teorAlcoolico);
        return this;
    }

    public DrinkBuilder setCategoria(String categoria) {
        drink.setCategoria(categoria);
        return this;
    }

    public DrinkBuilder setCalorias(int calorias) {
        drink.setCalorias(calorias);
        return this;
    }

    public DrinkBuilder setDescricao(String descricao) {
        drink.setDescricao(descricao);
        return this;
    }

    public DrinkBuilder setDisponivel(boolean disponivel) {
        drink.setDisponivel(disponivel);
        return this;
    }
}
