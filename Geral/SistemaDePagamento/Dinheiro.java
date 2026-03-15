package Geral.SistemaDePagamento;

public class Dinheiro extends Pagamento{
    private String moeda;

    public Dinheiro(float quantia, String data, String moeda) {
        this.quantia = quantia;
        this.data = data;
        this.moeda = moeda;
    }

    @Override
    public void efetuar_pagamento() {
        System.out.println("Pagamento de " + quantia + " foi efetuado na data " + data + " com a moeda " + moeda + ".");
    }
}
