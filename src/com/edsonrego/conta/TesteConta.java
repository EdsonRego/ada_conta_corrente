package com.edsonrego.conta;

import com.edsonrego.conta.Conta;

public class TesteConta {
    public static void main(String[] args) {

        Conta contaDaMaria = new Conta("Maria", "123", 100.0);

        Conta contaDoJose = new Conta("Jose", "456", 30.0);

        contaDaMaria.sacar(20.0);

        contaDaMaria.transferir(35.0, contaDoJose);

        contaDaMaria.pagar(55.0);

        System.out.println(contaDaMaria.getSaldo()); // -10.0
    }
}