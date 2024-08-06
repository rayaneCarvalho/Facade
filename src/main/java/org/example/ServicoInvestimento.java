package org.example;

public class ServicoInvestimento extends Servico {

    private static ServicoInvestimento setorAtendimento = new ServicoInvestimento();

    private ServicoInvestimento() {}

    public static ServicoInvestimento getInstancia() {
        return setorAtendimento;
    }
}

