package com.arimoura.rocketseat.atividadesRocketseat.je05_tipos_wrappers;

public class TiposWrappersComparativosFalsos {

    public static void main(String[] args) {

        Integer obj1 = Integer.valueOf("101");
        Integer obj2 = Integer.valueOf("100");

        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.compareTo(obj2));
    }
}
