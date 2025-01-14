package com.smartbank.app;

import com.smartbank.models.*;
import java.util.ArrayList;
import java.io.Console;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        
        contas.add(new ContaCorrente("001", "Mateus", 1000, 500));
        contas.add(new ContaPoupanca("002", "João", 2000, 0.02));
        contas.add(new ContaInvestimento("003", "Ana", 5000, 0.05, 20));

        Console console = System.console();

        if (console == null) {
            System.out.println("Erro: O console não está disponível no ambiente atual.");
            System.out.println("Tente executar o programa em um terminal interativo.");
            return;
        }

        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== Menu do SmartBank ===");
            System.out.println("1. Listar todas as contas");
            System.out.println("2. Realizar um depósito");
            System.out.println("3. Realizar um saque");
            System.out.println("4. Realizar uma transferência");
            System.out.println("5. Aplicar rendimentos");
            System.out.println("6. Exibir histórico de transações");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            String entrada = console.readLine();

            int opcao;
            try {
                opcao = Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Por favor, insira um número.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Lista de Contas ===");
                    for (Conta conta : contas) {
                        System.out.println("Conta: " + conta.getNumero() + ", Titular: " + conta.getTitular() + ", Saldo: R$ " + conta.getSaldo());
                    }
                    break;

                case 2:
                    System.out.print("\nDigite o número da conta para depósito: ");
                    String numeroContaDeposito = console.readLine();
                    System.out.print("Digite o valor do depósito: ");
                    try {
                        double valorDeposito = Double.parseDouble(console.readLine().trim());
                        boolean contaEncontrada = false;
                        for (Conta conta : contas) {
                            if (conta.getNumero().equals(numeroContaDeposito)) {
                                conta.depositar(valorDeposito);
                                System.out.println("Depósito realizado! Novo saldo: R$ " + conta.getSaldo());
                                contaEncontrada = true;
                                break;
                            }
                        }
                        if (!contaEncontrada) {
                            System.out.println("Conta não encontrada!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido! Por favor, insira um número.");
                    }
                    break;

                case 3:
                    System.out.print("\nDigite o número da conta para saque: ");
                    String numeroContaSaque = console.readLine();
                    System.out.print("Digite o valor do saque: ");
                    try {
                        double valorSaque = Double.parseDouble(console.readLine().trim());
                        boolean contaEncontrada = false;
                        for (Conta conta : contas) {
                            if (conta.getNumero().equals(numeroContaSaque)) {
                                conta.sacar(valorSaque);
                                System.out.println("Saque realizado! Novo saldo: R$ " + conta.getSaldo());
                                contaEncontrada = true;
                                break;
                            }
                        }
                        if (!contaEncontrada) {
                            System.out.println("Conta não encontrada!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido! Por favor, insira um número.");
                    }
                    break;

                case 4:
                    System.out.print("\nDigite o número da conta de origem: ");
                    String numeroContaOrigem = console.readLine();
                    System.out.print("Digite o número da conta de destino: ");
                    String numeroContaDestino = console.readLine();
                    System.out.print("Digite o valor da transferência: ");
                    try {
                        double valorTransferencia = Double.parseDouble(console.readLine().trim());
                        Conta origem = null, destino = null;
                        for (Conta conta : contas) {
                            if (conta.getNumero().equals(numeroContaOrigem)) origem = conta;
                            if (conta.getNumero().equals(numeroContaDestino)) destino = conta;
                        }
                        if (origem != null && destino != null) {
                            origem.transferir(destino, valorTransferencia);
                        } else {
                            System.out.println("Contas inválidas.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido! Por favor, insira um número.");
                    }
                    break;

                case 5:
                    System.out.println("\nAplicando rendimentos nas contas...");
                    for (Conta conta : contas) {
                        conta.aplicarRendimento();
                    }
                    break;

                case 6:
                    System.out.print("\nDigite o número da conta para exibir o histórico: ");
                    String numeroContaHistorico = console.readLine();
                    boolean contaEncontrada = false;
                    for (Conta conta : contas) {
                        if (conta.getNumero().equals(numeroContaHistorico)) {
                            conta.exibirHistorico();
                            contaEncontrada = true;
                            break;
                        }
                    }
                    if (!contaEncontrada) {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                case 7:
                    System.out.println("\nSaindo do sistema...");
                    rodando = false;
                    break;

                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        }
    }
}
