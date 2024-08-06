package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void deveRetornarPendenciaSetorCobrancaEmprestimo() {
        Cliente cliente = new Cliente();
        ServicoCobranca.getInstancia().addClientePendente(cliente);

        assertFalse(cliente.solicitarEmprestimo());
    }

    @Test
    void deveRetornarPendenciaSetorAtendimentoEmprestimo() {
        Cliente cliente = new Cliente();
        ServicoInvestimento.getInstancia().addClientePendente(cliente);

        assertFalse(cliente.solicitarEmprestimo());
    }

    @Test
    void deveRetornarClienteSemPendenciaEmprestimo() {
        Cliente cliente = new Cliente();

        assertTrue(cliente.solicitarEmprestimo());
    }
}
