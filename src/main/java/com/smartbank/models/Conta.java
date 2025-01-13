package com.smartbank.models;

public abstract class Conta {
    private String numero;
    private String titular;
    protected double saldo; 

    public Conta(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
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
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso para a conta: " + destino.getNumero());
        } else {
            System.out.println("Transferência falhou: Saldo insuficiente ou valor inválido.");
        }
    }

    // Método abstrato para rendimento
    public abstract void aplicarRendimento();
}
