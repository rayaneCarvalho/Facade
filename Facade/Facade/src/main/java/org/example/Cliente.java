package org.example;

public class Cliente {

    public boolean solicitarEmprestimo() {
        return BancoFacade.verificarPendenciasEmprestimo(this);
    }
}
