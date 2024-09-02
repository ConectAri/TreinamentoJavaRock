package com.arimoura.rocketseat.atividadesRocketseat.je09_excecoes;

public class ExcecoesValidandoEstado {
    public static void main(String[] args) {

        checkEstado("SP");

    }

    static void checkEstado(String nomeEstado) throws EstadoValidateException {
        if (!nomeEstado.equalsIgnoreCase("SP")) {
            throw new EstadoValidateException();
        }

        System.out.println("Bem-vindo ao (a): " + nomeEstado);
    }



}
