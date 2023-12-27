package com.edsonrego.conta;

import com.edsonrego.conta.Conta;

public class TesteConta {
    public static void main(String[] args) {

        Conta contaDaMaria = new Conta("Maria", "123", 100.0);

        Conta contaDoJose = new Conta("Jose", "456", 30.0);

        sacar(20.0, contaDaMaria);

        transferir(35.0, contaDaMaria, contaDoJose);

        pagar(55.0, contaDaMaria);

        System.out.println(contaDaMaria.saldo);
    }

    public static void sacar(double valor, Conta conta) {
        if (conta.saldo > valor) {
            conta.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    public static void transferir(double valor, Conta contaOrigem, Conta contaDestino) {
        if (contaOrigem.saldo > valor) {
            contaOrigem.saldo -= valor;
            contaDestino.saldo += valor;
        } else {
            System.out.println("Saldo insuficiente para transferencia!");
        }
    }

    public static void pagar(double valor, Conta conta) {
        if (conta.saldo > conta.saldo) {
            conta.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para pagamento!");
        }
    }
}