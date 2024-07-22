package com.arimoura.rocketseat.atividadesRocketseat.horaDaVerdade_01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private int numeroConta;
    private int numeroAgencia;
    private String nomeCliente;
    private LocalDate dataNascimento;
    private double saldoConta;
    boolean contaAtiva;

    boolean ativo = true;
    private List<Transacao> extrato;
    private String senha;

    public ContaCorrente(int numeroConta, int numeroAgencia, String nomeCliente, LocalDate dataNascimento, double saldoConta, String senha) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nomeCliente = nomeCliente;
        this.dataNascimento = dataNascimento;
        this.saldoConta = saldoConta;
        this.contaAtiva = true;
        this.extrato = new ArrayList<>();
        this.senha = senha;
    }

    public void sacar(Double valorSolicitado) {
        if (valorSolicitado <= saldoConta) {
            saldoConta -= valorSolicitado;
            extrato.add(new Transacao(LocalDate.now(), "Saque: " + valorSolicitado
            ));
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void transferir(ContaCorrente contaDestino, Double valorTransf) {
        if (valorTransf <= saldoConta) {
            saldoConta -= valorTransf;
            contaDestino.saldoConta += valorTransf;
            extrato.add(new Transacao(LocalDate.now(), "Transferência para conta " + contaDestino.numeroConta + ": " + valorTransf));
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public void cancelarConta(String justificativa, String number) {
        if (this.senha.equals(senha)) {
            contaAtiva = false;
            extrato.add(new Transacao(LocalDate.now(), "Conta cancelada. Justificativa: " + justificativa));
        } else {
            System.out.println("Senha incorreta. Não foi possível cancelar a conta.");
        }
    }

    public List<String> consultarExtrato(LocalDate dataInicio, LocalDate dataFim) {
        List<String> extratoPeriodo = new ArrayList<>();
        System.out.println("Extrato de " + dataInicio + " a " + dataFim + " : ");
        for (Transacao transacao : extrato) {
            if (!transacao.getData().isBefore(dataInicio) && !transacao.getData().isAfter(dataFim)) {
                extratoPeriodo.add(transacao.getDescricao());
            }
        }
        return extratoPeriodo;
    }
    Double consultarSaldo() {
        return saldoConta;
    }
}
