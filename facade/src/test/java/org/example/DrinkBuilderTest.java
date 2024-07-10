package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DrinkBuilderTest {

    @Test
    void deveRetornarDrinkValido() {
        Drink drink = new DrinkBuilder()
                .setCodigo(1)
                .setNome("Margarita")
                .setIngredientes(Arrays.asList("Tequila", "Suco de Limão", "Cointreau"))
                .setPreco(12.50)
                .setTeorAlcoolico(40.0)
                .setCategoria("Cocktail")
                .setCalorias(200)
                .setDescricao("Um refrescante cocktail com tequila, suco de limão e Cointreau.")
                .setDisponivel(true)
                .build();

        assertNotNull(drink);
        assertEquals(1, drink.getCodigo());
        assertEquals("Margarita", drink.getNome());
        assertEquals(Arrays.asList("Tequila", "Suco de Limão", "Cointreau"), drink.getIngredientes());
        assertEquals(12.50, drink.getPreco(), 0.01);
        assertEquals(40.0, drink.getTeorAlcoolico(), 0.01);
        assertEquals("Cocktail", drink.getCategoria());
        assertEquals(200, drink.getCalorias());
        assertEquals("Um refrescante cocktail com tequila, suco de limão e Cointreau.", drink.getDescricao());
        assertTrue(drink.isDisponivel());
    }

    @Test
    void deveLancarExcecaoParaDrinkInvalidoSemCodigo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new DrinkBuilder()
                    .setNome("Margarita")
                    .setIngredientes(Arrays.asList("Tequila", "Suco de Limão", "Cointreau"))
                    .setPreco(12.50)
                    .setTeorAlcoolico(40.0)
                    .setCategoria("Cocktail")
                    .setCalorias(200)
                    .setDescricao("Um refrescante cocktail com tequila, suco de limão e Cointreau.")
                    .setDisponivel(true)
                    .build();
        });

        assertEquals("Código do drink inválido", exception.getMessage());
    }

    @Test
    void deveLancarExcecaoParaDrinkInvalidoSemNome() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new DrinkBuilder()
                    .setCodigo(1)
                    .setIngredientes(Arrays.asList("Tequila", "Suco de Limão", "Cointreau"))
                    .setPreco(12.50)
                    .setTeorAlcoolico(40.0)
                    .setCategoria("Cocktail")
                    .setCalorias(200)
                    .setDescricao("Um refrescante cocktail com tequila, suco de limão e Cointreau.")
                    .setDisponivel(true)
                    .build();
        });

        assertEquals("Nome inválido", exception.getMessage());
    }

    @Test
    void deveRetornarDrinkDisponivel() {
        Drink drink = new DrinkBuilder()
                .setCodigo(1)
                .setNome("Margarita")
                .setDisponivel(true)
                .build();

        assertTrue(drink.isDisponivel());
    }

    @Test
    void deveRetornarDrinkIndisponivel() {
        Drink drink = new DrinkBuilder()
                .setCodigo(1)
                .setNome("Margarita")
                .setDisponivel(false)
                .build();

        assertFalse(drink.isDisponivel());
    }
}
