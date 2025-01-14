package com.smartbank.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void testDepositar() {
        ContaCorrente conta = new ContaCorrente("001", "Teste", 1000, 500);
        conta.depositar(500);
        assertEquals(1500, conta.getSaldo(), "O saldo deveria ser atualizado após o depósito.");
    }

    @Test
    void testSacar() {
        ContaCorrente conta = new ContaCorrente("001", "Teste", 1000, 500);
        conta.sacar(200);
        assertEquals(800, conta.getSaldo(), "O saldo deveria ser reduzido após o saque.");
    }

    @Test
    void testTransferir() {
        ContaCorrente conta1 = new ContaCorrente("001", "Teste1", 1000, 500);
        ContaCorrente conta2 = new ContaCorrente("002", "Teste2", 500, 500);
        conta1.transferir(conta2, 300);
        assertEquals(700, conta1.getSaldo(), "O saldo da conta1 deveria ser reduzido após a transferência.");
        assertEquals(800, conta2.getSaldo(), "O saldo da conta2 deveria ser aumentado após a transferência.");
    }
}
