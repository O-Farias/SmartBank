package com.smartbank.models;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, String titular, double saldoInicial, double taxaRendimento) {
        super(numero, titular, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
        System.out.println("Rendimento aplicado! Novo saldo: R$ " + saldo);
    }
}
