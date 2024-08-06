package org.example;

public class BancoFacade {

    public static boolean verificarPendenciasEmprestimo(Cliente cliente) {
        if (ServicoCobranca.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (ServicoInvestimento.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}
