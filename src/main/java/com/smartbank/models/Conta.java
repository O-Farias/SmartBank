package com.smartbank.models;

import java.util.ArrayList;

public abstract class Conta {
    private String numero;
    private String titular;
    protected double saldo; 
    private ArrayList<String> historico; 

    public Conta(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historico = new ArrayList<>(); 
        adicionarAoHistorico("Conta criada com saldo inicial: R$ " + saldoInicial);
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            adicionarAoHistorico("Depósito realizado: R$ " + valor);
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            adicionarAoHistorico("Saque realizado: R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            adicionarAoHistorico("Transferência de R$ " + valor + " para a conta: " + destino.getNumero());
        } else {
            System.out.println("Transferência falhou: Saldo insuficiente ou valor inválido.");
        }
    }

    
    public abstract void aplicarRendimento();

    
    private void adicionarAoHistorico(String transacao) {
        historico.add(transacao);
    }

    
    public void exibirHistorico() {
        System.out.println("\n=== Histórico da Conta " + numero + " ===");
        if (historico.isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
        } else {
            for (String transacao : historico) {
                System.out.println(transacao);
            }
        }
    }
}
