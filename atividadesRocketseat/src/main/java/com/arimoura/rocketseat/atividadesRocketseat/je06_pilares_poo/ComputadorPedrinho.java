package com.arimoura.rocketseat.atividadesRocketseat.je06_pilares_poo;

public class ComputadorPedrinho {

    public static void main(String[] args) {

        MSNMessenger msnMessenger = new MSNMessenger();
        msnMessenger.enviarMensagem();
        msnMessenger.receberMensagem();
        msnMessenger.validarConectadoInternet();
        msnMessenger.salvarHistoricoMensagem();
        msnMessenger.validarConectadoInternet();

    }
}
