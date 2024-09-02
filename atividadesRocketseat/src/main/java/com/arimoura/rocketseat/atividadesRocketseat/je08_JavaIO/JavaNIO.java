package com.arimoura.rocketseat.atividadesRocketseat.je08_JavaIO;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNIO {

    public static void main(String[] args) {

        try {

            Path path = Paths.get("/Users/arimoura/rocket/curso-java/aula-java.txt");

            byte[] bytesArquivo = Files.readAllBytes(path);

            String conteudo = new String(bytesArquivo);
            System.out.println(conteudo);

        }catch (Exception ex){

            ex.printStackTrace();

        }

    }

}
