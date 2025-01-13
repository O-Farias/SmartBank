package com.smartbank.app;

import com.smartbank.models.Cliente;
import com.smartbank.models.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Mateus", "123.456.789-00");
        Conta conta = new Conta("001", cliente.getNome(), 1000);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        conta.depositar(500);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        conta.sacar(200);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());
    }
}
