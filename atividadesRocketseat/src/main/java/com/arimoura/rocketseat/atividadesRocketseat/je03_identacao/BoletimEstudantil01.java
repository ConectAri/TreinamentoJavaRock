package com.arimoura.rocketseat.atividadesRocketseat.je03_identacao;

public class BoletimEstudantil01 {

    public static void main(String[] args) {

        int mediaFinal = 9;

        if(mediaFinal<6)
            System.out.println("REPROVADO");
        else if(mediaFinal==6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");

    }
}
