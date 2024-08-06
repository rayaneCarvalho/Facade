package org.example;

public class ServicoCobranca extends Servico {

    private static ServicoCobranca setorCobranca = new ServicoCobranca();

    private ServicoCobranca() {}

    public static ServicoCobranca getInstancia() {
        return setorCobranca;
    }
}

