package com.smartbank.models;

public class ContaCorrente extends Conta {
    private double limiteCredito;

    public ContaCorrente(String numero, String titular, double saldoInicial, double limiteCredito) {
        super(numero, titular, saldoInicial);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo + limiteCredito >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo e limite insuficientes ou valor inválido!");
        }
    }

    @Override
    public void aplicarRendimento() {
        System.out.println("Conta Corrente não possui rendimento.");
    }
}
