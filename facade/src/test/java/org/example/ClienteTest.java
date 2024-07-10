package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class ClienteTest {

    @Test
    void deveRetornarMargarita() {
        Cliente cliente = new Cliente();
        Drink margarita = cliente.solicitarMargarita();

        assertEquals(1, margarita.getCodigo());
        assertEquals("Margarita", margarita.getNome());
        assertEquals(Arrays.asList("Tequila", "Suco de Limão", "Licor"), margarita.getIngredientes());
        assertEquals(12.50, margarita.getPreco(), 0.01);
        assertEquals(40.0, margarita.getTeorAlcoolico(), 0.01);
        assertEquals("Drink", margarita.getCategoria());
        assertEquals(200, margarita.getCalorias());
        assertEquals("Um refrescante drink com tequila, suco de limão e licor.", margarita.getDescricao());
        assertTrue(margarita.isDisponivel());
    }

    @Test
    void deveRetornarMojito() {
        Cliente cliente = new Cliente();
        Drink mojito = cliente.solicitarMojito();

        assertEquals(2, mojito.getCodigo());
        assertEquals("Mojito", mojito.getNome());
        assertEquals(Arrays.asList("Rum Branco", "Açúcar", "Suco de Limão", "Água com Gás", "Hortelã"), mojito.getIngredientes());
        assertEquals(10.00, mojito.getPreco(), 0.01);
        assertEquals(20.0, mojito.getTeorAlcoolico(), 0.01);
        assertEquals("Drink", mojito.getCategoria());
        assertEquals(150, mojito.getCalorias());
        assertEquals("Um drink cubano feito com rum branco, açúcar, suco de limão, água com gás e hortelã.", mojito.getDescricao());
        assertTrue(mojito.isDisponivel());
    }

    @Test
    void deveRetornarPinaColadaSemAlcool() {
        Cliente cliente = new Cliente();
        Drink PinaColada = cliente.solicitarPinaColadaSemAlcool();

        assertEquals(3, PinaColada.getCodigo());
        assertEquals("Pina Colada sem Álcool", PinaColada.getNome());
        assertEquals(Arrays.asList("Suco de Abacaxi", "Creme de Coco"), PinaColada.getIngredientes());
        assertEquals(8.00, PinaColada.getPreco(), 0.01);
        assertEquals(0.0, PinaColada.getTeorAlcoolico(), 0.01);
        assertEquals("Drink", PinaColada.getCategoria());
        assertEquals(300, PinaColada.getCalorias());
        assertEquals("Uma versão sem álcool da clássica Pina Colada.", PinaColada.getDescricao());
        assertTrue(PinaColada.isDisponivel());
    }
}
