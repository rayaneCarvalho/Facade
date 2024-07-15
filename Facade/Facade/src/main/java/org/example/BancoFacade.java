package org.example;

public class BancoFacade {

    public static boolean verificarPendenciasEmprestimo(Cliente cliente) {
        if (SetorCredito.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (SetorCobranca.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (SetorAtendimento.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}
