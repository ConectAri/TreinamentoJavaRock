package com.arimoura.rocketseat.atividadesRocketseat.je12_controle_fluxo_excecao;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;

public class ExemploExcecao2 {
    public static void main(String[] args) {
        try {
            DecimalFormat df = new DecimalFormat();
            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
            symbols.setDecimalSeparator(',');
            symbols.setGroupingSeparator('.');
            df.setDecimalFormatSymbols(symbols);
            Number num = df.parse("2.302,52");

            System.out.println(num);

        }catch (ParseException e){
            System.out.println("Numero inválido");

        }
    }
}
