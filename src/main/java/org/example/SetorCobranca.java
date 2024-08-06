package org.example;

import java.util.ArrayList;
import java.util.List;

public class SetorCobranca extends Setor {

    private static SetorCobranca setorCobranca = new SetorCobranca();

    private SetorCobranca() {}

    public static SetorCobranca getInstancia() {
        return setorCobranca;
    }
}

