package com.arimoura.rocketseat.atividadesRocketseat.je05_tipos_wrappers;

//Conversao de uma cadeia maior para cadeia menor
public class TiposWrappers {

    public static void main(String[] args) {

        System.out.println("Conversao explicita ");
        double numeroDouble= 123.56;
        int numeroInt = (int) numeroDouble;//Conversao explicita
        System.out.println(numeroInt);

        System.out.println("============================================");

        System.out.println(" Conversao implícita ");
        Double d = 1000.0;
        Integer i = d.intValue(); //Conversao implícita
        System.out.println(i);

        System.out.println("============================================");

        System.out.println(" Conversao de String em número ");

        String num = "100";
        int a = Integer.parseInt(num);
        System.out.println(a); // 100

        ///TEste

    }
}
