package com.dioBank.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    private List<Transacao> historicoTransacoes = new ArrayList<>();

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Transacao> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    @Override
    public void sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
            adicionarTransacao(new Transacao(TipoTransacao.SAQUE, valor));
            System.out.println(String.format("Saque de %.2f realizado com sucesso!", valor));
        }
        else {
            System.out.println("Você não possui saldo suficiente!");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        adicionarTransacao(new Transacao(TipoTransacao.DEPOSITO, valor));
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            adicionarTransacao(new Transacao(TipoTransacao.TRANSFERENCIA, valor));
        }
        else {
            System.out.println("Saldo insuficiente para realizar a transferência!");
        }
    }

    public void adicionarTransacao(Transacao transacao) {
        historicoTransacoes.add(transacao);
    }

    protected void imprimirInfosComuns() {
        System.out.println(("Titular: " + this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("----------");
        System.out.println("Histórico:");
        for(Transacao transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }
    @Override
    public String toString() {
        return String.format("Conta {agencia=%d, numero=%d, saldo=%.2f, cliente=%s}",
                agencia, numero, saldo, cliente.getNome());
    }

}
