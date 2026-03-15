package Geral.SistemaDePagamento;

public abstract class Pagamento {
    protected float quantia;
    protected String data;

    public abstract void efetuar_pagamento();
}