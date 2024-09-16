package com.arimoura.rocketseat.atividadesRocketseat.je12_controle_fluxo_excecao;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

    public static void main(String[] args) throws ParseException {

        try {

            Number valor =  NumberFormat.getInstance().parse("a1.75");

            Double vd = valor.doubleValue();

            System.out.println(vd);

        }catch (ParseException e){
            System.err.println("Numero inválido");

        }
    }

}
