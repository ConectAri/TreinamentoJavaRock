package com.arimoura.rocketseat.atividadesRocketseat.je09_excecoes;

public class EstadoValidateException extends RuntimeException {

    public EstadoValidateException(){
        super("O Estado não foi localizado" );
    }


}
