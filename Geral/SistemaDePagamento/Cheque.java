package Geral.SistemaDePagamento;

public class Cheque extends Pagamento{
    private String numCheque;
    private String banco;

    public Cheque(float quantia, String data, String numCheque, String banco) {
        this.quantia = quantia;
        this.data = data;
        this.numCheque = numCheque;
        this.banco = banco;
    }

    @Override
    public void efetuar_pagamento() {
        System.out.println("Pagamento de " + quantia + " foi efetuado na data " + data + " no cheque de numero " + numCheque + " do banco "  + banco + ".");
    }
}
