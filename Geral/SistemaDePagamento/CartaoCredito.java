package Geral.SistemaDePagamento;

public class CartaoCredito extends Pagamento{
    private String numCartao;
    private String validadeCartao;

    public CartaoCredito(float quantia, String data, String numCartao, String validadeCartao) {
        this.quantia = quantia;
        this.data = data;
        this.numCartao = numCartao;
        this.validadeCartao = validadeCartao;
    }

    @Override
    public void efetuar_pagamento() {
        System.out.println("Pagamento de " + quantia + " foi efetuado na data " + data + " no cartao de numero " + numCartao + " com validade ate " + validadeCartao + ".");
    }
}
