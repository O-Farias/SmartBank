package com.smartbank.models;

public class ContaInvestimento extends Conta {
    private double taxaRendimento;
    private double taxaOperacao;

    public ContaInvestimento(String numero, String titular, double saldoInicial, double taxaRendimento, double taxaOperacao) {
        super(numero, titular, saldoInicial);
        this.taxaRendimento = taxaRendimento;
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento - taxaOperacao;
        System.out.println("Rendimento e taxa de operação aplicados! Novo saldo: R$ " + saldo);
    }
}
