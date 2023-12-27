package com.edsonrego.conta;

public class Conta {
    String titular;
    String numeroDaConta;
    double saldo;

    public Conta(String titular, String numeroDaConta, double saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }
}
