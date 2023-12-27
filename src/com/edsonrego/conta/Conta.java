package com.edsonrego.conta;

public class Conta {
    private String titular;
    private String numeroDaConta;
    private double saldo;

    public Conta(String titular, String numeroDaConta, double saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }
    public void sacar(double valor) {
        double novoSaldo = getSaldo() - valor;
        setSaldo(novoSaldo);
    }
    public void transferir(double valor, Conta contaDestino) {
        double novoSaldoDaContaOrigem = getSaldo() - valor;
        double novoSaldoDaContaDestino = contaDestino.getSaldo() + valor;
        setSaldo(novoSaldoDaContaOrigem);
        contaDestino.setSaldo(novoSaldoDaContaDestino);
    }
    public void pagar(double valor) {
        double novoSaldo = getSaldo() - valor;
        setSaldo(novoSaldo);
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Valor inválido!");
        }
    }
}
