package com.edsonrego.conta;

import com.edsonrego.conta.Conta;

public class TesteConta {
    public static void main(String[] args) {

        Conta contaDaMaria = new Conta("Maria", "123", 100.00);

        sacar(20, contaDaMaria);

        System.out.println(contaDaMaria.saldo);
        
    }

    public static void sacar(double valor, Conta conta){
        conta.saldo -= valor;
    }
}