package com.arimoura.rocketseat.atividadesRocketseat.je08_JavaIO;

import java.io.File;
import java.io.IOException;

//Manipulacao de arquivos
public class JavaFileIO {

    public static void main(String[] args) {

        File diretorio = new File(" c:\\rocket\\curso-java");
        System.out.println("diretório existe?" + diretorio.exists());

        if (!diretorio.exists()) {
            diretorio.mkdirs();
            System.out.println(" Foi criado o diretorio");
        }


        try {
            File arquivo = new File(diretorio, "aula-java.txt");
            System.out.println(arquivo.exists());
                    arquivo.createNewFile();
            System.out.println(arquivo.exists());
        } catch (IOException e) {
//        throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}
