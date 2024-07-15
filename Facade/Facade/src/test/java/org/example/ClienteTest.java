package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void deveRetornarPendenciaSetorCreditoEmprestimo() {
        Cliente cliente = new Cliente();
        SetorCredito.getInstancia().addClientePendente(cliente);

        assertFalse(cliente.solicitarEmprestimo());
    }

    @Test
    void deveRetornarPendenciaSetorCobrancaEmprestimo() {
        Cliente cliente = new Cliente();
        SetorCobranca.getInstancia().addClientePendente(cliente);

        assertFalse(cliente.solicitarEmprestimo());
    }

    @Test
    void deveRetornarPendenciaSetorAtendimentoEmprestimo() {
        Cliente cliente = new Cliente();
        SetorAtendimento.getInstancia().addClientePendente(cliente);

        assertFalse(cliente.solicitarEmprestimo());
    }

    @Test
    void deveRetornarClienteSemPendenciaEmprestimo() {
        Cliente cliente = new Cliente();

        assertTrue(cliente.solicitarEmprestimo());
    }
}
