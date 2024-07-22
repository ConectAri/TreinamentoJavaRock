package com.arimoura.rocketseat.atividadesRocketseat.horaDaVerdade_01;

import java.time.LocalDate;
import java.util.List;

public class RodarContaCorrente {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente(123, 456, "João", LocalDate.of(2000, 1, 1), 5000, "Senha123" );
        ContaCorrente conta2 = new ContaCorrente(789, 101, "Maria", LocalDate.of(2000, 1, 1), 2000, "Senha456");

        conta1.sacar(500.0);
        System.out.println("Saldo da conta1 após saque:  R$ " + conta1.consultarSaldo());

        conta1.transferir(conta2, 300.0);
        System.out.println("Saldo da conta1 após transferência: R$ " + conta1.consultarSaldo());
        System.out.println("Saldo da conta2 após receber transferência: R$ " + conta2.consultarSaldo());


        List<String> extratoConta1 = conta1.consultarExtrato(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31));
        System.out.println("Extrato da conta1: " + extratoConta1);

        conta2.sacar(1000.0);
        System.out.println("Saldo da conta2 após saque: R$ " + conta2.consultarSaldo());

        conta2.transferir(conta1, 500.0);
        System.out.println("Saldo da conta2 após transferência: R$ " + conta2.consultarSaldo());

        List<String> extratoConta2 = conta2.consultarExtrato(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31));
        System.out.println("Extrato da conta2: " + extratoConta2);

        conta1.cancelarConta("Motivo de cancelamento", "123456");
        System.out.println("Conta1 está ativa? " + conta1.contaAtiva);

    }
}
