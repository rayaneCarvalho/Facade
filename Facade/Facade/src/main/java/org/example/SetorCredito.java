package org.example;

public class SetorCredito extends Setor {

    private static SetorCredito setorCredito = new SetorCredito();

    private SetorCredito() {}

    public static SetorCredito getInstancia() {
        return setorCredito;
    }
}

