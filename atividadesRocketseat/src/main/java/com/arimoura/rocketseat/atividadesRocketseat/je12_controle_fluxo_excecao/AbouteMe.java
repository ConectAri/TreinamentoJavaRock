package com.arimoura.rocketseat.atividadesRocketseat.je12_controle_fluxo_excecao;

import org.springframework.http.converter.json.GsonBuilderUtils;
import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AbouteMe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();
        System.out.println("Digite sua idade ");
        int idade = 0;
        try {
           idade = scanner.nextInt();

        }catch (InputMismatchException e){
            System.out.println(" A idade deve ser digitada no padrão numérico");

        }

        System.out.println("Digite sua altura");
        double altura = 0;
        try {
            altura = scanner.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("A altura deve ser digitada no padrão Americano 0.00 ");
        }



        //Imprimindo dados obtidos pelo usuário:

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm " );
        scanner.close();




    }

}
