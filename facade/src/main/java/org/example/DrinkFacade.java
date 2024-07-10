package org.example;

import java.util.Arrays;

public class DrinkFacade {
    public Drink createMargarita() {
        return new DrinkBuilder()
                .setCodigo(1)
                .setNome("Margarita")
                .setIngredientes(Arrays.asList("Tequila", "Suco de Limão", "Licor"))
                .setPreco(12.50)
                .setTeorAlcoolico(40.0)
                .setCategoria("Drink")
                .setCalorias(200)
                .setDescricao("Um refrescante drink com tequila, suco de limão e licor.")
                .setDisponivel(true)
                .build();
    }

    public Drink createMojito() {
        return new DrinkBuilder()
                .setCodigo(2)
                .setNome("Mojito")
                .setIngredientes(Arrays.asList("Rum Branco", "Açúcar", "Suco de Limão", "Água com Gás", "Hortelã"))
                .setPreco(10.00)
                .setTeorAlcoolico(20.0)
                .setCategoria("Drink")
                .setCalorias(150)
                .setDescricao("Um drink cubano feito com rum branco, açúcar, suco de limão, água com gás e hortelã.")
                .setDisponivel(true)
                .build();
    }

    public Drink createPinaColada() {
        return new DrinkBuilder()
                .setCodigo(3)
                .setNome("Pina Colada sem Álcool")
                .setIngredientes(Arrays.asList("Suco de Abacaxi", "Creme de Coco"))
                .setPreco(8.00)
                .setTeorAlcoolico(0.0)
                .setCategoria("Drink")
                .setCalorias(300)
                .setDescricao("Uma versão sem álcool da clássica Pina Colada.")
                .setDisponivel(true)
                .build();
    }
}
