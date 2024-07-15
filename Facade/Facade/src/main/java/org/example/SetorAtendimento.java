package org.example;

import java.util.ArrayList;
import java.util.List;

public class SetorAtendimento extends Setor {

    private static SetorAtendimento setorAtendimento = new SetorAtendimento();

    private SetorAtendimento() {}

    public static SetorAtendimento getInstancia() {
        return setorAtendimento;
    }
}

