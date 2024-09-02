package com.arimoura.rocketseat.atividadesRocketseat.je09_excecoes;

public class Excecoes {

    public static void main(String[] args) {

        try {

            Double valor = (double) (100 / 3);
            System.out.println(valor);

    }catch (Exception ex){
        System.out.println("erro");
        ex.printStackTrace();

    }finally{
        System.out.println("Finally bloco");

         }

    }

}

