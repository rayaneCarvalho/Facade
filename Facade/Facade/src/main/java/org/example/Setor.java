package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Cliente> clientesComPendencia = new ArrayList<>();

    public void addClientePendente(Cliente cliente) {
        this.clientesComPendencia.add(cliente);
    }

    public boolean verificarClienteComPendencia(Cliente cliente) {
        return this.clientesComPendencia.contains(cliente);
    }
}
