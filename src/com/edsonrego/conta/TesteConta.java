package com.edsonrego.conta;

import com.edsonrego.conta.Conta;

public class TesteConta {
    public static void main(String[] args) {

        Conta contaDaMaria = new Conta("Maria", "123", 100.0);

        Conta contaDoJose = new Conta("Jose", "456", 30.0);

        sacar(20.0, contaDaMaria);

        transferir(35.0, contaDaMaria, contaDoJose);

        pagar(55.0, contaDaMaria);

        System.out.println(contaDaMaria.saldo); // -10.0
    }
    public static void sacar(double valor, Conta conta) {
        conta.saldo -= valor;
    }
    public static void transferir(double valor, Conta contaOrigem, Conta contaDestino) {
        contaOrigem.saldo -= valor;
        contaDestino.saldo += valor;
    }
    public static void pagar(double valor, Conta conta) {
        conta.saldo -= valor;
    }
}