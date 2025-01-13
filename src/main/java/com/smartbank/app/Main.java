package com.smartbank.app;

import com.smartbank.models.*;

public class Main {
    public static void main(String[] args) {
        // Criando contas de diferentes tipos
        ContaCorrente contaCorrente = new ContaCorrente("001", "Mateus", 1000, 500);
        ContaPoupanca contaPoupanca = new ContaPoupanca("002", "João", 2000, 0.02);
        ContaInvestimento contaInvestimento = new ContaInvestimento("003", "Ana", 5000, 0.05, 20);

        // Exibindo os saldos iniciais
        System.out.println("Saldo inicial Conta Corrente: R$ " + contaCorrente.getSaldo());
        System.out.println("Saldo inicial Conta Poupança: R$ " + contaPoupanca.getSaldo());
        System.out.println("Saldo inicial Conta Investimento: R$ " + contaInvestimento.getSaldo());

        // Testando operações de saque
        System.out.println("\nSaque de R$ 1200 na Conta Corrente...");
        contaCorrente.sacar(1200);

        // Aplicando rendimentos nas contas
        System.out.println("\nAplicando rendimento na Conta Poupança...");
        contaPoupanca.aplicarRendimento();

        System.out.println("\nAplicando rendimento na Conta Investimento...");
        contaInvestimento.aplicarRendimento();

        // Exibindo os saldos finais
        System.out.println("\nSaldo final Conta Corrente: R$ " + contaCorrente.getSaldo());
        System.out.println("Saldo final Conta Poupança: R$ " + contaPoupanca.getSaldo());
        System.out.println("Saldo final Conta Investimento: R$ " + contaInvestimento.getSaldo());
    }
}
