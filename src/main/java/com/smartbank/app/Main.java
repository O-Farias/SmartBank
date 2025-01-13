package com.smartbank.app;

import com.smartbank.models.Cliente;
import com.smartbank.models.Conta;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Mateus", "123.456.789-00");
        Conta conta1 = new Conta("001", cliente1.getNome(), 1000);

        Cliente cliente2 = new Cliente("João", "987.654.321-00");
        Conta conta2 = new Conta("002", cliente2.getNome(), 500);

        
        System.out.println("Saldo inicial conta1 (" + cliente1.getNome() + "): R$ " + conta1.getSaldo());
        System.out.println("Saldo inicial conta2 (" + cliente2.getNome() + "): R$ " + conta2.getSaldo());

        
        System.out.println("\nRealizando transferência de R$ 300 da conta1 para a conta2...");
        conta1.transferir(conta2, 300);

        
        System.out.println("\nSaldo após transferência conta1: R$ " + conta1.getSaldo());
        System.out.println("Saldo após transferência conta2: R$ " + conta2.getSaldo());

        
        System.out.println("\nTentando transferir R$ 1000 da conta1 para a conta2...");
        conta1.transferir(conta2, 1000);

        
        System.out.println("\nSaldo final conta1: R$ " + conta1.getSaldo());
        System.out.println("Saldo final conta2: R$ " + conta2.getSaldo());
    }
}
