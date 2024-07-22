package com.arimoura.rocketseat.atividadesRocketseat.je01_sinxate_semantica;

public class Conta {

    double saldo=10.0;

    double novoSaldo = 0.0;



    public void sacar(Double valor) {
        novoSaldo = saldo - valor;
    }

    public void imprimirNovoSaldo(){

        System.out.println("Saldo R$ : " + novoSaldo);

    }
}
